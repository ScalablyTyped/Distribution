package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkChangeType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkChangeType")
@js.native
object LinkChangeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkChangeType with Double] = js.native
  
  @js.native
  sealed trait Create extends LinkChangeType
  /* 0 */ val Create: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkChangeType.Create with Double = js.native
  
  @js.native
  sealed trait Remove extends LinkChangeType
  /* 1 */ val Remove: typings.vsoNodeApi.workItemTrackingInterfacesMod.LinkChangeType.Remove with Double = js.native
}
