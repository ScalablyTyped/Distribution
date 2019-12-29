package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait Attachments extends PageType
  
  @js.native
  sealed trait Custom extends PageType
  
  @js.native
  sealed trait History extends PageType
  
  @js.native
  sealed trait Links extends PageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
  /* 4 */ @js.native
  object Attachments extends TopLevel[Attachments with Double]
  
  /* 1 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 2 */ @js.native
  object History extends TopLevel[History with Double]
  
  /* 3 */ @js.native
  object Links extends TopLevel[Links with Double]
  
}

