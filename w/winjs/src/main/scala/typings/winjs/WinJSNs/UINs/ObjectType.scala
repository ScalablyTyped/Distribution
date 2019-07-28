package typings.winjs.WinJSNs.UINs

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
  
  /* 3 */ val footer: typings.winjs.WinJSNs.UINs.ObjectType.footer with Double = js.native
  /* 0 */ val groupHeader: typings.winjs.WinJSNs.UINs.ObjectType.groupHeader with Double = js.native
  /* 2 */ val header: typings.winjs.WinJSNs.UINs.ObjectType.header with Double = js.native
  /* 1 */ val item: typings.winjs.WinJSNs.UINs.ObjectType.item with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectType with Double] = js.native
}

