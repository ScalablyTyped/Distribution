package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  sealed trait inlineShape extends SelectionType
  
  /** An insertion point. */
  @js.native
  sealed trait insertionPoint extends SelectionType
  
  /** No selection and no insertion point. */
  @js.native
  sealed trait none extends SelectionType
  
  /** A single nondegenerate range. */
  @js.native
  sealed trait normal extends SelectionType
  
  /** A shape. */
  @js.native
  sealed trait shape extends SelectionType
  
  /* 3 */ val inlineShape: typings.winrtDashUwp.WindowsNs.UINs.TextNs.SelectionType.inlineShape with Double = js.native
  /* 1 */ val insertionPoint: typings.winrtDashUwp.WindowsNs.UINs.TextNs.SelectionType.insertionPoint with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.UINs.TextNs.SelectionType.none with Double = js.native
  /* 2 */ val normal: typings.winrtDashUwp.WindowsNs.UINs.TextNs.SelectionType.normal with Double = js.native
  /* 4 */ val shape: typings.winrtDashUwp.WindowsNs.UINs.TextNs.SelectionType.shape with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

