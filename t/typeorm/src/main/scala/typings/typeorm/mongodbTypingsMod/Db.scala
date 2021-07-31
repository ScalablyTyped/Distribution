package typings.typeorm.mongodbTypingsMod

import typings.typeorm.anon.AuthMechanism
import typings.typeorm.anon.ChangeStreamOptionsstartABatchSize
import typings.typeorm.anon.DbName
import typings.typeorm.anon.DropTarget
import typings.typeorm.anon.W
import typings.typeorm.anon.`1`
import typings.typeorm.anon.`6`
import typings.typeorm.platformPlatformToolsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "Db")
@js.native
class Db protected () extends EventEmitter {
  def this(databaseName: String, serverConfig: Mongos) = this()
  def this(databaseName: String, serverConfig: ReplSet) = this()
  /**
    *
    * @param databaseName The name of the database this instance represents.
    * @param serverConfig The server topology for the database.
    * @param options Optional.
    */
  def this(databaseName: String, serverConfig: Server) = this()
  def this(databaseName: String, serverConfig: Mongos, options: DbCreateOptions) = this()
  def this(databaseName: String, serverConfig: ReplSet, options: DbCreateOptions) = this()
  def this(databaseName: String, serverConfig: Server, options: DbCreateOptions) = this()
  
  /**
    * Add a user to the database.
    *
    * @param username The username.
    * @param password The password.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#addUser
    */
  def addUser(username: String, password: String): js.Promise[js.Any] = js.native
  /**
    * Add a user to the database.
    *
    * @param username The username.
    * @param password The password.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#addUser
    */
  def addUser(username: String, password: String, callback: MongoCallback[js.Any]): Unit = js.native
  def addUser(username: String, password: String, options: DbAddUserOptions): js.Promise[js.Any] = js.native
  /**
    * Add a user to the database.
    *
    * @param username The username.
    * @param password The password.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#addUser
    */
  def addUser(username: String, password: String, options: DbAddUserOptions, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Return the Admin db instance.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#admin
    */
  def admin(): Admin = js.native
  
  /**
    * Authenticate a user against the server.
    *
    * @param userName The username.
    * @param password The password.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#authenticate
    */
  def authenticate(userName: String, password: String): js.Promise[js.Any] = js.native
  /**
    * Authenticate a user against the server.
    *
    * @param userName The username.
    * @param password The password.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#authenticate
    */
  def authenticate(userName: String, password: String, callback: MongoCallback[js.Any]): Unit = js.native
  def authenticate(userName: String, password: String, options: AuthMechanism): js.Promise[js.Any] = js.native
  /**
    * Authenticate a user against the server.
    *
    * @param userName The username.
    * @param password The password.
    * @param password
    * @param options
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#authenticate
    */
  def authenticate(userName: String, password: String, options: AuthMechanism, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Current bufferMaxEntries value for the database.
    */
  var bufferMaxEntries: scala.Double = js.native
  
  /**
    * Close the db and its underlying connections.
    *
    * @param forceClose Force close, emitting no events.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#close
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Close the db and its underlying connections.
    *
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#close
    */
  def close(callback: MongoCallback[Unit]): Unit = js.native
  def close(forceClose: Boolean): js.Promise[Unit] = js.native
  /**
    * Close the db and its underlying connections.
    *
    * @param forceClose Force close, emitting no events.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#close
    */
  def close(forceClose: Boolean, callback: MongoCallback[Unit]): Unit = js.native
  
  /**
    * Fetch a specific collection (containing the actual collection information). If the application does not use strict mode you can
    * can use it without a callback in the following way: var collection = db.collection('mycollection');
    *
    * @param name The collection name we wish to access.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#collection
    */
  def collection(name: String): Collection[js.Any] = js.native
  /**
    * Fetch a specific collection (containing the actual collection information). If the application does not use strict mode you can
    * can use it without a callback in the following way: var collection = db.collection('mycollection');
    *
    * @param name The collection name we wish to access.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#collection
    */
  def collection(name: String, callback: MongoCallback[Collection[js.Any]]): Collection[js.Any] = js.native
  /**
    * Fetch a specific collection (containing the actual collection information). If the application does not use strict mode you can
    * can use it without a callback in the following way: var collection = db.collection('mycollection');
    *
    * @param name The collection name we wish to access.
    * @param options Optional settings.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#collection
    */
  def collection(name: String, options: DbCollectionOptions, callback: MongoCallback[Collection[js.Any]]): Collection[js.Any] = js.native
  
  /**
    * Fetch all collections for the current db.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#collections
    */
  def collections(): js.Promise[js.Array[Collection[js.Any]]] = js.native
  /**
    * Fetch all collections for the current db.
    *
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#collections
    */
  def collections(callback: MongoCallback[js.Array[Collection[js.Any]]]): Unit = js.native
  
  /**
    * Execute a command.
    *
    * @param command The command hash.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#command
    */
  def command(command: js.Object): js.Promise[js.Any] = js.native
  /**
    * Execute a command.
    *
    * @param command The command hash.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#command
    */
  def command(command: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
  def command(command: js.Object, options: `6`): js.Promise[js.Any] = js.native
  /**
    * Execute a command.
    *
    * @param command The command hash.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#command
    */
  def command(command: js.Object, options: `6`, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Create a new collection on a server with the specified options. Use this to create capped collections.
    *
    * @param name The collection name we wish to access.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#createCollection
    */
  def createCollection(name: String): js.Promise[Collection[js.Any]] = js.native
  /**
    * Create a new collection on a server with the specified options. Use this to create capped collections.
    *
    * @param name The collection name we wish to access.
    * @param callback The results callback
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#createCollection
    */
  def createCollection(name: String, callback: MongoCallback[Collection[js.Any]]): Unit = js.native
  def createCollection(name: String, options: CollectionCreateOptions): js.Promise[Collection[js.Any]] = js.native
  /**
    * Create a new collection on a server with the specified options. Use this to create capped collections.
    *
    * @param name The collection name we wish to access.
    * @param options Optional settings.
    * @param callback The results callback
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#createCollection
    */
  def createCollection(name: String, options: CollectionCreateOptions, callback: MongoCallback[Collection[js.Any]]): Unit = js.native
  
  /**
    * Creates an index on the db and collection collection.
    *
    * @param name Name of the collection to create the index on.
    * @param fieldOrSpec Defines the index.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#createIndex
    */
  def createIndex(name: String, fieldOrSpec: String): js.Promise[js.Any] = js.native
  /**
    * Creates an index on the db and collection collection.
    *
    * @param name Name of the collection to create the index on.
    * @param fieldOrSpec Defines the index.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#createIndex
    */
  def createIndex(name: String, fieldOrSpec: String, callback: MongoCallback[js.Any]): Unit = js.native
  def createIndex(name: String, fieldOrSpec: String, options: MongodbIndexOptions): js.Promise[js.Any] = js.native
  /**
    * Creates an index on the db and collection collection.
    *
    * @param name Name of the collection to create the index on.
    * @param fieldOrSpec Defines the index.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#createIndex
    */
  def createIndex(name: String, fieldOrSpec: String, options: MongodbIndexOptions, callback: MongoCallback[js.Any]): Unit = js.native
  def createIndex(name: String, fieldOrSpec: js.Object): js.Promise[js.Any] = js.native
  def createIndex(name: String, fieldOrSpec: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
  def createIndex(name: String, fieldOrSpec: js.Object, options: MongodbIndexOptions): js.Promise[js.Any] = js.native
  def createIndex(
    name: String,
    fieldOrSpec: js.Object,
    options: MongodbIndexOptions,
    callback: MongoCallback[js.Any]
  ): Unit = js.native
  
  /**
    * The name of the database this instance represents.
    */
  var databaseName: String = js.native
  
  /**
    * Create a new Db instance sharing the current socket connections. Be aware that the new db instances are
    * related in a parent-child relationship to the original instance so that events are correctly emitted on child
    * db instances. Child db instances are cached so performing db('db1') twice will return the same instance.
    * You can control these behaviors with the options noListener and returnNonCachedInstance.
    *
    * @param dbName The name of the database we want to use.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#db
    */
  def db(dbName: String): Db = js.native
  /**
    * Create a new Db instance sharing the current socket connections. Be aware that the new db instances are
    * related in a parent-child relationship to the original instance so that events are correctly emitted on child
    * db instances. Child db instances are cached so performing db('db1') twice will return the same instance.
    * You can control these behaviors with the options noListener and returnNonCachedInstance.
    *
    * @param dbName The name of the database we want to use.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#db
    */
  def db(dbName: String, options: DbOptions): Db = js.native
  
  /**
    * Drop a collection from the database, removing it permanently. New accesses will create a new collection.
    *
    * @param name Name of collection to drop.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#dropCollection
    */
  def dropCollection(name: String): js.Promise[Boolean] = js.native
  /**
    * Drop a collection from the database, removing it permanently. New accesses will create a new collection.
    *
    * @param name Name of collection to drop.
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#dropCollection
    */
  def dropCollection(name: String, callback: MongoCallback[Boolean]): Unit = js.native
  
  /**
    * Drop a database, removing it permanently from the server.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#dropDatabase
    */
  def dropDatabase(): js.Promise[js.Any] = js.native
  /**
    * Drop a database, removing it permanently from the server.
    *
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#dropDatabase
    */
  def dropDatabase(callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Runs a command on the database as admin.
    *
    * @param command The command hash.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#executeDbAdminCommand
    */
  def executeDbAdminCommand(command: js.Object): js.Promise[js.Any] = js.native
  /**
    * Runs a command on the database as admin.
    *
    * @param command The command hash.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#executeDbAdminCommand
    */
  def executeDbAdminCommand(command: js.Object, callback: MongoCallback[js.Any]): Unit = js.native
  def executeDbAdminCommand(command: js.Object, options: ExecuteDbAdminCommandOptions): js.Promise[js.Any] = js.native
  /**
    * Runs a command on the database as admin.
    *
    * @param command The command hash.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#executeDbAdminCommand
    */
  def executeDbAdminCommand(command: js.Object, options: ExecuteDbAdminCommandOptions, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Retrieves this collections index info.
    *
    * @param name The name of the collection.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#indexInformation
    */
  def indexInformation(name: String): js.Promise[js.Any] = js.native
  /**
    * Retrieves this collections index info.
    *
    * @param name The name of the collection.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#indexInformation
    */
  def indexInformation(name: String, callback: MongoCallback[js.Any]): Unit = js.native
  def indexInformation(name: String, options: IndexInformationOptions): js.Promise[js.Any] = js.native
  /**
    * Retrieves this collections index info.
    *
    * @param name The name of the collection.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#indexInformation
    */
  def indexInformation(name: String, options: IndexInformationOptions, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Get the list of all collection information for the specified db.
    *
    * @param filter Query to filter collections by.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#listCollections
    */
  def listCollections(filter: js.Object): CommandCursor = js.native
  def listCollections(filter: js.Object, options: ListCollectionsOptions): CommandCursor = js.native
  
  /**
    * Logout user from server, fire off on all connections and remove all auth info.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#logout
    */
  def logout(): js.Promise[js.Any] = js.native
  /**
    * Logout user from server, fire off on all connections and remove all auth info.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#logout
    */
  def logout(callback: MongoCallback[js.Any]): Unit = js.native
  def logout(options: DbName): js.Promise[js.Any] = js.native
  /**
    * Logout user from server, fire off on all connections and remove all auth info.
    *
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#logout
    */
  def logout(options: DbName, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * The current value of the parameter native_parser.
    */
  var native_parser: Boolean = js.native
  
  /**
    * Open the database.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#open
    */
  def open(): js.Promise[Db] = js.native
  /**
    * Open the database
    *
    * @param callback Callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#open
    */
  def open(callback: MongoCallback[Db]): Unit = js.native
  
  /**
    * The options associated with the db instance.
    */
  var options: js.Any = js.native
  
  def removeUser(username: String): js.Promise[js.Any] = js.native
  /**
    *
    * @param username
    * @param callback
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#removeUser
    */
  def removeUser(username: String, callback: MongoCallback[js.Any]): Unit = js.native
  def removeUser(username: String, options: W): js.Promise[js.Any] = js.native
  def removeUser(username: String, options: W, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Rename a collection.
    *
    * @param fromCollection Name of current collection to rename.
    * @param toCollection New name of of the collection.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#renameCollection
    */
  def renameCollection(fromCollection: String, toCollection: String): js.Promise[Collection[js.Any]] = js.native
  /**
    * Rename a collection.
    *
    * @param fromCollection Name of current collection to rename.
    * @param toCollection New name of of the collection.
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#renameCollection
    */
  def renameCollection(fromCollection: String, toCollection: String, callback: MongoCallback[Collection[js.Any]]): Unit = js.native
  def renameCollection(fromCollection: String, toCollection: String, options: DropTarget): js.Promise[Collection[js.Any]] = js.native
  /**
    * Rename a collection.
    *
    * @param fromCollection Name of current collection to rename.
    * @param toCollection New name of of the collection.
    * @param options Optional settings.
    * @param callback The results callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#renameCollection
    */
  def renameCollection(
    fromCollection: String,
    toCollection: String,
    options: DropTarget,
    callback: MongoCallback[Collection[js.Any]]
  ): Unit = js.native
  
  /**
    * Get the current db topology.
    */
  var serverConfig: Server | ReplSet | Mongos = js.native
  
  /**
    * The current slaveOk value for the db instance.
    */
  var slaveOk: Boolean = js.native
  
  /**
    * Get all the db statistics.
    *
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#stats
    */
  def stats(): js.Promise[js.Any] = js.native
  /**
    * Get all the db statistics.
    *
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#stats
    */
  def stats(callback: MongoCallback[js.Any]): Unit = js.native
  def stats(options: `1`): js.Promise[js.Any] = js.native
  /**
    * Get all the db statistics.
    *
    * @param options Optional settings.
    * @param callback The collection result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Db.html#stats
    */
  def stats(options: `1`, callback: MongoCallback[js.Any]): Unit = js.native
  
  /**
    * Create a new Change Stream, watching for new changes (insertions, updates, replacements, deletions, and invalidations) in this database. Will ignore all changes to system collections.
    * @param pipeline An array of aggregation pipeline stages through which to pass change stream documents. This allows for filtering (using $match) and manipulating the change stream documents.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/Collection.html#watch
    */
  def watch(): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object]): ChangeStream = js.native
  def watch(pipeline: js.Array[js.Object], options: ChangeStreamOptionsstartABatchSize): ChangeStream = js.native
  def watch(pipeline: Unit, options: ChangeStreamOptionsstartABatchSize): ChangeStream = js.native
  
  /**
    * The current write concern values.
    */
  var writeConcern: WriteConcern = js.native
}
