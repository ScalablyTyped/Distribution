package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBubbles extends js.Object {
  var bubbles: Boolean
  var capturePhase: Boolean
  var composed: Boolean
}

object AnonBubbles {
  @scala.inline
  def apply(bubbles: Boolean, capturePhase: Boolean, composed: Boolean): AnonBubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], capturePhase = capturePhase.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBubbles]
  }
}

