package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceRequest extends js.Object {
  var deadline: stdLib.Date
  def displayErrorString(errorString: java.lang.String): scala.Unit
  def getDeferral(): PlayToSourceDeferral
  def setSource(value: PlayToSource): scala.Unit
}

object IPlayToSourceRequest {
  @scala.inline
  def apply(
    deadline: stdLib.Date,
    displayErrorString: java.lang.String => scala.Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => scala.Unit
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline, displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
  
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
}

