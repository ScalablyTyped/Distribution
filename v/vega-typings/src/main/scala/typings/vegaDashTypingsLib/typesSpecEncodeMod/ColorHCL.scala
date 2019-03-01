package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorHCL extends js.Object {
  var c: NumericValueRef
  var h: NumericValueRef
  var l: NumericValueRef
}

object ColorHCL {
  @scala.inline
  def apply(c: NumericValueRef, h: NumericValueRef, l: NumericValueRef): ColorHCL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHCL]
  }
}

