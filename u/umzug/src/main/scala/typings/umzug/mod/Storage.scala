package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In order to keep track of already executed tasks, umzug logs successfully executed migrations.
  * This is done in order to allow rollbacks of tasks. This is the interface these `Storages` must
  * follow.
  */
@js.native
trait Storage extends js.Object {
  
  /** Gets list of executed migrations. */
  def executed(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Logs migration to be considered as executed.
    *
    * @param migrationName - Name of the migration to be logged.
    */
  def logMigration(migrationName: String): js.Promise[Unit] = js.native
  
  /**
    * Unlogs migration to be considered as pending.
    *
    * @param migrationName - Name of the migration to be unlogged.
    */
  def unlogMigration(migrationName: String): js.Promise[Unit] = js.native
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
  
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecuted(value: () => js.Promise[js.Array[String]]): Self = this.set("executed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLogMigration(value: String => js.Promise[Unit]): Self = this.set("logMigration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlogMigration(value: String => js.Promise[Unit]): Self = this.set("unlogMigration", js.Any.fromFunction1(value))
  }
}
