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

