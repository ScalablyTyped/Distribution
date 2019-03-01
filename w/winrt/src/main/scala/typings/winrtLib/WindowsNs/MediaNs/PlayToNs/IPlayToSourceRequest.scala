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
    displayErrorString: js.Function1[java.lang.String, scala.Unit],
    getDeferral: js.Function0[PlayToSourceDeferral],
    setSource: js.Function1[PlayToSource, scala.Unit]
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deadline")(deadline)
    __obj.updateDynamic("displayErrorString")(displayErrorString)
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.updateDynamic("setSource")(setSource)
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
}

