package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
  sealed trait Boolean
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Datetime field type.
    */
  @js.native
  sealed trait DateTime
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Double field type.
    */
  @js.native
  sealed trait Double
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Guid field type.
    */
  @js.native
  sealed trait Guid
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * History field type.
    */
  @js.native
  sealed trait History
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * HTML (Multiline) field type.
    */
  @js.native
  sealed trait Html
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Identity field type.
    */
  @js.native
  sealed trait Identity
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Integer field type.
    */
  @js.native
  sealed trait Integer
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Double picklist field type.
    */
  @js.native
  sealed trait PicklistDouble
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Integer picklist field type.
    */
  @js.native
  sealed trait PicklistInteger
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * String picklist field type.
    */
  @js.native
  sealed trait PicklistString
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Plain text field type.
    */
  @js.native
  sealed trait PlainText
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * String field type.
    */
  @js.native
  sealed trait String
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /**
    * Treepath field type.
    */
  @js.native
  sealed trait TreePath
    extends vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType
  
  /* 9 */ val Boolean: Boolean with scala.Double = js.native
  /* 2 */ val DateTime: DateTime with scala.Double = js.native
  /* 7 */ val Double: Double with scala.Double = js.native
  /* 8 */ val Guid: Guid with scala.Double = js.native
  /* 6 */ val History: History with scala.Double = js.native
  /* 4 */ val Html: Html with scala.Double = js.native
  /* 10 */ val Identity: Identity with scala.Double = js.native
  /* 1 */ val Integer: Integer with scala.Double = js.native
  /* 13 */ val PicklistDouble: PicklistDouble with scala.Double = js.native
  /* 12 */ val PicklistInteger: PicklistInteger with scala.Double = js.native
  /* 11 */ val PicklistString: PicklistString with scala.Double = js.native
  /* 3 */ val PlainText: PlainText with scala.Double = js.native
  /* 0 */ val String: String with scala.Double = js.native
  /* 5 */ val TreePath: TreePath with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod.FieldType with scala.Double
  ] = js.native
}

