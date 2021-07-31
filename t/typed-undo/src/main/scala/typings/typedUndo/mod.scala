package typings.typedUndo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed-undo", "UndoManager")
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
  
  @JSImport("typed-undo", "UndoableEdit")
  @js.native
  abstract class UndoableEdit ()
    extends typings.typedUndo.undoableEditMod.UndoableEdit
}
