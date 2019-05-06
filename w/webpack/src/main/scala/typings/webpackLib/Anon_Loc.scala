package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loc extends js.Object {
  var loc: java.lang.String
  var module: java.lang.String
  var moduleId: js.UndefOr[java.lang.String | scala.Double]
  var moduleIdentifier: java.lang.String
  var moduleName: java.lang.String
  var reasons: js.Array[java.lang.String]
  var request: java.lang.String
}

object Anon_Loc {
  @scala.inline
  def apply(
    loc: java.lang.String,
    module: java.lang.String,
    moduleIdentifier: java.lang.String,
    moduleName: java.lang.String,
    reasons: js.Array[java.lang.String],
    request: java.lang.String,
    moduleId: java.lang.String | scala.Double = null
  ): Anon_Loc = {
    val __obj = js.Dynamic.literal(loc = loc, module = module, moduleIdentifier = moduleIdentifier, moduleName = moduleName, reasons = reasons, request = request)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Loc]
  }
}

