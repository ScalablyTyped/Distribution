package typings.atVueComponentDashCompilerDashUtils.distCompileStyleMod

import typings.postcss.postcssMod.LazyResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleCompileResults extends js.Object {
  var code: String
  var errors: js.Array[String]
  var map: js.Any | Unit
  var rawResult: LazyResult | Unit
}

object StyleCompileResults {
  @scala.inline
  def apply(code: String, errors: js.Array[String], map: js.Any | Unit, rawResult: LazyResult | Unit): StyleCompileResults = {
    val __obj = js.Dynamic.literal(code = code, errors = errors, map = map.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleCompileResults]
  }
}

