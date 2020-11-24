package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemErrorPolicy extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemErrorPolicy")
@js.native
object WorkItemErrorPolicy extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemErrorPolicy with Double] = js.native
  
  @js.native
  sealed trait Fail extends WorkItemErrorPolicy
  /* 1 */ @js.native
  object Fail extends TopLevel[Fail with Double]
  
  @js.native
  sealed trait Omit extends WorkItemErrorPolicy
  /* 2 */ @js.native
  object Omit extends TopLevel[Omit with Double]
}
