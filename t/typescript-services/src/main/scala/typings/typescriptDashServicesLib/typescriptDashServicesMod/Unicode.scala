package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Unicode")
@js.native
class Unicode ()
  extends typescriptDashServicesLib.TypeScriptNs.Unicode

@JSImport("typescript-services", "Unicode")
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

