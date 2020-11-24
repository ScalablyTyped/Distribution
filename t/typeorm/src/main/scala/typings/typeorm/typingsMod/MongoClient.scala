package typings.typeorm.typingsMod

import typings.typeorm.anon.ChangeStreamOptionsstartA
import typings.typeorm.anon.DbName
import typings.typeorm.platformToolsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/typings", "MongoClient")
@js.native
class MongoClient protected () extends EventEmitter {
  def this(uri: String) = this()
  def this(uri: String, options: MongoClientOptions) = this()
  
  /**
    * Close the db and its underlying connections.
    * @param force Force close, emitting no events.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#close
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Close the db and its underlying connections.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#close
    */
  def close(callback: MongoCallback[Unit]): Unit = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  /**
    * Close the db and its underlying connections.
    * @param force Force close, emitting no events.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#close
    */
  def close(force: Boolean, callback: MongoCallback[Unit]): Unit = js.native
  
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    */
  def connect(): js.Promise[MongoClient] = js.native
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    */
  def connect(url: String): js.Promise[Db] = js.native
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param callback The command result callback.
    */
  def connect(url: String, callback: MongoCallback[Db]): Unit = js.native
  def connect(url: String, options: MongoClientOptions): js.Promise[Db] = js.native
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    * @param callback The command result callback.
    */
  def connect(url: String, options: MongoClientOptions, callback: MongoCallback[Db]): Unit = js.native
  
  /**
    * Create a new Db instance sharing the current socket connections. Be aware that the new db instances are
    * related in a parent-child relationship to the original instance so that events are correctly emitted on child
    * db instances. Child db instances are cached so performing db('db1') twice will return the same instance.
    * You can control these behaviors with the options noListener and returnNonCachedInstance.
    * @param dbName The name of the database we want to use. If not provided, use database name from connection string.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#db
    */
  def db(): Db = js.native
  def db(dbName: js.UndefOr[scala.Nothing], options: MongoClientCommonOption): Db = js.native
  def db(dbName: String): Db = js.native
  def db(dbName: String, options: MongoClientCommonOption): Db = js.native
  
  /**
    * Check if MongoClient is connected.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#isConnected
    */
  def isConnected(): Boolean = js.native
  def isConnected(options: MongoClientCommonOption): Boolean = js.native
  
  def logout(): js.Promise[_] = js.native
  /**
    * Logout user from server, fire off on all connections and remove all auth info.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#logout
    */
  def logout(callback: MongoCallback[_]): Unit = js.native
  def logout(options: DbName): js.Promise[_] = js.native
  def logout(options: DbName, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Starts a new session on the server.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#startSession
    */
  def startSession(): ClientSession = js.native
  def startSession(options: SessionOptions): ClientSession = js.native
  
  /**
    * Create a new Change Stream, watching for new changes (insertions, updates, replacements, deletions, and invalidations) in this cluster.
    * Will ignore all changes to system collections, as well as the local, admin, and config databases.
    * @param pipeline An array of aggregation pipeline stages through which to pass change stream documents. This allows for filtering (using $match) and manipulating the change stream documents.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#watch
    */
  def watch(): ChangeStream = js.native
  def watch(pipeline: js.UndefOr[scala.Nothing], options: ChangeStreamOptionsstartA): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptionsstartA): ChangeStream = js.native
  
  /**
    * Runs a given operation with an implicitly created session. The lifetime of the session will be handled without the need for user interaction.
    * @param operation An operation to execute with an implicitly created session. The signature of this MUST be `(session) => {}`
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession
    */
  def withSession(operation: js.Function1[/* session */ ClientSession, js.Promise[_]]): js.Promise[Unit] = js.native
  /**
    * Runs a given operation with an implicitly created session. The lifetime of the session will be handled without the need for user interaction.
    * @param options Optional settings to be appled to implicitly created session.
    * @param operation An operation to execute with an implicitly created session. The signature of this MUST be `(session) => {}`
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/MongoClient.html#withSession
    */
  def withSession(options: SessionOptions, operation: js.Function1[/* session */ ClientSession, js.Promise[_]]): js.Promise[Unit] = js.native
}
/* static members */
@JSImport("typeorm/browser/driver/mongodb/typings", "MongoClient")
@js.native
object MongoClient extends js.Object {
  
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    */
  def connect(url: String): js.Promise[Db] = js.native
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param callback The command result callback.
    */
  def connect(url: String, callback: MongoCallback[Db]): Unit = js.native
  def connect(url: String, options: MongoClientOptions): js.Promise[Db] = js.native
  /**
    * Connect to MongoDB using a url as documented at docs.mongodb.org/manual/reference/connection-string/
    * Note that for replicasets the replicaSet query parameter is required in the 2.0 driver.
    *
    * @param url The connection URI string.
    * @param options Optional settings.
    * @param callback The command result callback.
    */
  def connect(url: String, options: MongoClientOptions, callback: MongoCallback[Db]): Unit = js.native
}
