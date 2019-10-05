package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleGenTarget extends js.Object

@JSGlobal("TypeScript.ModuleGenTarget")
@js.native
object ModuleGenTarget extends js.Object {
  @js.native
  sealed trait Asynchronous extends ModuleGenTarget
  
  @js.native
  sealed trait Synchronous extends ModuleGenTarget
  
  @js.native
  sealed trait Unspecified extends ModuleGenTarget
  
  /* 2 */ val Asynchronous: typings.typescriptDashServices.TypeScript.ModuleGenTarget.Asynchronous with Double = js.native
  /* 1 */ val Synchronous: typings.typescriptDashServices.TypeScript.ModuleGenTarget.Synchronous with Double = js.native
  /* 0 */ val Unspecified: typings.typescriptDashServices.TypeScript.ModuleGenTarget.Unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleGenTarget with Double] = js.native
}

