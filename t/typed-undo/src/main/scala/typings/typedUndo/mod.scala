package typings.typedUndo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-undo", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * Create a new UndoManager
    *
    * @param limit The maximum amount of editables to remember
    */
  class UndoManager ()
    extends typings.typedUndo.undoManagerMod.UndoManager {
    def this(limit: Double) = this()
  }
  
  @js.native
  abstract class UndoableEdit ()
    extends typings.typedUndo.undoableEditMod.UndoableEdit
  
}

