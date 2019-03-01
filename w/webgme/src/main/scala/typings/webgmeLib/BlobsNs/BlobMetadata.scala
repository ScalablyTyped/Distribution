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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("mime")(mime)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[BlobMetadata]
  }
}

