package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkChangeType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "LinkChangeType")
@js.native
object LinkChangeType extends js.Object {
  @js.native
  sealed trait Create extends LinkChangeType
  
  @js.native
  sealed trait Remove extends LinkChangeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkChangeType with Double] = js.native
  /* 0 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  /* 1 */ @js.native
  object Remove extends TopLevel[Remove with Double]
  
}

