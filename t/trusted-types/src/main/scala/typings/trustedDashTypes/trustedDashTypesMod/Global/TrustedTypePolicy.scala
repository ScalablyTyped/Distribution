package typings.trustedDashTypes.trustedDashTypesMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedTypePolicy extends js.Object {
  val name: String
  def createHTML(input: String): TrustedHTML
  def createScript(input: String): TrustedScript
  def createScriptURL(input: String): TrustedScriptURL
  def createURL(input: String): TrustedURL
}

object TrustedTypePolicy {
  @scala.inline
  def apply(
    createHTML: String => TrustedHTML,
    createScript: String => TrustedScript,
    createScriptURL: String => TrustedScriptURL,
    createURL: String => TrustedURL,
    name: String
  ): TrustedTypePolicy = {
    val __obj = js.Dynamic.literal(createHTML = js.Any.fromFunction1(createHTML), createScript = js.Any.fromFunction1(createScript), createScriptURL = js.Any.fromFunction1(createScriptURL), createURL = js.Any.fromFunction1(createURL), name = name)
  
    __obj.asInstanceOf[TrustedTypePolicy]
  }
}

