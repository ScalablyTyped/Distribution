package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleGenTarget extends js.Object

@JSGlobal("TypeScript.ModuleGenTarget")
@js.native
object ModuleGenTarget extends js.Object {
  @js.native
  sealed trait Asynchronous
    extends typescriptDashServicesLib.TypeScriptNs.ModuleGenTarget
  
  @js.native
  sealed trait Synchronous
    extends typescriptDashServicesLib.TypeScriptNs.ModuleGenTarget
  
  @js.native
  sealed trait Unspecified
    extends typescriptDashServicesLib.TypeScriptNs.ModuleGenTarget
  
  /* 2 */ val Asynchronous: Asynchronous with scala.Double = js.native
  /* 1 */ val Synchronous: Synchronous with scala.Double = js.native
  /* 0 */ val Unspecified: Unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.ModuleGenTarget with scala.Double] = js.native
}

