package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkItemTypeFieldsExpandLevel extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "WorkItemTypeFieldsExpandLevel")
@js.native
object WorkItemTypeFieldsExpandLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkItemTypeFieldsExpandLevel with Double] = js.native
  
  /**
    * Includes allowed values and dependent fields of the field.
    */
  @js.native
  sealed trait All extends WorkItemTypeFieldsExpandLevel
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * Includes allowed values for the field.
    */
  @js.native
  sealed trait AllowedValues extends WorkItemTypeFieldsExpandLevel
  /* 1 */ @js.native
  object AllowedValues extends TopLevel[AllowedValues with Double]
  
  /**
    * Includes dependent fields of the field.
    */
  @js.native
  sealed trait DependentFields extends WorkItemTypeFieldsExpandLevel
  /* 2 */ @js.native
  object DependentFields extends TopLevel[DependentFields with Double]
  
  /**
    * Includes only basic properties of the field.
    */
  @js.native
  sealed trait None extends WorkItemTypeFieldsExpandLevel
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
