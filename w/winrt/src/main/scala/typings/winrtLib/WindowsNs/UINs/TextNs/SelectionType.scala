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
  
  /* 3 */ val inlineShape: inlineShape with scala.Double = js.native
  /* 1 */ val insertionPoint: insertionPoint with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val normal: normal with scala.Double = js.native
  /* 4 */ val shape: shape with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.SelectionType with scala.Double] = js.native
}

