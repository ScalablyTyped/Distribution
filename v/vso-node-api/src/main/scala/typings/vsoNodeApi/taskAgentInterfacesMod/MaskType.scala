package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaskType extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MaskType")
@js.native
object MaskType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaskType with Double] = js.native
  
  @js.native
  sealed trait Regex extends MaskType
  /* 2 */ @js.native
  object Regex extends TopLevel[Regex with Double]
  
  @js.native
  sealed trait Variable extends MaskType
  /* 1 */ @js.native
  object Variable extends TopLevel[Variable with Double]
}
