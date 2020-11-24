package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetBehaviorsExpand extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetBehaviorsExpand")
@js.native
object GetBehaviorsExpand extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetBehaviorsExpand with Double] = js.native
  
  @js.native
  sealed trait Fields extends GetBehaviorsExpand
  /* 1 */ @js.native
  object Fields extends TopLevel[Fields with Double]
  
  @js.native
  sealed trait None extends GetBehaviorsExpand
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
