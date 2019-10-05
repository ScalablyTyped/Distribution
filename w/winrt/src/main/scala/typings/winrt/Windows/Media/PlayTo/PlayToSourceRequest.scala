package typings.winrt.Windows.Media.PlayTo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
@js.native
class PlayToSourceRequest () extends IPlayToSourceRequest {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def displayErrorString(errorString: String): Unit = js.native
  /* CompleteClass */
  override def getDeferral(): PlayToSourceDeferral = js.native
  /* CompleteClass */
  override def setSource(value: PlayToSource): Unit = js.native
}

