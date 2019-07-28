package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loc extends js.Object {
  var loc: String
  var module: String
  var moduleId: js.UndefOr[String | Double] = js.undefined
  var moduleIdentifier: String
  var moduleName: String
  var reasons: js.Array[String]
  var request: String
}

object Anon_Loc {
  @scala.inline
  def apply(
    loc: String,
    module: String,
    moduleIdentifier: String,
    moduleName: String,
    reasons: js.Array[String],
    request: String,
    moduleId: String | Double = null
  ): Anon_Loc = {
    val __obj = js.Dynamic.literal(loc = loc, module = module, moduleIdentifier = moduleIdentifier, moduleName = moduleName, reasons = reasons, request = request)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Loc]
  }
}

