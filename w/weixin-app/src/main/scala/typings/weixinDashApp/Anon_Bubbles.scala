package typings.weixinDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bubbles extends js.Object {
  var bubbles: Boolean
  var capturePhase: Boolean
  var composed: Boolean
}

object Anon_Bubbles {
  @scala.inline
  def apply(bubbles: Boolean, capturePhase: Boolean, composed: Boolean): Anon_Bubbles = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, capturePhase = capturePhase, composed = composed)
  
    __obj.asInstanceOf[Anon_Bubbles]
  }
}

