package typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs

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
    val __obj = js.Dynamic.literal(contentType = contentType)
  
    __obj.asInstanceOf[IContentTypeProvider]
  }
}

