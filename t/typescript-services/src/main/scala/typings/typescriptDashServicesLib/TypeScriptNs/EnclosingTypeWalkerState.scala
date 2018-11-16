package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
class EnclosingTypeWalkerState () extends js.Object {
  var _currentSymbols: js.Array[PullSymbol] = js.native
  var _hasSetEnclosingType: scala.Boolean = js.native
}

@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
object EnclosingTypeWalkerState extends js.Object {
  def getDefaultEnclosingTypeWalkerState(): typescriptDashServicesLib.TypeScriptNs.EnclosingTypeWalkerState = js.native
  def getGenericEnclosingTypeWalkerState(genericEnclosingType: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol): typescriptDashServicesLib.TypeScriptNs.EnclosingTypeWalkerState = js.native
  def getNonGenericEnclosingTypeWalkerState(): typescriptDashServicesLib.TypeScriptNs.EnclosingTypeWalkerState = js.native
}

