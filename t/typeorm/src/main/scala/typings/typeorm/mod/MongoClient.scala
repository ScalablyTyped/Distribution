package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.MongoCallback
import typings.typeorm.mongodbTypingsMod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "MongoClient")
@js.native
class MongoClient protected ()
  extends typings.typeorm.mongodbTypingsMod.MongoClient {
  def this(uri: String) = this()
  def this(uri: String, options: MongoClientOptions) = this()
}
/* static members */
@JSImport("typeorm", "MongoClient")
@js.native
object MongoClient extends js.Object {
  
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    */
  def connect(url: String): js.Promise[typings.typeorm.mongodbTypingsMod.Db] = js.native
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param callback The command result callback.
    */
  def connect(url: String, callback: MongoCallback[typings.typeorm.mongodbTypingsMod.Db]): Unit = js.native
  def connect(url: String, options: MongoClientOptions): js.Promise[typings.typeorm.mongodbTypingsMod.Db] = js.native
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    * @param callback The command result callback.
    */
  def connect(
    url: String,
    options: MongoClientOptions,
    callback: MongoCallback[typings.typeorm.mongodbTypingsMod.Db]
  ): Unit = js.native
}
