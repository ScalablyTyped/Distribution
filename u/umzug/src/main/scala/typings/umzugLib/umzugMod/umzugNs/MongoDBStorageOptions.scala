package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoDBStorageOptions extends Storage {
  /**
    * The to be used Mongo collection cursor.
    * Defaults to collection created from collectionName attribute.
    */
  var collection: js.UndefOr[mongodbLib.mongodbMod.Collection[mongodbLib.Default]] = js.undefined
  /**
    * The name of the collection used by the connection.
    * Defaults to 'migrations'
    */
  var collectionName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The MongoDB database connection instance.
    */
  var connection: js.UndefOr[mongodbLib.mongodbMod.Db] = js.undefined
}

object MongoDBStorageOptions {
  @scala.inline
  def apply(
    executed: js.Function0[js.Promise[js.Array[nodeLib.String]]],
    logMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    unlogMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    collection: mongodbLib.mongodbMod.Collection[mongodbLib.Default] = null,
    collectionName: java.lang.String = null,
    connection: mongodbLib.mongodbMod.Db = null
  ): MongoDBStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executed")(executed)
    __obj.updateDynamic("logMigration")(logMigration)
    __obj.updateDynamic("unlogMigration")(unlogMigration)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    __obj.asInstanceOf[MongoDBStorageOptions]
  }
}

