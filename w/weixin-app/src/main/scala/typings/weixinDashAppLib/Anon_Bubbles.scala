package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bubbles extends js.Object {
  var bubbles: scala.Boolean
  var capturePhase: scala.Boolean
  var composed: scala.Boolean
}

object Anon_Bubbles {
  @scala.inline
  def apply(bubbles: scala.Boolean, capturePhase: scala.Boolean, composed: scala.Boolean): Anon_Bubbles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bubbles")(bubbles)
    __obj.updateDynamic("capturePhase")(capturePhase)
    __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[Anon_Bubbles]
  }
}

