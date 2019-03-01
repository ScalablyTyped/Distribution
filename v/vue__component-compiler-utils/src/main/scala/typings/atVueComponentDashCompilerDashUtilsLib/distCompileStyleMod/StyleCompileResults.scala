package typings
package atVueComponentDashCompilerDashUtilsLib.distCompileStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleCompileResults extends js.Object {
  var code: java.lang.String
  var errors: js.Array[java.lang.String]
  var map: js.Any | scala.Unit
  var rawResult: postcssLib.postcssMod.postcssNs.LazyResult | scala.Unit
}

object StyleCompileResults {
  @scala.inline
  def apply(
    code: java.lang.String,
    errors: js.Array[java.lang.String],
    map: js.Any | scala.Unit,
    rawResult: postcssLib.postcssMod.postcssNs.LazyResult | scala.Unit
  ): StyleCompileResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.updateDynamic("rawResult")(rawResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCompileResults]
  }
}

