package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

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
  
  /* 1 */ val ExtensionFields: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand.ExtensionFields with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetFieldsExpand with Double] = js.native
}

