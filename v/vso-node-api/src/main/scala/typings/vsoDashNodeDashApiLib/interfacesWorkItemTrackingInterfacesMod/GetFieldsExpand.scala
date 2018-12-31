package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  sealed trait ExtensionFields
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand
  
  /**
    * Default behavior.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand
  
  /* 1 */ val ExtensionFields: ExtensionFields with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.GetFieldsExpand with scala.Double
  ] = js.native
}

