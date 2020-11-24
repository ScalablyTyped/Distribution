package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProcessClass extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "ProcessClass")
@js.native
object ProcessClass extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessClass with Double] = js.native
  
  @js.native
  sealed trait Custom extends ProcessClass
  /* 2 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  @js.native
  sealed trait Derived extends ProcessClass
  /* 1 */ @js.native
  object Derived extends TopLevel[Derived with Double]
  
  @js.native
  sealed trait System extends ProcessClass
  /* 0 */ @js.native
  object System extends TopLevel[System with Double]
}
