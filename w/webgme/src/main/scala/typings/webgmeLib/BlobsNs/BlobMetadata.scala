package typings
package webgmeLib.BlobsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobMetadata extends js.Object {
  var contentType: java.lang.String
  var context: webgmeLib.CoreNs.DataObject
  var mime: java.lang.String
  var name: java.lang.String
  var size: scala.Double
}

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

