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

