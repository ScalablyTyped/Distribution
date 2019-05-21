package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Explanation extends js.Object {
  var explanation: js.UndefOr[java.lang.String] = js.undefined
  var loc: js.UndefOr[java.lang.String] = js.undefined
  var module: java.lang.String | scala.Null
  var moduleId: scala.Double | java.lang.String | scala.Null
  var moduleIdentifier: java.lang.String | scala.Null
  var moduleName: java.lang.String | scala.Null
  var `type`: js.Any
   // TODO
  var userRequest: js.Any
}

object Anon_Explanation {
  @scala.inline
  def apply(
    `type`: js.Any,
    userRequest: js.Any,
    explanation: java.lang.String = null,
    loc: java.lang.String = null,
    module: java.lang.String = null,
    moduleId: scala.Double | java.lang.String = null,
    moduleIdentifier: java.lang.String = null,
    moduleName: java.lang.String = null
  ): Anon_Explanation = {
    val __obj = js.Dynamic.literal(userRequest = userRequest)
    __obj.updateDynamic("type")(`type`)
    if (explanation != null) __obj.updateDynamic("explanation")(explanation)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (module != null) __obj.updateDynamic("module")(module)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (moduleIdentifier != null) __obj.updateDynamic("moduleIdentifier")(moduleIdentifier)
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName)
    __obj.asInstanceOf[Anon_Explanation]
  }
}

