package typings.vegaTypings.encodeMod

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
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColorRGB]
  }
}

