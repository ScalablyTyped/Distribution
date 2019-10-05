package typings.winrt.Windows.Media.PlayTo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceRequest extends js.Object {
  var deadline: Date
  def displayErrorString(errorString: String): Unit
  def getDeferral(): PlayToSourceDeferral
  def setSource(value: PlayToSource): Unit
}

object IPlayToSourceRequest {
  @scala.inline
  def apply(
    deadline: Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline, displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
  
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
}

