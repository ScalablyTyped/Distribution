package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetFieldsExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "GetFieldsExpand")
@js.native
object GetFieldsExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetFieldsExpand & Double] = js.native
  
  /**
    * Adds extension fields to the response.
    */
  @js.native
  sealed trait ExtensionFields
    extends StObject
       with GetFieldsExpand
  /* 1 */ val ExtensionFields: typings.vsoNodeApi.workItemTrackingInterfacesMod.GetFieldsExpand.ExtensionFields & Double = js.native
  
  /**
    * Default behavior.
    */
  @js.native
  sealed trait None
    extends StObject
       with GetFieldsExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingInterfacesMod.GetFieldsExpand.None & Double = js.native
}
