package typings.terser.terserMod

import org.scalablytyped.runtime.TopLevel
import typings.terser.terserMod.InlineFunctions.Disabled
import typings.terser.terserMod.InlineFunctions.SimpleFunctions
import typings.terser.terserMod.InlineFunctions.WithArguments
import typings.terser.terserMod.InlineFunctions.WithArgumentsAndVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InlineFunctions extends js.Object

@JSImport("terser", "InlineFunctions")
@js.native
object InlineFunctions extends js.Object {
  @js.native
  sealed trait Disabled extends InlineFunctions
  
  @js.native
  sealed trait SimpleFunctions extends InlineFunctions
  
  @js.native
  sealed trait WithArguments extends InlineFunctions
  
  @js.native
  sealed trait WithArgumentsAndVariables extends InlineFunctions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineFunctions with Double] = js.native
  /* 0 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 1 */ @js.native
  object SimpleFunctions extends TopLevel[SimpleFunctions with Double]
  
  /* 2 */ @js.native
  object WithArguments extends TopLevel[WithArguments with Double]
  
  /* 3 */ @js.native
  object WithArgumentsAndVariables extends TopLevel[WithArgumentsAndVariables with Double]
  
}

