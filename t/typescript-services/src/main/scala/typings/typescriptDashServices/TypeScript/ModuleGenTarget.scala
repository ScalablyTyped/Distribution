package typings.typescriptDashServices.TypeScript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleGenTarget with Double] = js.native
  /* 2 */ @js.native
  object Asynchronous extends TopLevel[Asynchronous with Double]
  
  /* 1 */ @js.native
  object Synchronous extends TopLevel[Synchronous with Double]
  
  /* 0 */ @js.native
  object Unspecified extends TopLevel[Unspecified with Double]
  
}

