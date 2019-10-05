package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContentTypeProvider extends js.Object {
  var contentType: String
}

object IContentTypeProvider {
  @scala.inline
  def apply(contentType: String): IContentTypeProvider = {
    val __obj = js.Dynamic.literal(contentType = contentType)
  
    __obj.asInstanceOf[IContentTypeProvider]
  }
}

