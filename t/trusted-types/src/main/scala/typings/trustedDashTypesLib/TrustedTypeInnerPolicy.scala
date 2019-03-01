package typings
package trustedDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedTypeInnerPolicy extends js.Object {
  def createHTML(s: java.lang.String): java.lang.String
  def createScript(s: java.lang.String): java.lang.String
  def createScriptURL(s: java.lang.String): java.lang.String
  def createURL(s: java.lang.String): java.lang.String
}

object TrustedTypeInnerPolicy {
  @scala.inline
  def apply(
    createHTML: js.Function1[java.lang.String, java.lang.String],
    createScript: js.Function1[java.lang.String, java.lang.String],
    createScriptURL: js.Function1[java.lang.String, java.lang.String],
    createURL: js.Function1[java.lang.String, java.lang.String]
  ): TrustedTypeInnerPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createHTML")(createHTML)
    __obj.updateDynamic("createScript")(createScript)
    __obj.updateDynamic("createScriptURL")(createScriptURL)
    __obj.updateDynamic("createURL")(createURL)
    __obj.asInstanceOf[TrustedTypeInnerPolicy]
  }
}

