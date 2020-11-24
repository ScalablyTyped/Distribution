package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
