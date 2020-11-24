package typings.typedUndo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typed-undo/dist/UndoableEdit", JSImport.Namespace)
@js.native
object undoableEditMod extends js.Object {
  
  @js.native
  abstract class UndoableEdit () extends js.Object {
    
    /**
      * A significant edit is worthy to be saved and to be displayed to the user as undoable.
      * A typical insignificant edit would be if two edits got merged into one, ending up with the original.
      * Another example is when selection changes have been done, which don't change the data.
      *
      * @return true if the edit was significant
      */
    def isSignificant(): Boolean = js.native
    
    /**
      * Try to merge a new edit into an existing one. This can be used to merge smaller edits into larger edits.
      * For example a text editor can merge multiple changes into one, rather than having one edit per character change.
      *
      * @param edit The new edit
      * @returns true if the edit was merged, false otherwise
      */
    def merge(edit: UndoableEdit): Boolean = js.native
    
    /**
      * This action re-applies the changes of the edit.
      */
    def redo(): Unit = js.native
    
    /**
      * Try to replace an existing edit with a new one
      *
      * @param edit The new edit
      * @returns true if this edit should be replaced with the new one, false otherwise
      */
    def replace(edit: UndoableEdit): Boolean = js.native
    
    /**
      * This action reverts the changes of the edit.
      */
    def undo(): Unit = js.native
  }
}
