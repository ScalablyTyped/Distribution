package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICameraOptionsUIStatics extends js.Object {
  def show(mediaCapture: MediaCapture): Unit
}

object ICameraOptionsUIStatics {
  @scala.inline
  def apply(show: MediaCapture => Unit): ICameraOptionsUIStatics = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ICameraOptionsUIStatics]
  }
}

