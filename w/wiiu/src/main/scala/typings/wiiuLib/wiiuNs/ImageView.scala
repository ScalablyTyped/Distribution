package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView extends js.Object {
  var viewMode: scala.Double
  def end(): scala.Boolean
  def getErrorCode(): scala.Double
}

object ImageView {
  @scala.inline
  def apply(end: () => scala.Boolean, getErrorCode: () => scala.Double, viewMode: scala.Double): ImageView = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), getErrorCode = js.Any.fromFunction0(getErrorCode), viewMode = viewMode)
  
    __obj.asInstanceOf[ImageView]
  }
}

