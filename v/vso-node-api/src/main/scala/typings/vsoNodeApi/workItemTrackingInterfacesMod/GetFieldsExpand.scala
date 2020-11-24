package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GetFieldsExpand extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "GetFieldsExpand")
@js.native
object GetFieldsExpand extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GetFieldsExpand with Double] = js.native
  
  /**
    * Adds extension fields to the response.
    */
  @js.native
  sealed trait ExtensionFields extends GetFieldsExpand
  /* 1 */ @js.native
  object ExtensionFields extends TopLevel[ExtensionFields with Double]
  
  /**
    * Default behavior.
    */
  @js.native
  sealed trait None extends GetFieldsExpand
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
