package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemTypeFieldsExpandLevel extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemTypeFieldsExpandLevel")
@js.native
object WorkItemTypeFieldsExpandLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeFieldsExpandLevel & Double] = js.native
  
  /**
    * Includes allowed values and dependent fields of the field.
    */
  @js.native
  sealed trait All
    extends StObject
       with WorkItemTypeFieldsExpandLevel
  /* 3 */ val All: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.All & Double = js.native
  
  /**
    * Includes allowed values for the field.
    */
  @js.native
  sealed trait AllowedValues
    extends StObject
       with WorkItemTypeFieldsExpandLevel
  /* 1 */ val AllowedValues: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.AllowedValues & Double = js.native
  
  /**
    * Includes dependent fields of the field.
    */
  @js.native
  sealed trait DependentFields
    extends StObject
       with WorkItemTypeFieldsExpandLevel
  /* 2 */ val DependentFields: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.DependentFields & Double = js.native
  
  /**
    * Includes only basic properties of the field.
    */
  @js.native
  sealed trait None
    extends StObject
       with WorkItemTypeFieldsExpandLevel
  /* 0 */ val None: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.WorkItemTypeFieldsExpandLevel.None & Double = js.native
}
