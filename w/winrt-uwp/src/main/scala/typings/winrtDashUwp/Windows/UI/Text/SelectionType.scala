package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 3 */ @js.native
  object inlineShape extends TopLevel[inlineShape with Double]
  
  /* 1 */ @js.native
  object insertionPoint extends TopLevel[insertionPoint with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 4 */ @js.native
  object shape extends TopLevel[shape with Double]
  
}

