package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
class EnclosingTypeWalkerState ()
  extends typings.typescriptServices.TypeScript.EnclosingTypeWalkerState {
  /* CompleteClass */
  override var _currentSymbols: js.Array[typings.typescriptServices.TypeScript.PullSymbol] = js.native
  /* CompleteClass */
  override var _hasSetEnclosingType: Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
object EnclosingTypeWalkerState extends js.Object {
  def getDefaultEnclosingTypeWalkerState(): typings.typescriptServices.TypeScript.EnclosingTypeWalkerState = js.native
  def getGenericEnclosingTypeWalkerState(genericEnclosingType: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.EnclosingTypeWalkerState = js.native
  def getNonGenericEnclosingTypeWalkerState(): typings.typescriptServices.TypeScript.EnclosingTypeWalkerState = js.native
}

