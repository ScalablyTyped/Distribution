package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Explanation extends js.Object {
  var explanation: js.UndefOr[String] = js.undefined
  var loc: js.UndefOr[String] = js.undefined
  var module: String | Null
  var moduleId: Double | String | Null
  var moduleIdentifier: String | Null
  var moduleName: String | Null
  var `type`: js.Any
   // TODO
  var userRequest: js.Any
}

object Anon_Explanation {
  @scala.inline
  def apply(
    `type`: js.Any,
    userRequest: js.Any,
    explanation: String = null,
    loc: String = null,
    module: String = null,
    moduleId: Double | String = null,
    moduleIdentifier: String = null,
    moduleName: String = null
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

