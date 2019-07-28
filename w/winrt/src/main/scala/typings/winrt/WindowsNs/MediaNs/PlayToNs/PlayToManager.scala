package typings.winrt.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo.PlayToManager")
@js.native
class PlayToManager () extends IPlayToManager {
  /* CompleteClass */
  override var defaultSourceSelection: Boolean = js.native
  /* CompleteClass */
  override var onsourcerequested: js.Any = js.native
  /* CompleteClass */
  override var onsourceselected: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.Media.PlayTo.PlayToManager")
@js.native
object PlayToManager extends js.Object {
  def getForCurrentView(): PlayToManager = js.native
  def showPlayToUI(): Unit = js.native
}

