package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "PageType")
@js.native
object PageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
  
  @js.native
  sealed trait Attachments extends PageType
  /* 4 */ @js.native
  object Attachments extends TopLevel[Attachments with Double]
  
  @js.native
  sealed trait Custom extends PageType
  /* 1 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  @js.native
  sealed trait History extends PageType
  /* 2 */ @js.native
  object History extends TopLevel[History with Double]
  
  @js.native
  sealed trait Links extends PageType
  /* 3 */ @js.native
  object Links extends TopLevel[Links with Double]
}
