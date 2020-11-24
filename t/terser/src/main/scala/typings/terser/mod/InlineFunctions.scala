package typings.terser.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlineFunctions extends js.Object
@JSImport("terser", "InlineFunctions")
@js.native
object InlineFunctions extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InlineFunctions with Double] = js.native
  
  @js.native
  sealed trait Disabled extends InlineFunctions
  /* 0 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  @js.native
  sealed trait SimpleFunctions extends InlineFunctions
  /* 1 */ @js.native
  object SimpleFunctions extends TopLevel[SimpleFunctions with Double]
  
  @js.native
  sealed trait WithArguments extends InlineFunctions
  /* 2 */ @js.native
  object WithArguments extends TopLevel[WithArguments with Double]
  
  @js.native
  sealed trait WithArgumentsAndVariables extends InlineFunctions
  /* 3 */ @js.native
  object WithArgumentsAndVariables extends TopLevel[WithArgumentsAndVariables with Double]
}
