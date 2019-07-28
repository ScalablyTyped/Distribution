package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmitContainer extends js.Object

@JSGlobal("TypeScript.EmitContainer")
@js.native
object EmitContainer extends js.Object {
  @js.native
  sealed trait Args extends EmitContainer
  
  @js.native
  sealed trait Class extends EmitContainer
  
  @js.native
  sealed trait Constructor extends EmitContainer
  
  @js.native
  sealed trait DynamicModule extends EmitContainer
  
  @js.native
  sealed trait Function extends EmitContainer
  
  @js.native
  sealed trait Interface extends EmitContainer
  
  @js.native
  sealed trait Module extends EmitContainer
  
  @js.native
  sealed trait Prog extends EmitContainer
  
  /* 6 */ val Args: typings.typescriptDashServices.TypeScriptNs.EmitContainer.Args with Double = js.native
  /* 3 */ val Class: typings.typescriptDashServices.TypeScriptNs.EmitContainer.Class with Double = js.native
  /* 4 */ val Constructor: typings.typescriptDashServices.TypeScriptNs.EmitContainer.Constructor with Double = js.native
  /* 2 */ val DynamicModule: typings.typescriptDashServices.TypeScriptNs.EmitContainer.DynamicModule with Double = js.native
  /* 5 */ val Function: typings.typescriptDashServices.TypeScriptNs.EmitContainer.Function with Double = js.native
  /* 7 */ val Interface: typings.typescriptDashServices.TypeScriptNs.EmitContainer.Interface with Double = js.native
  /* 1 */ val Module: typings.typescriptDashServices.TypeScriptNs.EmitContainer.Module with Double = js.native
  /* 0 */ val Prog: typings.typescriptDashServices.TypeScriptNs.EmitContainer.Prog with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitContainer with Double] = js.native
}

