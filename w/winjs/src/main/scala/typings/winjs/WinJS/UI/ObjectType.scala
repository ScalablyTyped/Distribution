package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
