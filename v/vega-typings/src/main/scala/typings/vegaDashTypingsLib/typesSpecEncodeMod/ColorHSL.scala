package typings
package vegaDashTypingsLib.typesSpecEncodeMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHSL]
  }
}

