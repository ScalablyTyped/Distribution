package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[FieldType with scala.Double] = js.native
  /* 9 */ @js.native
  object Boolean
    extends TopLevel[Boolean with scala.Double]
  
  /* 2 */ @js.native
  object DateTime
    extends TopLevel[DateTime with scala.Double]
  
  /* 7 */ @js.native
  object Double
    extends TopLevel[Double with scala.Double]
  
  /* 8 */ @js.native
  object Guid
    extends TopLevel[Guid with scala.Double]
  
  /* 6 */ @js.native
  object History
    extends TopLevel[History with scala.Double]
  
  /* 4 */ @js.native
  object Html
    extends TopLevel[Html with scala.Double]
  
  /* 10 */ @js.native
  object Identity
    extends TopLevel[Identity with scala.Double]
  
  /* 1 */ @js.native
  object Integer
    extends TopLevel[Integer with scala.Double]
  
  /* 13 */ @js.native
  object PicklistDouble
    extends TopLevel[PicklistDouble with scala.Double]
  
  /* 12 */ @js.native
  object PicklistInteger
    extends TopLevel[PicklistInteger with scala.Double]
  
  /* 11 */ @js.native
  object PicklistString
    extends TopLevel[PicklistString with scala.Double]
  
  /* 3 */ @js.native
  object PlainText
    extends TopLevel[PlainText with scala.Double]
  
  /* 0 */ @js.native
  object String
    extends TopLevel[String with scala.Double]
  
  /* 5 */ @js.native
  object TreePath
    extends TopLevel[TreePath with scala.Double]
  
}

