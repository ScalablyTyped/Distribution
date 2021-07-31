package typings.typeorm.typingsMod

import typings.typeorm.anon.End
import typings.typeorm.anon.Revision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/typings", "GridFSBucket")
@js.native
class GridFSBucket protected () extends StObject {
  /**
    *
    * @param db A db handle.
    * @param options Optional settings.
    */
  def this(db: Db) = this()
  def this(db: Db, options: GridFSBucketOptions) = this()
  
  /**
    * Deletes a file with the given id.
    * @param id The id of the file doc
    * @param callback The result callback
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#delete
    */
  def delete(id: ObjectID): Unit = js.native
  def delete(id: ObjectID, callback: GridFSBucketErrorCallback): Unit = js.native
  
  /**
    * Removes this bucket's files collection, followed by its chunks collection.
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#drop
    */
  def drop(): Unit = js.native
  def drop(callback: GridFSBucketErrorCallback): Unit = js.native
  
  /**
    * Convenience wrapper around find on the files collection
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#find
    */
  def find(): Cursor[js.Any] = js.native
  def find(filter: js.Object): Cursor[js.Any] = js.native
  def find(filter: js.Object, options: GridFSBucketFindOptions): Cursor[js.Any] = js.native
  def find(filter: Unit, options: GridFSBucketFindOptions): Cursor[js.Any] = js.native
  
  /**
    * Returns a readable stream (GridFSBucketReadStream) for streaming file.
    * @param id The id of the file doc.
    * @param options Optional settings
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#openDownloadStream
    */
  def openDownloadStream(id: ObjectID): GridFSBucketReadStream = js.native
  def openDownloadStream(id: ObjectID, options: End): GridFSBucketReadStream = js.native
  
  /**
    * Returns a readable stream (GridFSBucketReadStream) for streaming file
    * @param filename The id of the file doc
    * @param options Optional settings
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#openDownloadStreamByName
    */
  def openDownloadStreamByName(filename: String): GridFSBucketReadStream = js.native
  def openDownloadStreamByName(filename: String, options: Revision): GridFSBucketReadStream = js.native
  
  /**
    * Returns a writable stream (GridFSBucketWriteStream) for writing buffers to GridFS.
    * The stream's 'id' property contains the resulting file's id.
    * @param filename The value of the 'filename' key in the files doc.
    * @param options Optional settings
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#openUploadStream
    */
  def openUploadStream(filename: String): GridFSBucketWriteStream = js.native
  def openUploadStream(filename: String, options: GridFSBucketOpenUploadStreamOptions): GridFSBucketWriteStream = js.native
  
  /**
    * Returns a writable stream (GridFSBucketWriteStream) for writing buffers to GridFS for a custom file id.
    * The stream's 'id' property contains the resulting file's id.
    * @param id A custom id used to identify the file.
    * @param filename The value of the 'filename' key in the files doc.
    * @param options Optional settings
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#openUploadStreamWithId
    */
  def openUploadStreamWithId(id: String, filename: String): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(id: String, filename: String, options: GridFSBucketOpenUploadStreamOptions): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(id: js.Object, filename: String): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(id: js.Object, filename: String, options: GridFSBucketOpenUploadStreamOptions): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(id: scala.Double, filename: String): GridFSBucketWriteStream = js.native
  def openUploadStreamWithId(id: scala.Double, filename: String, options: GridFSBucketOpenUploadStreamOptions): GridFSBucketWriteStream = js.native
  
  /**
    * Renames the file with the given _id to the given string.
    * @param id the id of the file to rename.
    * @param filename new name for the file.
    * @param callback The result callback
    * @see http://mongodb.github.io/node-mongodb-native/2.1/api/GridFSBucket.html#rename
    */
  def rename(id: ObjectID, filename: String): Unit = js.native
  def rename(id: ObjectID, filename: String, callback: GridFSBucketErrorCallback): Unit = js.native
}
