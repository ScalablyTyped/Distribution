package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.All
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.AllowedValues
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.DependentFields
import typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.None
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
  sealed trait All extends WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes allowed values for the field.
    */
  @js.native
  sealed trait AllowedValues extends WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes dependent fields of the field.
    */
  @js.native
  sealed trait DependentFields extends WorkItemTypeFieldsExpandLevel
  
  /**
    * Includes only basic properties of the field.
    */
  @js.native
  sealed trait None extends WorkItemTypeFieldsExpandLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeFieldsExpandLevel with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object AllowedValues extends TopLevel[AllowedValues with Double]
  
  /* 2 */ @js.native
  object DependentFields extends TopLevel[DependentFields with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

