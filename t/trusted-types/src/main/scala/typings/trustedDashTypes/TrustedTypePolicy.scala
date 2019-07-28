package typings.trustedDashTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrustedTypePolicy")
@js.native
class TrustedTypePolicy () extends js.Object {
  val name: String = js.native
  def createHTML(input: String): TrustedHTML = js.native
  def createScript(input: String): TrustedScript = js.native
  def createScriptURL(input: String): TrustedScriptURL = js.native
  def createURL(input: String): TrustedURL = js.native
}

