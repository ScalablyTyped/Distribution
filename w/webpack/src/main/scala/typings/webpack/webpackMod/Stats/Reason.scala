package typings.webpack.webpackMod.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  var explanation: js.UndefOr[String] = js.undefined
  var loc: String
  var module: String | Null
  var moduleId: Double | String | Null
  var moduleIdentifier: String | Null
  var moduleName: String | Null
  var `type`: ReasonType
  var userRequest: String
}

object Reason {
  @scala.inline
  def apply(
    loc: String,
    `type`: ReasonType,
    userRequest: String,
    explanation: String = null,
    module: String = null,
    moduleId: Double | String = null,
    moduleIdentifier: String = null,
    moduleName: String = null
  ): Reason = {
    val __obj = js.Dynamic.literal(loc = loc, userRequest = userRequest)
    __obj.updateDynamic("type")(`type`)
    if (explanation != null) __obj.updateDynamic("explanation")(explanation)
    if (module != null) __obj.updateDynamic("module")(module)
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (moduleIdentifier != null) __obj.updateDynamic("moduleIdentifier")(moduleIdentifier)
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName)
    __obj.asInstanceOf[Reason]
  }
}

