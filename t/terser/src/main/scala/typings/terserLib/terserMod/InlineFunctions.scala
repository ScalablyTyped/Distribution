package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InlineFunctions extends js.Object

@JSImport("terser", "InlineFunctions")
@js.native
object InlineFunctions extends js.Object {
  @js.native
  sealed trait Disabled
    extends terserLib.terserMod.InlineFunctions
  
  @js.native
  sealed trait SimpleFunctions
    extends terserLib.terserMod.InlineFunctions
  
  @js.native
  sealed trait WithArguments
    extends terserLib.terserMod.InlineFunctions
  
  @js.native
  sealed trait WithArgumentsAndVariables
    extends terserLib.terserMod.InlineFunctions
  
  /* 0 */ val Disabled: Disabled with scala.Double = js.native
  /* 1 */ val SimpleFunctions: SimpleFunctions with scala.Double = js.native
  /* 2 */ val WithArguments: WithArguments with scala.Double = js.native
  /* 3 */ val WithArgumentsAndVariables: WithArgumentsAndVariables with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[terserLib.terserMod.InlineFunctions with scala.Double] = js.native
}

