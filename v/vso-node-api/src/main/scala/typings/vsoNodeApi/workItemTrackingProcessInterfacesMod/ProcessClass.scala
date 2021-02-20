package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessClass extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "ProcessClass")
@js.native
object ProcessClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessClass with Double] = js.native
  
  @js.native
  sealed trait Custom extends ProcessClass
  /* 2 */ val Custom: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.ProcessClass.Custom with Double = js.native
  
  @js.native
  sealed trait Derived extends ProcessClass
  /* 1 */ val Derived: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.ProcessClass.Derived with Double = js.native
  
  @js.native
  sealed trait System extends ProcessClass
  /* 0 */ val System: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.ProcessClass.System with Double = js.native
}
