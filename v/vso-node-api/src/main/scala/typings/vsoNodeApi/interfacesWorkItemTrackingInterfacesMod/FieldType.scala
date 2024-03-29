package typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType & scala.Double] = js.native
  
  /**
    * Boolean field type.
    */
  @js.native
  sealed trait Boolean
    extends StObject
       with FieldType
  /* 9 */ val Boolean: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Boolean & scala.Double = js.native
  
  /**
    * Datetime field type.
    */
  @js.native
  sealed trait DateTime
    extends StObject
       with FieldType
  /* 2 */ val DateTime: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.DateTime & scala.Double = js.native
  
  /**
    * Double field type.
    */
  @js.native
  sealed trait Double
    extends StObject
       with FieldType
  /* 7 */ val Double: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Double & scala.Double = js.native
  
  /**
    * Guid field type.
    */
  @js.native
  sealed trait Guid
    extends StObject
       with FieldType
  /* 8 */ val Guid: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Guid & scala.Double = js.native
  
  /**
    * History field type.
    */
  @js.native
  sealed trait History
    extends StObject
       with FieldType
  /* 6 */ val History: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.History & scala.Double = js.native
  
  /**
    * HTML (Multiline) field type.
    */
  @js.native
  sealed trait Html
    extends StObject
       with FieldType
  /* 4 */ val Html: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Html & scala.Double = js.native
  
  /**
    * Identity field type.
    */
  @js.native
  sealed trait Identity
    extends StObject
       with FieldType
  /* 10 */ val Identity: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Identity & scala.Double = js.native
  
  /**
    * Integer field type.
    */
  @js.native
  sealed trait Integer
    extends StObject
       with FieldType
  /* 1 */ val Integer: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.Integer & scala.Double = js.native
  
  /**
    * Double picklist field type.
    */
  @js.native
  sealed trait PicklistDouble
    extends StObject
       with FieldType
  /* 13 */ val PicklistDouble: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PicklistDouble & scala.Double = js.native
  
  /**
    * Integer picklist field type.
    */
  @js.native
  sealed trait PicklistInteger
    extends StObject
       with FieldType
  /* 12 */ val PicklistInteger: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PicklistInteger & scala.Double = js.native
  
  /**
    * String picklist field type.
    */
  @js.native
  sealed trait PicklistString
    extends StObject
       with FieldType
  /* 11 */ val PicklistString: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PicklistString & scala.Double = js.native
  
  /**
    * Plain text field type.
    */
  @js.native
  sealed trait PlainText
    extends StObject
       with FieldType
  /* 3 */ val PlainText: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.PlainText & scala.Double = js.native
  
  /**
    * String field type.
    */
  @js.native
  sealed trait String
    extends StObject
       with FieldType
  /* 0 */ val String: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.String & scala.Double = js.native
  
  /**
    * Treepath field type.
    */
  @js.native
  sealed trait TreePath
    extends StObject
       with FieldType
  /* 5 */ val TreePath: typings.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod.FieldType.TreePath & scala.Double = js.native
}
