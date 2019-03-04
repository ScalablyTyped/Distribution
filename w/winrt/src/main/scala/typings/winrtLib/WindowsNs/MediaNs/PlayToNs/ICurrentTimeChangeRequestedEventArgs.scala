package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrentTimeChangeRequestedEventArgs extends js.Object {
  var time: scala.Double
}

object ICurrentTimeChangeRequestedEventArgs {
  @scala.inline
  def apply(time: scala.Double): ICurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time)
  
    __obj.asInstanceOf[ICurrentTimeChangeRequestedEventArgs]
  }
}

