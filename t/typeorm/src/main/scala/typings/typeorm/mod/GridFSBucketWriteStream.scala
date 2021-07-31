package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.GridFSBucketWriteStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "GridFSBucketWriteStream")
@js.native
class GridFSBucketWriteStream protected ()
  extends typings.typeorm.mongodbTypingsMod.GridFSBucketWriteStream {
  /**
    *
    * @param bucket Handle for this stream's corresponding bucket.
    * @param filename The value of the 'filename' key in the files doc.
    * @param options Optional settings.
    */
  def this(bucket: typings.typeorm.mongodbTypingsMod.GridFSBucket, filename: String) = this()
  def this(
    bucket: typings.typeorm.mongodbTypingsMod.GridFSBucket,
    filename: String,
    options: GridFSBucketWriteStreamOptions
  ) = this()
}
