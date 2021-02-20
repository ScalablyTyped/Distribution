package typings.typeorm.typingsMod

import typings.node.Buffer
import typings.typeorm.platformToolsMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationCursor[T] extends Readable {
  
  /**
    * Set the batch size for the cursor.
    * @param value The batchSize for the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#batchSize
    */
  def batchSize(value: scala.Double): AggregationCursor[T] = js.native
  
  /**
    * Close the cursor, sending a AggregationCursor command and emitting close.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#close
    */
  def close(): js.Promise[AggregationCursorResult] = js.native
  /**
    * Close the cursor, sending a AggregationCursor command and emitting close.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#close
    */
  def close(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /**
    * Iterates over all the documents for this cursor. As with {cursor.toArray}, not all of the elements will
    * be iterated if this cursor had been previouly accessed. In that case, {cursor.rewind} can be used to reset
    * the cursor. However, unlike {cursor.toArray}, the cursor will only hold a maximum of batch size elements
    * at any given time if batch size is specified. Otherwise, the caller is responsible for making sure
    * that the entire result can fit the memory.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#each
    */
  def each(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /**
    * Execute the explain for the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#explain
    */
  def explain(): js.Promise[AggregationCursorResult] = js.native
  /**
    * Execute the explain for the cursor.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#explain
    */
  def explain(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /**
    * Add a geoNear stage to the aggregation pipeline.
    * @param document The geoNear stage document.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#geoNear
    */
  def geoNear(document: js.Object): AggregationCursor[T] = js.native
  
  /**
    * Add a group stage to the aggregation pipeline.
    * @param document The group stage document.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#group
    */
  def group(document: js.Object): AggregationCursor[T] = js.native
  
  /**
    * Is the cursor closed.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#isClosed
    */
  def isClosed(): Boolean = js.native
  
  /**
    * Add a limit stage to the aggregation pipeline.
    * @param value The state limit value.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#limit
    */
  def limit(value: scala.Double): AggregationCursor[T] = js.native
  
  /**
    * Add a match stage to the aggregation pipeline.
    * @param document The match stage document.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#match
    */
  def `match`(document: js.Object): AggregationCursor[T] = js.native
  
  /**
    * Add a maxTimeMS stage to the aggregation pipeline.
    * @param value The state maxTimeMS value.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#maxTimeMS
    */
  def maxTimeMS(value: scala.Double): AggregationCursor[T] = js.native
  
  /**
    * Get the next available document from the cursor, returns null if no more documents are available.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#next
    */
  def next(): js.Promise[AggregationCursorResult] = js.native
  /**
    * Get the next available document from the cursor, returns null if no more documents are available.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#next
    */
  def next(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /**
    * Add a out stage to the aggregation pipeline.
    * @param destination The destination name.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#out
    */
  def out(destination: String): AggregationCursor[T] = js.native
  
  /**
    * Add a project stage to the aggregation pipeline.
    * @param document The project stage document.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#project
    */
  def project(document: js.Object): AggregationCursor[T] = js.native
  
  /**
    * Add a redact stage to the aggregation pipeline.
    * @param document The redact stage document.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#redact
    */
  def redact(document: js.Object): AggregationCursor[T] = js.native
  
  /**
    * Resets the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#rewind
    */
  def rewind(): AggregationCursor[T] = js.native
  
  /**
    * Add a skip stage to the aggregation pipeline.
    * @param value The state skip value.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#setEncoding
    */
  def skip(value: scala.Double): AggregationCursor[T] = js.native
  
  /**
    * Add a sort stage to the aggregation pipeline.
    * @param document The sort stage document.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#sort
    */
  def sort(document: js.Object): AggregationCursor[T] = js.native
  
  /**
    * Returns an array of documents. The caller is responsible for making sure that there
    * is enough memory to store the results. Note that the array only contain partial
    * results when this cursor had been previouly accessed. In that case,
    * cursor.rewind() can be used to reset the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#toArray
    */
  def toArray(): js.Promise[js.Array[T]] = js.native
  /**
    * Returns an array of documents. The caller is responsible for making sure that there
    * is enough memory to store the results. Note that the array only contain partial
    * results when this cursor had been previouly accessed. In that case,
    * cursor.rewind() can be used to reset the cursor.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#toArray
    */
  def toArray(callback: MongoCallback[js.Array[T]]): Unit = js.native
  
  /**
    * This is useful in certain cases where a stream is being consumed by a parser,
    * which needs to "un-consume" some data that it has optimistically pulled out of the source,
    * so that the stream can be passed on to some other party.
    * @param stream Chunk of data to unshift onto the read queue.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#unshift
    */
  def unshift(stream: Buffer): Unit = js.native
  
  /**
    * Add a unwind stage to the aggregation pipeline.
    * @param field The unwind field name.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/AggregationCursor.html#unwind
    */
  def unwind(field: String): AggregationCursor[T] = js.native
}
