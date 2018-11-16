package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("Windows.UI.Text.SelectionType")
@js.native
object SelectionType extends js.Object {
  @js.native
  sealed trait inlineShape
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionType
  
  @js.native
  sealed trait insertionPoint
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionType
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionType
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionType
  
  @js.native
  sealed trait shape
    extends winrtLib.WindowsNs.UINs.TextNs.SelectionType
  
  val inlineShape: inlineShape with java.lang.String = js.native
  val insertionPoint: insertionPoint with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val shape: shape with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.SelectionType with java.lang.String] = js.native
}

