package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldType extends js.Object

@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "FieldType")
@js.native
object FieldType extends js.Object {
  /**
    * Boolean field type.
    */
  @js.native
  sealed trait Boolean extends FieldType
  
  /**
    * Datetime field type.
    */
  @js.native
  sealed trait DateTime extends FieldType
  
  /**
    * Double field type.
    */
  @js.native
  sealed trait Double extends FieldType
  
  /**
    * Guid field type.
    */
  @js.native
  sealed trait Guid extends FieldType
  
  /**
    * History field type.
    */
  @js.native
  sealed trait History extends FieldType
  
  /**
    * HTML (Multiline) field type.
    */
  @js.native
  sealed trait Html extends FieldType
  
  /**
    * Identity field type.
    */
  @js.native
  sealed trait Identity extends FieldType
  
  /**
    * Integer field type.
    */
  @js.native
  sealed trait Integer extends FieldType
  
  /**
    * Double picklist field type.
    */
  @js.native
  sealed trait PicklistDouble extends FieldType
  
  /**
    * Integer picklist field type.
    */
  @js.native
  sealed trait PicklistInteger extends FieldType
  
  /**
    * String picklist field type.
    */
  @js.native
  sealed trait PicklistString extends FieldType
  
  /**
    * Plain text field type.
    */
  @js.native
  sealed trait PlainText extends FieldType
  
  /**
    * String field type.
    */
  @js.native
  sealed trait String extends FieldType
  
  /**
    * Treepath field type.
    */
  @js.native
  sealed trait TreePath extends FieldType
  
  /* 9 */ val Boolean: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Boolean with scala.Double = js.native
  /* 2 */ val DateTime: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.DateTime with scala.Double = js.native
  /* 7 */ val Double: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Double with scala.Double = js.native
  /* 8 */ val Guid: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Guid with scala.Double = js.native
  /* 6 */ val History: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.History with scala.Double = js.native
  /* 4 */ val Html: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Html with scala.Double = js.native
  /* 10 */ val Identity: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Identity with scala.Double = js.native
  /* 1 */ val Integer: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Integer with scala.Double = js.native
  /* 13 */ val PicklistDouble: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PicklistDouble with scala.Double = js.native
  /* 12 */ val PicklistInteger: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PicklistInteger with scala.Double = js.native
  /* 11 */ val PicklistString: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PicklistString with scala.Double = js.native
  /* 3 */ val PlainText: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PlainText with scala.Double = js.native
  /* 0 */ val String: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.String with scala.Double = js.native
  /* 5 */ val TreePath: typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod.FieldType.TreePath with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
}

