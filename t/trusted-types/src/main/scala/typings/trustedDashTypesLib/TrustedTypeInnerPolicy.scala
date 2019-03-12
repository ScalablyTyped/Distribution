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
    createHTML: java.lang.String => java.lang.String,
    createScript: java.lang.String => java.lang.String,
    createScriptURL: java.lang.String => java.lang.String,
    createURL: java.lang.String => java.lang.String
  ): TrustedTypeInnerPolicy = {
    val __obj = js.Dynamic.literal(createHTML = js.Any.fromFunction1(createHTML), createScript = js.Any.fromFunction1(createScript), createScriptURL = js.Any.fromFunction1(createScriptURL), createURL = js.Any.fromFunction1(createURL))
  
    __obj.asInstanceOf[TrustedTypeInnerPolicy]
  }
}

