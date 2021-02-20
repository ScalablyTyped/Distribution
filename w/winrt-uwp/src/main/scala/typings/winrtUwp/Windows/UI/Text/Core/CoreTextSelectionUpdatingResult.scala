package typings.winrtUwp.Windows.UI.Text.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoreTextSelectionUpdatingResult extends StObject
/** Defines constants that specify the result of handling the SelectionUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingResult")
@js.native
object CoreTextSelectionUpdatingResult extends StObject {
  
  /** The selection update operation was not completed as the text input server expected. */
  @js.native
  sealed trait failed extends CoreTextSelectionUpdatingResult
  
  /** The selection update operation completed successfully. */
  @js.native
  sealed trait succeeded extends CoreTextSelectionUpdatingResult
}
