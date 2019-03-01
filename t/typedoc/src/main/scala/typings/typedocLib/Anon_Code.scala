package typings
package typedocLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: scala.Boolean
  var pre: scala.Boolean
  var script: scala.Boolean
  var style: scala.Boolean
  var textarea: scala.Boolean
}

object Anon_Code {
  @scala.inline
  def apply(
    code: scala.Boolean,
    pre: scala.Boolean,
    script: scala.Boolean,
    style: scala.Boolean,
    textarea: scala.Boolean
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("pre")(pre)
    __obj.updateDynamic("script")(script)
    __obj.updateDynamic("style")(style)
    __obj.updateDynamic("textarea")(textarea)
    __obj.asInstanceOf[Anon_Code]
  }
}

