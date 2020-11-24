package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetProcessExpandLevel extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "GetProcessExpandLevel")
@js.native
object GetProcessExpandLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetProcessExpandLevel with Double] = js.native
  
  @js.native
  sealed trait None extends GetProcessExpandLevel
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Projects extends GetProcessExpandLevel
  /* 1 */ @js.native
  object Projects extends TopLevel[Projects with Double]
}
