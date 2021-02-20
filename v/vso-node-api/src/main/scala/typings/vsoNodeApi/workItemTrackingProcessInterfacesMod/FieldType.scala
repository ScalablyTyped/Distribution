package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
  
  @js.native
  sealed trait Boolean extends FieldType
  /* 12 */ val Boolean: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Boolean with scala.Double = js.native
  
  @js.native
  sealed trait DateTime extends FieldType
  /* 3 */ val DateTime: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.DateTime with scala.Double = js.native
  
  @js.native
  sealed trait Double extends FieldType
  /* 10 */ val Double: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Double with scala.Double = js.native
  
  @js.native
  sealed trait Guid extends FieldType
  /* 11 */ val Guid: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Guid with scala.Double = js.native
  
  @js.native
  sealed trait History extends FieldType
  /* 9 */ val History: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.History with scala.Double = js.native
  
  @js.native
  sealed trait Html extends FieldType
  /* 7 */ val Html: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Html with scala.Double = js.native
  
  @js.native
  sealed trait Identity extends FieldType
  /* 13 */ val Identity: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Identity with scala.Double = js.native
  
  @js.native
  sealed trait Integer extends FieldType
  /* 2 */ val Integer: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Integer with scala.Double = js.native
  
  @js.native
  sealed trait PicklistDouble extends FieldType
  /* 16 */ val PicklistDouble: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PicklistDouble with scala.Double = js.native
  
  @js.native
  sealed trait PicklistInteger extends FieldType
  /* 14 */ val PicklistInteger: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PicklistInteger with scala.Double = js.native
  
  @js.native
  sealed trait PicklistString extends FieldType
  /* 15 */ val PicklistString: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PicklistString with scala.Double = js.native
  
  @js.native
  sealed trait PlainText extends FieldType
  /* 5 */ val PlainText: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PlainText with scala.Double = js.native
  
  @js.native
  sealed trait String extends FieldType
  /* 1 */ val String: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.String with scala.Double = js.native
  
  @js.native
  sealed trait TreePath extends FieldType
  /* 8 */ val TreePath: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.TreePath with scala.Double = js.native
}
