package typings.typeorm.typingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Admin extends StObject {
  
  /**
    * Add a user to the database.
    *
    * @param username The username.
    * @param password The password.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#addUser
    */
  def addUser(username: String, password: String): js.Promise[_] = js.native
  /**
    * Add a user to the database.
    *
    * @param username The username.
    * @param password The password.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#addUser
    */
  def addUser(username: String, password: String, callback: MongoCallback[_]): Unit = js.native
  def addUser(username: String, password: String, options: AddUserOptions): js.Promise[_] = js.native
  /**
    * Add a user to the database.
    *
    * @param username The username.
    * @param password The password.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#addUser
    */
  def addUser(username: String, password: String, options: AddUserOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Authenticate a user against the server.
    *
    * @param username The username.
    * @param password The password.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#authenticate
    */
  def authenticate(username: String): js.Promise[_] = js.native
  /**
    * Authenticate a user against the server.
    *
    * @param username The username.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#authenticate
    */
  def authenticate(username: String, callback: MongoCallback[_]): Unit = js.native
  def authenticate(username: String, password: String): js.Promise[_] = js.native
  /**
    * Authenticate a user against the server.
    *
    * @param username The username.
    * @param password The password.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#authenticate
    */
  def authenticate(username: String, password: String, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Retrieve the server information for the current instance of the db client
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#buildInfo
    */
  def buildInfo(): js.Promise[_] = js.native
  /**
    * Retrieve the server information for the current instance of the db client
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#buildInfo
    */
  def buildInfo(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Execute a command.
    *
    * @param command The command hash.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#command
    */
  def command(command: js.Object): js.Promise[_] = js.native
  /**
    * Execute a command.
    *
    * @param command The command hash.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#command
    */
  def command(command: js.Object, callback: MongoCallback[_]): Unit = js.native
  def command(command: js.Object, options: CommandOptions): js.Promise[_] = js.native
  /**
    * Execute a command.
    *
    * @param command The command hash.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#command
    */
  def command(command: js.Object, options: CommandOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * List the available databases.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#listDatabases
    */
  def listDatabases(): js.Promise[_] = js.native
  /**
    * List the available databases.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#listDatabases
    */
  def listDatabases(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Logout user from server, fire off on all connections and remove all auth info.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#logout.
    */
  def logout(): js.Promise[_] = js.native
  /**
    * Logout user from server, fire off on all connections and remove all auth info.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#logout.
    */
  def logout(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Ping the MongoDB server and retrieve results.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#ping
    */
  def ping(): js.Promise[_] = js.native
  /**
    * Ping the MongoDB server and retrieve results.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#ping
    */
  def ping(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Retrive the current profiling information for MongoDB.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#profilingInfo
    */
  def profilingInfo(): js.Promise[_] = js.native
  /**
    * Retrive the current profiling information for MongoDB.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#profilingInfo
    */
  def profilingInfo(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Retrieve the current profiling Level for MongoDB.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#profilingLevel
    */
  def profilingLevel(): js.Promise[_] = js.native
  /**
    * Retrieve the current profiling Level for MongoDB.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#profilingLevel
    */
  def profilingLevel(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Remove a user from a database.
    *
    * @param username The username.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#removeUser
    */
  def removeUser(username: String): js.Promise[_] = js.native
  /**
    * Remove a user from a database.
    *
    * @param username The username.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#removeUser
    */
  def removeUser(username: String, callback: MongoCallback[_]): Unit = js.native
  def removeUser(username: String, options: FSyncOptions): js.Promise[_] = js.native
  /**
    * Remove a user from a database.
    *
    * @param username The username.
    * @param options Optional settings.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#removeUser
    */
  def removeUser(username: String, options: FSyncOptions, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Get ReplicaSet status.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#replSetGetStatus
    */
  def replSetGetStatus(): js.Promise[_] = js.native
  /**
    * Get ReplicaSet status.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#replSetGetStatus
    */
  def replSetGetStatus(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Retrieve the server information for the current
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#serverInfo
    */
  def serverInfo(): js.Promise[_] = js.native
  /**
    * instance of the db client
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#serverInfo
    * @param callback The command result callback.
    */
  def serverInfo(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Retrieve this db's server status.
    *
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#serverStatus
    */
  def serverStatus(): js.Promise[_] = js.native
  /**
    * Retrieve this db's server status.
    *
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#serverStatus
    */
  def serverStatus(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Set the current profiling level of MongoDB.
    *
    * @param level The new profiling level (off, slow_only, all).
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#setProfilingLevel
    */
  def setProfilingLevel(level: String): js.Promise[_] = js.native
  /**
    * Set the current profiling level of MongoDB.
    *
    * @param level The new profiling level (off, slow_only, all).
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#setProfilingLevel
    */
  def setProfilingLevel(level: String, callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Validate an existing collection
    *
    * @param collectionNme The name of the collection to validate.
    * @param options Optional.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#validateCollection
    */
  def validateCollection(collectionNme: String): js.Promise[_] = js.native
  /**
    * Validate an existing collection
    *
    * @param collectionNme The name of the collection to validate.
    * @param callback The command result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#validateCollection
    */
  def validateCollection(collectionNme: String, callback: MongoCallback[_]): Unit = js.native
  def validateCollection(collectionNme: String, options: js.Object): js.Promise[_] = js.native
  /**
    * Validate an existing collection
    *
    * @param collectionNme The name of the collection to validate.
    * @param options Optional settings.
    * @param callback The command result callback
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Admin.html#validateCollection
    */
  def validateCollection(collectionNme: String, options: js.Object, callback: MongoCallback[_]): Unit = js.native
}
