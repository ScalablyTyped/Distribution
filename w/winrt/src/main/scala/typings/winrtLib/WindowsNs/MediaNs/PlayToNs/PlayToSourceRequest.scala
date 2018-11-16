package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.PlayTo.PlayToSourceRequest")
@js.native
class PlayToSourceRequest () extends IPlayToSourceRequest {
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override def displayErrorString(errorString: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def getDeferral(): PlayToSourceDeferral = js.native
  /* CompleteClass */
  override def setSource(value: PlayToSource): scala.Unit = js.native
}

