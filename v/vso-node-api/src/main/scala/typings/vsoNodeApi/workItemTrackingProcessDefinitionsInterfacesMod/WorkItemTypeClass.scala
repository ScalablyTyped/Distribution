package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemTypeClass extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "WorkItemTypeClass")
@js.native
object WorkItemTypeClass extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeClass with Double] = js.native
  
  @js.native
  sealed trait Custom extends WorkItemTypeClass
  /* 2 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  @js.native
  sealed trait Derived extends WorkItemTypeClass
  /* 1 */ @js.native
  object Derived extends TopLevel[Derived with Double]
  
  @js.native
  sealed trait System extends WorkItemTypeClass
  /* 0 */ @js.native
  object System extends TopLevel[System with Double]
}
