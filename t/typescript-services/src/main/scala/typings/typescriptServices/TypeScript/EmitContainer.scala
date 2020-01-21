package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmitContainer with Double] = js.native
  /* 6 */ @js.native
  object Args extends TopLevel[Args with Double]
  
  /* 3 */ @js.native
  object Class extends TopLevel[Class with Double]
  
  /* 4 */ @js.native
  object Constructor extends TopLevel[Constructor with Double]
  
  /* 2 */ @js.native
  object DynamicModule extends TopLevel[DynamicModule with Double]
  
  /* 5 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  /* 7 */ @js.native
  object Interface extends TopLevel[Interface with Double]
  
  /* 1 */ @js.native
  object Module extends TopLevel[Module with Double]
  
  /* 0 */ @js.native
  object Prog extends TopLevel[Prog with Double]
  
}

