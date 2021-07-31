package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
@JSImport("vso-node-api/interfaces/WorkItemTrackingProcessInterfaces", "FieldType")
@js.native
object FieldType extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType & scala.Double] = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with FieldType
  /* 12 */ val Boolean: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Boolean & scala.Double = js.native
  
  @js.native
  sealed trait DateTime
    extends StObject
       with FieldType
  /* 3 */ val DateTime: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.DateTime & scala.Double = js.native
  
  @js.native
  sealed trait Double
    extends StObject
       with FieldType
  /* 10 */ val Double: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Double & scala.Double = js.native
  
  @js.native
  sealed trait Guid
    extends StObject
       with FieldType
  /* 11 */ val Guid: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Guid & scala.Double = js.native
  
  @js.native
  sealed trait History
    extends StObject
       with FieldType
  /* 9 */ val History: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.History & scala.Double = js.native
  
  @js.native
  sealed trait Html
    extends StObject
       with FieldType
  /* 7 */ val Html: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Html & scala.Double = js.native
  
  @js.native
  sealed trait Identity
    extends StObject
       with FieldType
  /* 13 */ val Identity: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Identity & scala.Double = js.native
  
  @js.native
  sealed trait Integer
    extends StObject
       with FieldType
  /* 2 */ val Integer: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.Integer & scala.Double = js.native
  
  @js.native
  sealed trait PicklistDouble
    extends StObject
       with FieldType
  /* 16 */ val PicklistDouble: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PicklistDouble & scala.Double = js.native
  
  @js.native
  sealed trait PicklistInteger
    extends StObject
       with FieldType
  /* 14 */ val PicklistInteger: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PicklistInteger & scala.Double = js.native
  
  @js.native
  sealed trait PicklistString
    extends StObject
       with FieldType
  /* 15 */ val PicklistString: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PicklistString & scala.Double = js.native
  
  @js.native
  sealed trait PlainText
    extends StObject
       with FieldType
  /* 5 */ val PlainText: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.PlainText & scala.Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with FieldType
  /* 1 */ val String: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.String & scala.Double = js.native
  
  @js.native
  sealed trait TreePath
    extends StObject
       with FieldType
  /* 8 */ val TreePath: typings.vsoNodeApi.workItemTrackingProcessInterfacesMod.FieldType.TreePath & scala.Double = js.native
}
