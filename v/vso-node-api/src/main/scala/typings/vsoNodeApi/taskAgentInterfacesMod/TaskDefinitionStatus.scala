package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskDefinitionStatus extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskDefinitionStatus")
@js.native
object TaskDefinitionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskDefinitionStatus with Double] = js.native
  
  @js.native
  sealed trait AlreadyUpToDate extends TaskDefinitionStatus
  /* 8 */ @js.native
  object AlreadyUpToDate extends TopLevel[AlreadyUpToDate with Double]
  
  @js.native
  sealed trait InlineUpdateReceived extends TaskDefinitionStatus
  /* 9 */ @js.native
  object InlineUpdateReceived extends TopLevel[InlineUpdateReceived with Double]
  
  @js.native
  sealed trait Installed extends TaskDefinitionStatus
  /* 3 */ @js.native
  object Installed extends TopLevel[Installed with Double]
  
  @js.native
  sealed trait Preinstalled extends TaskDefinitionStatus
  /* 1 */ @js.native
  object Preinstalled extends TopLevel[Preinstalled with Double]
  
  @js.native
  sealed trait ReceivedInstallOrUpdate extends TaskDefinitionStatus
  /* 2 */ @js.native
  object ReceivedInstallOrUpdate extends TopLevel[ReceivedInstallOrUpdate with Double]
  
  @js.native
  sealed trait ReceivedUninstall extends TaskDefinitionStatus
  /* 4 */ @js.native
  object ReceivedUninstall extends TopLevel[ReceivedUninstall with Double]
  
  @js.native
  sealed trait RequestedUpdate extends TaskDefinitionStatus
  /* 6 */ @js.native
  object RequestedUpdate extends TopLevel[RequestedUpdate with Double]
  
  @js.native
  sealed trait Uninstalled extends TaskDefinitionStatus
  /* 5 */ @js.native
  object Uninstalled extends TopLevel[Uninstalled with Double]
  
  @js.native
  sealed trait Updated extends TaskDefinitionStatus
  /* 7 */ @js.native
  object Updated extends TopLevel[Updated with Double]
}
