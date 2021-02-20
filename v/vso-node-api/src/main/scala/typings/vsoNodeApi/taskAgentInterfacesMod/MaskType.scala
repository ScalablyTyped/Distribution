package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaskType extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MaskType")
@js.native
object MaskType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaskType with Double] = js.native
  
  @js.native
  sealed trait Regex extends MaskType
  /* 2 */ val Regex: typings.vsoNodeApi.taskAgentInterfacesMod.MaskType.Regex with Double = js.native
  
  @js.native
  sealed trait Variable extends MaskType
  /* 1 */ val Variable: typings.vsoNodeApi.taskAgentInterfacesMod.MaskType.Variable with Double = js.native
}
