package typings.umzug.umzugMod

import typings.mongodb.Default
import typings.mongodb.mongodbMod.Collection
import typings.mongodb.mongodbMod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoDBStorageOptions extends Storage {
  /**
    * The to be used Mongo collection cursor.
    * Defaults to collection created from collectionName attribute.
    */
  var collection: js.UndefOr[Collection[Default]] = js.undefined
  /**
    * The name of the collection used by the connection.
    * Defaults to 'migrations'
    */
  var collectionName: js.UndefOr[String] = js.undefined
  /**
    * The MongoDB database connection instance.
    */
  var connection: js.UndefOr[Db] = js.undefined
}

object MongoDBStorageOptions {
  @scala.inline
  def apply(
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit],
    collection: Collection[Default] = null,
    collectionName: String = null,
    connection: Db = null
  ): MongoDBStorageOptions = {
    val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[MongoDBStorageOptions]
  }
}

