package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceRequestedEventArgs extends js.Object {
  var sourceRequest: PlayToSourceRequest
}

object IPlayToSourceRequestedEventArgs {
  @scala.inline
  def apply(sourceRequest: PlayToSourceRequest): IPlayToSourceRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sourceRequest")(sourceRequest)
    __obj.asInstanceOf[IPlayToSourceRequestedEventArgs]
  }
}

