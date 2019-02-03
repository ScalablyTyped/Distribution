package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Unicode")
@js.native
class Unicode () extends js.Object

/* static members */
@JSGlobal("TypeScript.Unicode")
@js.native
object Unicode extends js.Object {
  var unicodeES3IdentifierPart: js.Array[scala.Double] = js.native
  var unicodeES3IdentifierStart: js.Array[scala.Double] = js.native
  var unicodeES5IdentifierPart: js.Array[scala.Double] = js.native
  var unicodeES5IdentifierStart: js.Array[scala.Double] = js.native
  def isIdentifierPart(code: scala.Double, languageVersion: typescriptDashServicesLib.TypeScriptNs.LanguageVersion): scala.Boolean = js.native
  def isIdentifierStart(code: scala.Double, languageVersion: typescriptDashServicesLib.TypeScriptNs.LanguageVersion): scala.Boolean = js.native
  def lookupInUnicodeMap(code: scala.Double, map: js.Array[scala.Double]): scala.Boolean = js.native
}

