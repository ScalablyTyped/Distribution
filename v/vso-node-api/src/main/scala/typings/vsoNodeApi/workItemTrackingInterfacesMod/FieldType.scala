package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
  
  /**
    * Boolean field type.
    */
  @js.native
  sealed trait Boolean extends FieldType
  /* 9 */ val Boolean: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.Boolean with scala.Double = js.native
  
  /**
    * Datetime field type.
    */
  @js.native
  sealed trait DateTime extends FieldType
  /* 2 */ val DateTime: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.DateTime with scala.Double = js.native
  
  /**
    * Double field type.
    */
  @js.native
  sealed trait Double extends FieldType
  /* 7 */ val Double: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.Double with scala.Double = js.native
  
  /**
    * Guid field type.
    */
  @js.native
  sealed trait Guid extends FieldType
  /* 8 */ val Guid: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.Guid with scala.Double = js.native
  
  /**
    * History field type.
    */
  @js.native
  sealed trait History extends FieldType
  /* 6 */ val History: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.History with scala.Double = js.native
  
  /**
    * HTML (Multiline) field type.
    */
  @js.native
  sealed trait Html extends FieldType
  /* 4 */ val Html: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.Html with scala.Double = js.native
  
  /**
    * Identity field type.
    */
  @js.native
  sealed trait Identity extends FieldType
  /* 10 */ val Identity: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.Identity with scala.Double = js.native
  
  /**
    * Integer field type.
    */
  @js.native
  sealed trait Integer extends FieldType
  /* 1 */ val Integer: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.Integer with scala.Double = js.native
  
  /**
    * Double picklist field type.
    */
  @js.native
  sealed trait PicklistDouble extends FieldType
  /* 13 */ val PicklistDouble: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.PicklistDouble with scala.Double = js.native
  
  /**
    * Integer picklist field type.
    */
  @js.native
  sealed trait PicklistInteger extends FieldType
  /* 12 */ val PicklistInteger: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.PicklistInteger with scala.Double = js.native
  
  /**
    * String picklist field type.
    */
  @js.native
  sealed trait PicklistString extends FieldType
  /* 11 */ val PicklistString: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.PicklistString with scala.Double = js.native
  
  /**
    * Plain text field type.
    */
  @js.native
  sealed trait PlainText extends FieldType
  /* 3 */ val PlainText: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.PlainText with scala.Double = js.native
  
  /**
    * String field type.
    */
  @js.native
  sealed trait String extends FieldType
  /* 0 */ val String: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.String with scala.Double = js.native
  
  /**
    * Treepath field type.
    */
  @js.native
  sealed trait TreePath extends FieldType
  /* 5 */ val TreePath: typings.vsoNodeApi.workItemTrackingInterfacesMod.FieldType.TreePath with scala.Double = js.native
}
