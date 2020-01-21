package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemTypeClass extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "WorkItemTypeClass")
@js.native
object WorkItemTypeClass extends js.Object {
  @js.native
  sealed trait Custom extends WorkItemTypeClass
  
  @js.native
  sealed trait Derived extends WorkItemTypeClass
  
  @js.native
  sealed trait System extends WorkItemTypeClass
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeClass with Double] = js.native
  /* 2 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 1 */ @js.native
  object Derived extends TopLevel[Derived with Double]
  
  /* 0 */ @js.native
  object System extends TopLevel[System with Double]
  
}

