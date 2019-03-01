package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Characterizes the format of the data. */
trait IContentTypeProvider extends js.Object {
  /** Gets the format of the data. */
  var contentType: java.lang.String
}

object IContentTypeProvider {
  @scala.inline
  def apply(contentType: java.lang.String): IContentTypeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.asInstanceOf[IContentTypeProvider]
  }
}

