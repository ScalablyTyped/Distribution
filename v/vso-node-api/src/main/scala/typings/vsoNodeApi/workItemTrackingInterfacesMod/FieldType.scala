package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends js.Object
@JSImport("vso-node-api/interfaces/WorkItemTrackingInterfaces", "FieldType")
@js.native
object FieldType extends js.Object {
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
  
  /**
    * Boolean field type.
    */
  @js.native
  sealed trait Boolean extends FieldType
  /* 9 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  /**
    * Datetime field type.
    */
  @js.native
  sealed trait DateTime extends FieldType
  /* 2 */ @js.native
  object DateTime
    extends TopLevel[DateTime with scala.Double]
  
  /**
    * Double field type.
    */
  @js.native
  sealed trait Double extends FieldType
  /* 7 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  /**
    * Guid field type.
    */
  @js.native
  sealed trait Guid extends FieldType
  /* 8 */ @js.native
  object Guid
    extends TopLevel[Guid with scala.Double]
  
  /**
    * History field type.
    */
  @js.native
  sealed trait History extends FieldType
  /* 6 */ @js.native
  object History
    extends TopLevel[History with scala.Double]
  
  /**
    * HTML (Multiline) field type.
    */
  @js.native
  sealed trait Html extends FieldType
  /* 4 */ @js.native
  object Html
    extends TopLevel[Html with scala.Double]
  
  /**
    * Identity field type.
    */
  @js.native
  sealed trait Identity extends FieldType
  /* 10 */ @js.native
  object Identity
    extends TopLevel[Identity with scala.Double]
  
  /**
    * Integer field type.
    */
  @js.native
  sealed trait Integer extends FieldType
  /* 1 */ @js.native
  object Integer
    extends TopLevel[Integer with scala.Double]
  
  /**
    * Double picklist field type.
    */
  @js.native
  sealed trait PicklistDouble extends FieldType
  /* 13 */ @js.native
  object PicklistDouble
    extends TopLevel[PicklistDouble with scala.Double]
  
  /**
    * Integer picklist field type.
    */
  @js.native
  sealed trait PicklistInteger extends FieldType
  /* 12 */ @js.native
  object PicklistInteger
    extends TopLevel[PicklistInteger with scala.Double]
  
  /**
    * String picklist field type.
    */
  @js.native
  sealed trait PicklistString extends FieldType
  /* 11 */ @js.native
  object PicklistString
    extends TopLevel[PicklistString with scala.Double]
  
  /**
    * Plain text field type.
    */
  @js.native
  sealed trait PlainText extends FieldType
  /* 3 */ @js.native
  object PlainText
    extends TopLevel[PlainText with scala.Double]
  
  /**
    * String field type.
    */
  @js.native
  sealed trait String extends FieldType
  /* 0 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  /**
    * Treepath field type.
    */
  @js.native
  sealed trait TreePath extends FieldType
  /* 5 */ @js.native
  object TreePath
    extends TopLevel[TreePath with scala.Double]
}
