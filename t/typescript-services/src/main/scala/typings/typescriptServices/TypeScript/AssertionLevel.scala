package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AssertionLevel extends js.Object

@JSGlobal("TypeScript.AssertionLevel")
@js.native
object AssertionLevel extends js.Object {
  @js.native
  sealed trait Aggressive extends AssertionLevel
  
  @js.native
  sealed trait None extends AssertionLevel
  
  @js.native
  sealed trait Normal extends AssertionLevel
  
  @js.native
  sealed trait VeryAggressive extends AssertionLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AssertionLevel with Double] = js.native
  /* 2 */ @js.native
  object Aggressive extends TopLevel[Aggressive with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 3 */ @js.native
  object VeryAggressive extends TopLevel[VeryAggressive with Double]
  
}

