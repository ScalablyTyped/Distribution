package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.TextEdit")
@js.native
class TextEdit protected () extends js.Object {
  def this(minChar: scala.Double, limChar: scala.Double, text: java.lang.String) = this()
  var limChar: scala.Double = js.native
  var minChar: scala.Double = js.native
  var text: java.lang.String = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.TextEdit")
@js.native
object TextEdit extends js.Object {
  def createDelete(minChar: scala.Double, limChar: scala.Double): typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit = js.native
  def createInsert(pos: scala.Double, text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit = js.native
  def createReplace(minChar: scala.Double, limChar: scala.Double, text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit = js.native
}

