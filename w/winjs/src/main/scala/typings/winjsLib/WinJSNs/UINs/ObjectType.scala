package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait footer
    extends winjsLib.WinJSNs.UINs.ObjectType
  
  /**
    * The object is a group header in the list.
    **/
  @js.native
  sealed trait groupHeader
    extends winjsLib.WinJSNs.UINs.ObjectType
  
  /**
    * The object is the header for the list.
    **/
  @js.native
  sealed trait header
    extends winjsLib.WinJSNs.UINs.ObjectType
  
  /**
    * The object is an item in the list.
    **/
  @js.native
  sealed trait item
    extends winjsLib.WinJSNs.UINs.ObjectType
  
  /* 3 */ val footer: footer with scala.Double = js.native
  /* 0 */ val groupHeader: groupHeader with scala.Double = js.native
  /* 2 */ val header: header with scala.Double = js.native
  /* 1 */ val item: item with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.ObjectType with scala.Double] = js.native
}

