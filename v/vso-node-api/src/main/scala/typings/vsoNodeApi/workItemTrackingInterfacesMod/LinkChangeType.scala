package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkChangeType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkChangeType")
@js.native
object LinkChangeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkChangeType with Double] = js.native
  
  @js.native
  sealed trait Create extends LinkChangeType
  /* 0 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  @js.native
  sealed trait Remove extends LinkChangeType
  /* 1 */ @js.native
  object Remove extends TopLevel[Remove with Double]
}
