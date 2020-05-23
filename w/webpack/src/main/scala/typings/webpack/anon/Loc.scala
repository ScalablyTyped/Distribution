package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loc extends js.Object {
  var loc: String
  var module: String
  var moduleId: js.UndefOr[String | Double] = js.undefined
  var moduleIdentifier: String
  var moduleName: String
  var reasons: js.Array[String]
  var request: String
}

object Loc {
  @scala.inline
  def apply(
    loc: String,
    module: String,
    moduleIdentifier: String,
    moduleName: String,
    reasons: js.Array[String],
    request: String,
    moduleId: String | Double = null
  ): Loc = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleIdentifier = moduleIdentifier.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
}

