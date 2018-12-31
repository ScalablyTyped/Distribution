package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkItemTypeFieldsExpandLevel extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemTypeFieldsExpandLevel")
@js.native
object WorkItemTypeFieldsExpandLevel extends js.Object {
  /**
    * Includes allowed values and dependent fields of the field.
    */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes allowed values for the field.
    */
  @js.native
  sealed trait AllowedValues
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes dependent fields of the field.
    */
  @js.native
  sealed trait DependentFields
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes only basic properties of the field.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 1 */ val AllowedValues: AllowedValues with scala.Double = js.native
  /* 2 */ val DependentFields: DependentFields with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel with scala.Double
  ] = js.native
}

