package typings.typeorm.typingsMod

import typings.typeorm.platformToolsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSession extends EventEmitter {
  
  /**
    * Aborts the currently active transaction in this session.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#abortTransaction
    */
  def abortTransaction(): js.Promise[Unit] = js.native
  def abortTransaction(callback: MongoCallback[Unit]): js.Promise[Unit] = js.native
  
  /**
    * Advances the operationTime for a ClientSession.
    * @param operationTime the BSON.Timestamp of the operation type it is desired to advance to.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#advanceOperationTime
    */
  def advanceOperationTime(operationTime: Timestamp): Unit = js.native
  
  /**
    * Commits the currently active transaction in this session.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#commitTransaction
    */
  def commitTransaction(): js.Promise[Unit] = js.native
  def commitTransaction(callback: MongoCallback[Unit]): js.Promise[Unit] = js.native
  
  /**
    * Ends this session on the server.
    * @param callback Optional callback for completion of this operation.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#endSession
    */
  def endSession(): Unit = js.native
  def endSession(callback: MongoCallback[Unit]): Unit = js.native
  def endSession(options: js.UndefOr[scala.Nothing], callback: MongoCallback[Unit]): Unit = js.native
  def endSession(options: js.Any): Unit = js.native
  def endSession(options: js.Any, callback: MongoCallback[Unit]): Unit = js.native
  
  /**
    * Used to determine if this session equals another.
    * @param session A class representing a client session on the server.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#equals
    */
  def equals(session: ClientSession): Boolean = js.native
  
  /**
    * The server id associated with this session
    */
  var id: js.Any = js.native
  
  /**
    * Check this session is currently in a transaction or not.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#inTransaction
    */
  def inTransaction(): Boolean = js.native
  
  /**
    * Increment the transaction number on the internal ServerSession.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#incrementTransactionNumber
    */
  def incrementTransactionNumber(): Unit = js.native
  
  /**
    * Starts a new transaction with the given options.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ClientSession.html#startTransaction
    */
  def startTransaction(): Unit = js.native
  def startTransaction(options: TransactionOptions): Unit = js.native
}
