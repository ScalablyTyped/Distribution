package typings.vegaDashTypings.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorHSL extends js.Object {
  var h: NumericValueRef
  var l: NumericValueRef
  var s: NumericValueRef
}

object ColorHSL {
  @scala.inline
  def apply(h: NumericValueRef, l: NumericValueRef, s: NumericValueRef): ColorHSL = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorHSL]
  }
}

