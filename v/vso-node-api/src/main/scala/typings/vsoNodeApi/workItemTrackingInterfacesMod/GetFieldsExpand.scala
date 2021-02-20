package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetFieldsExpand extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "GetFieldsExpand")
@js.native
object GetFieldsExpand extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetFieldsExpand with Double] = js.native
  
  /**
    * Adds extension fields to the response.
    */
  @js.native
  sealed trait ExtensionFields extends GetFieldsExpand
  /* 1 */ val ExtensionFields: typings.vsoNodeApi.workItemTrackingInterfacesMod.GetFieldsExpand.ExtensionFields with Double = js.native
  
  /**
    * Default behavior.
    */
  @js.native
  sealed trait None extends GetFieldsExpand
  /* 0 */ val None: typings.vsoNodeApi.workItemTrackingInterfacesMod.GetFieldsExpand.None with Double = js.native
}
