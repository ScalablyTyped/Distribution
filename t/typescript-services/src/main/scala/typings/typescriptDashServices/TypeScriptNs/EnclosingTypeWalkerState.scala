package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
class EnclosingTypeWalkerState () extends js.Object {
  var _currentSymbols: js.Array[PullSymbol] = js.native
  var _hasSetEnclosingType: Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
object EnclosingTypeWalkerState extends js.Object {
  def getDefaultEnclosingTypeWalkerState(): EnclosingTypeWalkerState = js.native
  def getGenericEnclosingTypeWalkerState(genericEnclosingType: PullTypeSymbol): EnclosingTypeWalkerState = js.native
  def getNonGenericEnclosingTypeWalkerState(): EnclosingTypeWalkerState = js.native
}

