package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorLAB extends js.Object {
  var a: NumericValueRef
  var b: NumericValueRef
  var l: NumericValueRef
}

object ColorLAB {
  @scala.inline
  def apply(a: NumericValueRef, b: NumericValueRef, l: NumericValueRef): ColorLAB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorLAB]
  }
}

