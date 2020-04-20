package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In order to keep track of already executed tasks, umzug logs successfully executed migrations.
  * This is done in order to allow rollbacks of tasks. This is the interface these `Storages` must
  * follow.
  */
trait Storage extends js.Object {
  /** Gets list of executed migrations. */
  def executed(): js.Promise[js.Array[String]]
  /**
    * Logs migration to be considered as executed.
    *
    * @param migrationName - Name of the migration to be logged.
    */
  def logMigration(migrationName: String): js.Promise[Unit]
  /**
    * Unlogs migration to be considered as pending.
    *
    * @param migrationName - Name of the migration to be unlogged.
    */
  def unlogMigration(migrationName: String): js.Promise[Unit]
}

object Storage {
  @scala.inline
  def apply(
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit]
  ): Storage = {
    val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    __obj.asInstanceOf[Storage]
  }
}

