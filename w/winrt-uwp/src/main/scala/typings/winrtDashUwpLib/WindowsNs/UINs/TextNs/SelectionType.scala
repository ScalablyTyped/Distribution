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
  
  val inlineShape: inlineShape with java.lang.String = js.native
  val insertionPoint: insertionPoint with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val shape: shape with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionType with java.lang.String] = js.native
}

