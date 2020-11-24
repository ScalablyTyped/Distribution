package typings.typeorm.typingsMod

import typings.typeorm.anon.TransformFunction
import typings.typeorm.platformToolsMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/typings", "ChangeStream")
@js.native
class ChangeStream protected () extends Readable {
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Db, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: MongoClient, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(changeDomain: Db, pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(changeDomain: MongoClient, pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  
  /**
    * Close the Change Stream.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#close
    */
  def close(): js.Promise[_] = js.native
  /**
    * Close the Change Stream.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#close
    */
  def close(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Check if there is any document still available in the Change Stream.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#hasNext
    */
  def hasNext(): js.Promise[_] = js.native
  /**
    * Check if there is any document still available in the Change Stream.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#hasNext
    */
  def hasNext(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Is the cursor closed.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#isClosed
    */
  def isClosed(): Boolean = js.native
  
  /**
    * Get the next available document from the Change Stream, returns null if no more documents are available.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#next
    */
  def next(): js.Promise[_] = js.native
  /**
    * Get the next available document from the Change Stream, returns null if no more documents are available.
    * @param callback The result callback.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#next
    */
  def next(callback: MongoCallback[_]): Unit = js.native
  
  /**
    * Return a modified Readable stream including a possible transform method.
    * @param options Optional settings.
    * @see http://mongodb.github.io/node-mongodb-native/3.1/api/ChangeStream.html#stream
    */
  def stream(): Cursor[_] = js.native
  def stream(options: TransformFunction): Cursor[_] = js.native
}
