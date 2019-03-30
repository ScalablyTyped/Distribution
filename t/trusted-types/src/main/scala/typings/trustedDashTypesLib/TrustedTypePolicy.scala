package typings
package trustedDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TrustedTypePolicy")
@js.native
class TrustedTypePolicy () extends js.Object {
  val name: java.lang.String = js.native
  def createHTML(input: java.lang.String): TrustedHTML = js.native
  def createScript(input: java.lang.String): TrustedScript = js.native
  def createScriptURL(input: java.lang.String): TrustedScriptURL = js.native
  def createURL(input: java.lang.String): TrustedURL = js.native
}

