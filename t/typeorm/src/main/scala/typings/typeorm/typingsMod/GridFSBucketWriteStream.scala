package typings.typeorm.typingsMod

import typings.typeorm.platformToolsMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/driver/mongodb/typings", "GridFSBucketWriteStream")
@js.native
class GridFSBucketWriteStream protected () extends Writable {
  /**
    *
    * @param bucket Handle for this stream's corresponding bucket.
    * @param filename The value of the 'filename' key in the files doc.
    * @param options Optional settings.
    */
  def this(bucket: GridFSBucket, filename: String) = this()
  def this(bucket: GridFSBucket, filename: String, options: GridFSBucketWriteStreamOptions) = this()
}
