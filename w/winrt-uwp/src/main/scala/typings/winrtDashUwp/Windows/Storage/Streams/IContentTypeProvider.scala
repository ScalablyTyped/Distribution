package typings.winrtDashUwp.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Characterizes the format of the data. */
trait IContentTypeProvider extends js.Object {
  /** Gets the format of the data. */
  var contentType: String
}

object IContentTypeProvider {
  @scala.inline
  def apply(contentType: String): IContentTypeProvider = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IContentTypeProvider]
  }
}

