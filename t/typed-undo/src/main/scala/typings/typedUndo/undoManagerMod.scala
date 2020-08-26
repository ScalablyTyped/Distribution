package typings.typedUndo

import typings.typedUndo.undoableEditMod.UndoableEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-undo/dist/UndoManager", JSImport.Namespace)
@js.native
object undoManagerMod extends js.Object {
  @js.native
  /**
    * Create a new UndoManager
    *
    * @param limit The maximum amount of editables to remember
    */
  class UndoManager () extends js.Object {
    def this(limit: Double) = this()
    var applyLimit: js.Any = js.native
    var edits: js.Any = js.native
    var limit: js.Any = js.native
    var listener: js.Any = js.native
    var position: js.Any = js.native
    /**
      * Test to see the new position after an redo would happen.
      *
      * @param position The start position
      * @return False if no significant edit can be redone.
      * Otherwise the new position.
      */
    var testRedo: js.Any = js.native
    /**
      * Test to see the new position after an undo would happen.
      *
      * @param position The start position
      * @return False if no significant edit can be undone.
      * Otherwise the new position.
      */
    var testUndo: js.Any = js.native
    var unmodifiedPosition: js.Any = js.native
    /**
      * Add a new edit. Will try to merge or replace existing edits.
      *
      * @param edit The new edit to add.
      */
    def add(edit: UndoableEdit): Unit = js.native
    /**
      * @returns true if there is anything to be redone (only significant edits count)
      */
    def canRedo(): Boolean = js.native
    /**
      * @returns true if there is anything to be undone (only significant edits count)
      */
    def canUndo(): Boolean = js.native
    /**
      * Clear all edits
      */
    def clear(): Unit = js.native
    /**
      * Get the maximum amount of editables to remember
      */
    def getLimit(): Double = js.native
    /**
      * Test if there is anything to be saved
      */
    def isModified(): Boolean = js.native
    /**
      * Redo the next significant edit.
      * This will redo all insignificant edits up to the edit to be redone.
      *
      * @throws Error if no edit can be redone.
      */
    def redo(): Unit = js.native
    /**
      * Set the maximum amount of editables to remember.
      * The new limit will be applied instantly.
      *
      * @param value The maximum amount of editables to remember
      */
    def setLimit(value: Double): Unit = js.native
    /**
      * The listener will be called when changes have been done (adding an edit, or undoing/redoing it)
      *
      * @param listener The new callback or null to remove the existing one.
      */
    def setListener(): Unit = js.native
    def setListener(listener: js.Function0[Unit]): Unit = js.native
    /**
      * Mark the point when the data has been saved.
      */
    def setUnmodified(): Unit = js.native
    /**
      * Undo the last significant edit.
      * This will undo all insignificant edits up to the edit to be undone.
      *
      * @throws Error if no edit can be undone.
      */
    def undo(): Unit = js.native
  }
  
}

