package typings.typeorm.typingsMod

import typings.node.Buffer
import typings.typeorm.platformToolsMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandCursor extends Readable {
  
  /**
    * Set the batch size for the cursor.
    * @param value The batchSize for the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#batchSize
    */
  def batchSize(value: scala.Double): CommandCursor = js.native
  
  /**
    * Close the cursor, sending a KillCursor command and emitting close.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#close
    */
  def close(): js.Promise[AggregationCursorResult] = js.native
  /**
    * Close the cursor, sending a KillCursor command and emitting close.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#close
    */
  def close(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /**
    * Each
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#each
    */
  def each(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /**
    * Is the cursor closed.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#isClosed
    */
  def isClosed(): Boolean = js.native
  
  /**
    * Add a maxTimeMS stage to the aggregation pipeline.
    * @param value The state maxTimeMS value.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#maxTimeMS
    */
  def maxTimeMS(value: scala.Double): CommandCursor = js.native
  
  /**
    * Get the next available document from the cursor, returns null if no more documents are available.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#next
    */
  def next(): js.Promise[AggregationCursorResult] = js.native
  /**
    * Get the next available document from the cursor, returns null if no more documents are available.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#next
    */
  def next(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /**
    * Resets the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#rewind
    */
  def rewind(): CommandCursor = js.native
  
  /**
    * Set the ReadPreference for the cursor.
    * @param readPreference The new read preference for the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#setReadPreference
    */
  def setReadPreference(readPreference: String): CommandCursor = js.native
  def setReadPreference(readPreference: ReadPreference): CommandCursor = js.native
  
  /**
    * Returns an array of documents. The caller is responsible for making sure that there is enough memory
    * to store the results. Note that the array only contain partial results when this cursor had been previouly accessed.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#toArray
    */
  def toArray(): js.Promise[js.Array[_]] = js.native
  /**
    * Returns an array of documents. The caller is responsible for making sure that there is enough memory
    * to store the results. Note that the array only contain partial results when this cursor had been previouly accessed.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#toArray
    */
  def toArray(callback: MongoCallback[js.Array[_]]): Unit = js.native
  
  /**
    * This is useful in certain cases where a stream is being consumed by a parser,
    * which needs to "un-consume" some data that it has optimistically pulled out of the source,
    * so that the stream can be passed on to some other party.
    * @param stream Chunk of data to unshift onto the read queue.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/CommandCursor.html#unshift
    */
  def unshift(stream: Buffer): Unit = js.native
}
