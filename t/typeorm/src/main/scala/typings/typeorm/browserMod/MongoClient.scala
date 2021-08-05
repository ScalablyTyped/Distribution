package typings.typeorm.browserMod

import typings.typeorm.typingsMod.MongoCallback
import typings.typeorm.typingsMod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "MongoClient")
@js.native
class MongoClient protected ()
  extends typings.typeorm.typingsMod.MongoClient {
  def this(uri: String) = this()
  def this(uri: String, options: MongoClientOptions) = this()
}
/* static members */
object MongoClient {
  
  @JSImport("typeorm/browser", "MongoClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    */
  inline def connect(url: String): js.Promise[typings.typeorm.typingsMod.Db] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.typeorm.typingsMod.Db]]
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param callback The command result callback.
    */
  inline def connect(url: String, callback: MongoCallback[typings.typeorm.typingsMod.Db]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connect(url: String, options: MongoClientOptions): js.Promise[typings.typeorm.typingsMod.Db] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.typeorm.typingsMod.Db]]
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    * @param callback The command result callback.
    */
  inline def connect(url: String, options: MongoClientOptions, callback: MongoCallback[typings.typeorm.typingsMod.Db]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
