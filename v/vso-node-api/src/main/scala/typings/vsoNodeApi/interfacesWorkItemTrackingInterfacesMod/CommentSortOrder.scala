package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommentSortOrder extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "CommentSortOrder")
@js.native
object CommentSortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CommentSortOrder & Double] = js.native
  
  @js.native
  sealed trait Asc
    extends StObject
       with CommentSortOrder
  /* 1 */ val Asc: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder.Asc & Double = js.native
  
  @js.native
  sealed trait Desc
    extends StObject
       with CommentSortOrder
  /* 2 */ val Desc: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.CommentSortOrder.Desc & Double = js.native
}
