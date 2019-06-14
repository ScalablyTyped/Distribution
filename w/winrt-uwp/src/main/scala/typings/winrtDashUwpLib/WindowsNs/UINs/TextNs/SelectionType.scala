package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

/** Specifies the type of a selection. */
@JSGlobal("Windows.UI.Text.SelectionType")
@js.native
object SelectionType extends js.Object {
  /** An image (see ITextRange.InsertImage ). */
  @js.native
  sealed trait inlineShape
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionType
  
  /** An insertion point. */
  @js.native
  sealed trait insertionPoint
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionType
  
  /** No selection and no insertion point. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionType
  
  /** A single nondegenerate range. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionType
  
  /** A shape. */
  @js.native
  sealed trait shape
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionType
  
  /* 3 */ val inlineShape: inlineShape with scala.Double = js.native
  /* 1 */ val insertionPoint: insertionPoint with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val normal: normal with scala.Double = js.native
  /* 4 */ val shape: shape with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionType with scala.Double] = js.native
}

