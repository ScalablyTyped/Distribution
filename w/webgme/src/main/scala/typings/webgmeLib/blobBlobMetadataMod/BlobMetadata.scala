package typings
package webgmeLib.blobBlobMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobMetadata
  extends webgmeLib.BlobsNs.BlobMetadata

object BlobMetadata {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    context: webgmeLib.CoreNs.DataObject,
    mime: java.lang.String,
    name: java.lang.String,
    size: scala.Double
  ): BlobMetadata = {
    val __obj = js.Dynamic.literal(contentType = contentType, context = context, mime = mime, name = name, size = size)
  
    __obj.asInstanceOf[BlobMetadata]
  }
}

