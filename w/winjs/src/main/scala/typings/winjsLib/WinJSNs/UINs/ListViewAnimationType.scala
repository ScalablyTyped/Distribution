package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListViewAnimationType extends js.Object

/**
  * Specifies that type of animation for which a contentanimating event was raised.
  **/
@JSGlobal("WinJS.UI.ListViewAnimationType")
@js.native
object ListViewAnimationType extends js.Object {
  /**
    * The animation plays when the ListView is changing its content.
    **/
  @js.native
  sealed trait contentTransition
    extends winjsLib.WinJSNs.UINs.ListViewAnimationType
  
  /**
    * The animation plays when the ListView is first displayed.
    **/
  @js.native
  sealed trait entrance
    extends winjsLib.WinJSNs.UINs.ListViewAnimationType
  
  val contentTransition: contentTransition with java.lang.String = js.native
  val entrance: entrance with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.ListViewAnimationType with java.lang.String] = js.native
}

