package typings
package vegaDashTypingsLib.typesSpecEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorRGB extends js.Object {
  var b: NumericValueRef
  var g: NumericValueRef
  var r: NumericValueRef
}

object ColorRGB {
  @scala.inline
  def apply(b: NumericValueRef, g: NumericValueRef, r: NumericValueRef): ColorRGB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorRGB]
  }
}

