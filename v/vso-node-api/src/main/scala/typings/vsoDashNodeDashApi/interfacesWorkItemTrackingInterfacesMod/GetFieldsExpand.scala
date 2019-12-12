package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand.ExtensionFields
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GetFieldsExpand extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "GetFieldsExpand")
@js.native
object GetFieldsExpand extends js.Object {
  /**
    * Adds extension fields to the response.
    */
  @js.native
  sealed trait ExtensionFields extends GetFieldsExpand
  
  /**
    * Default behavior.
    */
  @js.native
  sealed trait None extends GetFieldsExpand
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetFieldsExpand with Double] = js.native
  /* 1 */ @js.native
  object ExtensionFields extends TopLevel[ExtensionFields with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

