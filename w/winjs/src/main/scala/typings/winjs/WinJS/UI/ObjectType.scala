package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ObjectType extends js.Object

/**
  * Describes the type of object in a ListView.
  **/
@JSGlobal("WinJS.UI.ObjectType")
@js.native
object ObjectType extends js.Object {
  /**
    * The object is the footer for the list.
    **/
  @js.native
  sealed trait footer extends ObjectType
  
  /**
    * The object is a group header in the list.
    **/
  @js.native
  sealed trait groupHeader extends ObjectType
  
  /**
    * The object is the header for the list.
    **/
  @js.native
  sealed trait header extends ObjectType
  
  /**
    * The object is an item in the list.
    **/
  @js.native
  sealed trait item extends ObjectType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectType with Double] = js.native
  /* 3 */ @js.native
  object footer extends TopLevel[footer with Double]
  
  /* 0 */ @js.native
  object groupHeader extends TopLevel[groupHeader with Double]
  
  /* 2 */ @js.native
  object header extends TopLevel[header with Double]
  
  /* 1 */ @js.native
  object item extends TopLevel[item with Double]
  
}

