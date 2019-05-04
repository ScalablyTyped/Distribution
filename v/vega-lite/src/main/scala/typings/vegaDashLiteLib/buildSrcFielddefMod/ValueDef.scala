package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDef extends js.Object {
  /**
    * A constant value in visual domain (e.g., `"red"` / "#0099ff" for color, values between `0` to `1` for opacity).
    */
  var value: scala.Double | java.lang.String | scala.Boolean
}

object ValueDef {
  @scala.inline
  def apply(value: scala.Double | java.lang.String | scala.Boolean): ValueDef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValueDef]
  }
}

