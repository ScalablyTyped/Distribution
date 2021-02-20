package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PageType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessDefinitionsInterfaces", "PageType")
@js.native
object PageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
  
  @js.native
  sealed trait Attachments extends PageType
  /* 4 */ val Attachments: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.PageType.Attachments with Double = js.native
  
  @js.native
  sealed trait Custom extends PageType
  /* 1 */ val Custom: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.PageType.Custom with Double = js.native
  
  @js.native
  sealed trait History extends PageType
  /* 2 */ val History: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.PageType.History with Double = js.native
  
  @js.native
  sealed trait Links extends PageType
  /* 3 */ val Links: typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod.PageType.Links with Double = js.native
}
