package typings.webgme.blobBlobMetadataMod

import typings.webgme.Core.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobMetadata
  extends typings.webgme.Blobs.BlobMetadata

object BlobMetadata {
  @scala.inline
  def apply(contentType: String, context: DataObject, mime: String, name: String, size: Double): BlobMetadata = {
    val __obj = js.Dynamic.literal(contentType = contentType, context = context, mime = mime, name = name, size = size)
  
    __obj.asInstanceOf[BlobMetadata]
  }
}

