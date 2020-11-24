package typings.typeorm.typingsMod

import typings.node.Buffer
import typings.typeorm.anon.Transform
import typings.typeorm.platformToolsMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/typings", "Cursor")
@js.native
class Cursor[T] () extends Readable {
  
  /**
    * @param flag The flag to set, must be one of following ['tailable', 'oplogReplay', 'noCursorTimeout', 'awaitData', 'partial'].
    * @param value The flag boolean value.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#addCursorFlag
    */
  def addCursorFlag(flag: String, value: Boolean): Cursor[T] = js.native
  
  /**
    * @param name The query modifier (must start with $, such as $orderby etc).
    * @param value The flag boolean value.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#addQueryModifier
    */
  def addQueryModifier(name: String, value: Boolean): Cursor[T] = js.native
  
  /**
    * @param value The batchSize for the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#batchSize
    */
  def batchSize(value: scala.Double): Cursor[T] = js.native
  
  /**
    * Close the cursor, sending a KillCursor command and emitting close.
    * The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#close
    */
  def close(): js.Promise[CursorResult] = js.native
  /**
    * Close the cursor, sending a KillCursor command and emitting close.
    * The result callback.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#close
    */
  def close(callback: MongoCallback[CursorResult]): Unit = js.native
  
  /**
    * Add a comment to the cursor query allowing for tracking the comment in the log.
    * @param value The comment attached to this query.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#comment
    */
  def comment(value: String): Cursor[T] = js.native
  
  /**
    * Get the count of documents for this cursor.
    * @param applySkipLimit Should the count command apply limit and skip settings on the cursor or in the passed in options.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#count
    */
  def count(applySkipLimit: Boolean): js.Promise[scala.Double] = js.native
  /**
    * Get the count of documents for this cursor.
    * @param applySkipLimit Should the count command apply limit and skip settings on the cursor or in the passed in options.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#count
    */
  def count(applySkipLimit: Boolean, callback: MongoCallback[scala.Double]): Unit = js.native
  def count(applySkipLimit: Boolean, options: CursorCommentOptions): js.Promise[scala.Double] = js.native
  /**
    * Get the count of documents for this cursor.
    * @param applySkipLimit Should the count command apply limit and skip settings on the cursor or in the passed in options.
    * @param options Optional settings.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#count
    */
  def count(applySkipLimit: Boolean, options: CursorCommentOptions, callback: MongoCallback[scala.Double]): Unit = js.native
  
  /**
    * Execute the explain for the cursor.
    * returns Promise if no callback passed.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#explain
    */
  def explain(): js.Promise[CursorResult] = js.native
  /**
    * Execute the explain for the cursor.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#explain
    */
  def explain(callback: MongoCallback[CursorResult]): Unit = js.native
  
  /**
    * Set the cursor query.
    * @param filter The filter object used for the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#filter
    */
  def filter(filter: js.Object): Cursor[T] = js.native
  
  def forEach(iterator: IteratorCallback[T]): js.Promise[Unit] = js.native
  /**
    * Iterates over all the documents for this cursor using the iterator, callback pattern.
    * @param iterator The iteration callback.
    * @param callback The end callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/Cursor.html#forEach
    */
  def forEach(iterator: IteratorCallback[T], callback: EndCallback): Unit = js.native
  
  /**
    * Check if there is any document still available in the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#hasNext
    */
  def hasNext(): js.Promise[Boolean] = js.native
  /**
    * Check if there is any document still available in the cursor.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#hasNext
    */
  def hasNext(callback: MongoCallback[Boolean]): Unit = js.native
  
  /**
    * Set the cursor hint.
    * @param hint If specified, then the query system will only consider plans using the hinted index.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#hint
    */
  def hint(hint: js.Object): Cursor[T] = js.native
  
  /**
    * Is the cursor closed.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#isClosed
    */
  def isClosed(): Boolean = js.native
  
  /**
    * Set the limit for the cursor.
    * @param value The limit for the cursor query.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#limit
    */
  def limit(value: scala.Double): Cursor[T] = js.native
  
  /**
    * SMap all documents using the provided function.
    * @param transform The mapping transformation method.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#map
    */
  def map(transform: js.Function): Cursor[T] = js.native
  
  /**
    * Set the cursor max.
    * @param max Specify a $max value to specify the exclusive upper bound for a specific index in
    * order to constrain the results of find(). The $max specifies the upper bound for
    * all keys of a specific index in order.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#max
    */
  def max(max: scala.Double): Cursor[T] = js.native
  
  /**
    * Set a maxAwaitTimeMS on a tailing cursor query to allow to customize the
    * timeout value for the option awaitData (Only supported on MongoDB 3.2 or higher, ignored otherwise).
    * @param value Number of milliseconds to wait before aborting the tailed query.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#maxAwaitTimeMS
    */
  def maxAwaitTimeMS(value: scala.Double): Cursor[T] = js.native
  
  /**
    * Set the cursor maxScan.
    * @param maxScan Constrains the query to only scan the specified number of documents when fulfilling the query.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#maxScan
    */
  def maxScan(maxScan: js.Object): Cursor[T] = js.native
  
  /**
    * Set a maxTimeMS on the cursor query, allowing for hard timeout limits on queries (Only supported on MongoDB 2.6 or higher).
    * @param value Number of milliseconds to wait before aborting the query.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#maxTimeMS
    */
  def maxTimeMS(value: scala.Double): Cursor[T] = js.native
  
  /**
    * Set the cursor min.
    * @param min Specify a $min value to specify the inclusive lower bound for a specific index in order to
    * constrain the results of find(). The $min specifies the lower bound for all keys of a specific index in order.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#min
    */
  def min(min: scala.Double): Cursor[T] = js.native
  
  /**
    * Get the next available document from the cursor, returns null if no more documents are available.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#next
    */
  def next(): js.Promise[CursorResult] = js.native
  /**
    * Get the next available document from the cursor, returns null if no more documents are available.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#next
    */
  def next(callback: MongoCallback[CursorResult]): Unit = js.native
  
  /**
    * Sets a field projection for the query.
    * @param value The field projection object.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#project
    */
  def project(value: js.Object): Cursor[T] = js.native
  
  /**
    * Get cursor ReadPreference.
    */
  var readPreference: ReadPreference = js.native
  
  /**
    * Set the cursor returnKey.
    * @param returnKey Only return the index field or fields for the results of the query. If $returnKey is set
    * to true and the query does not use an index to perform the read operation,
    * the returned documents will not contain any fields. Use one of the following forms:
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#next
    */
  def returnKey(returnKey: js.Object): Cursor[T] = js.native
  
  /**
    * Resets the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#rewind
    */
  def rewind(): Unit = js.native
  
  /**
    * Set a node.js specific cursor option.
    * @param field The cursor option to set ['numberOfRetries', 'tailableRetryInterval'].
    * @param value The field value.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#setCursorOption
    */
  def setCursorOption(field: String, value: js.Object): Cursor[T] = js.native
  
  /**
    * Set the ReadPreference for the cursor.
    * @param readPreference The new read preference for the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#setReadPreference
    */
  def setReadPreference(readPreference: String): Cursor[T] = js.native
  def setReadPreference(readPreference: ReadPreference): Cursor[T] = js.native
  
  /**
    * Set the cursor showRecordId.
    * @param showRecordId The $showDiskLoc option has now been deprecated and replaced with the
    * showRecordId field. $showDiskLoc will still be accepted for OP_QUERY stye find.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#showRecordId
    */
  def showRecordId(showRecordId: js.Object): Cursor[T] = js.native
  
  /**
    * Set the skip for the cursor.
    * @param value The skip for the cursor query.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#skip
    */
  def skip(value: scala.Double): Cursor[T] = js.native
  
  /**
    * Set the cursor snapshot.
    * @param snapshot The $snapshot operator prevents the cursor from returning a document more than
    * once because an intervening write operation results in a move of the document.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#snapshot
    */
  def snapshot(snapshot: js.Object): Cursor[T] = js.native
  
  /**
    * Sets the sort order of the cursor query.
    * @param keyOrList The key or keys set for the sort.
    * @param direction The direction of the sorting (1 or -1).
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#sort
    */
  def sort(keyOrList: String): Cursor[T] = js.native
  def sort(keyOrList: String, direction: scala.Double): Cursor[T] = js.native
  def sort(keyOrList: js.Array[js.Object]): Cursor[T] = js.native
  def sort(keyOrList: js.Array[js.Object], direction: scala.Double): Cursor[T] = js.native
  def sort(keyOrList: js.Object): Cursor[T] = js.native
  def sort(keyOrList: js.Object, direction: scala.Double): Cursor[T] = js.native
  
  /**
    * Cursor query sort setting.
    */
  var sortValue: String = js.native
  
  /**
    * Return a modified Readable stream including a possible transform method.
    * @param options Optional settings.
    * @param transform A transformation method applied to each document emitted by the stream.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#stream
    */
  def stream(): Cursor[T] = js.native
  def stream(options: Transform): Cursor[T] = js.native
  
  /**
    * Is Cursor able to time out.
    */
  var timeout: Boolean = js.native
  
  /**
    * Returns an array of documents. The caller is responsible for making sure that there is enough
    * memory to store the results. Note that the array only contain partial results when this cursor had
    * been previously accessed. In that case, cursor.rewind() can be used to reset the cursor.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#toArray
    */
  def toArray(): js.Promise[js.Array[T]] = js.native
  /**
    * Returns an array of documents. The caller is responsible for making sure that there is enough
    * memory to store the results. Note that the array only contain partial results when this cursor had
    * been previously accessed. In that case, cursor.rewind() can be used to reset the cursor.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#toArray
    */
  def toArray(callback: MongoCallback[js.Array[T]]): Unit = js.native
  
  /**
    * This is useful in certain cases where a stream is being consumed by a parser, which needs to "un-consume" some
    * data that it has optimistically pulled out of the source, so that the stream can be passed on to some other party.
    * @param stream Chunk of data to unshift onto the read queue.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#unshift
    */
  def unshift(stream: Buffer): Unit = js.native
}
