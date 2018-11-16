package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *  A mutable text container with undo/redo support and the ability to
         *  annotate logical regions in the text.
         */
@js.native
trait TextBuffer extends js.Object {
  var conflict: scala.Boolean = js.native
  var destroyed: scala.Boolean = js.native
  // Properties
  var file: pathwatcherLib.pathwatcherMod.File = js.native
  var id: java.lang.String = js.native
  var lineEndings: js.Array[java.lang.String] = js.native
  var lines: js.Array[java.lang.String] = js.native
  var loaded: scala.Boolean = js.native
  var refcount: scala.Double = js.native
  var stoppedChangingDelay: scala.Double = js.native
  /**
               *  Call within a transaction to terminate the function's execution and
               *  revert any changes performed up to the abortion.
               */
  def abortTransaction(): scala.Unit = js.native
  // Markers
  /** Create a layer to contain a set of related markers. */
  def addMarkerLayer(): MarkerLayer = js.native
  // Markers
  /** Create a layer to contain a set of related markers. */
  def addMarkerLayer(options: textDashBufferLib.Anon_MaintainHistory): MarkerLayer = js.native
  /** Append text to the end of the buffer. */
  def append(text: java.lang.String): Range = js.native
  /** Append text to the end of the buffer. */
  def append(text: java.lang.String, options: textDashBufferLib.Anon_Undo): Range = js.native
  /**
               *  Scan regular expression matches in the entire buffer in reverse order,
               *  calling the given iterator function on each match.
               */
  def backwardsScan(
    regex: stdLib.RegExp,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.BufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
               *  Scan regular expression matches in the entire buffer in reverse order,
               *  calling the given iterator function on each match.
               */
  def backwardsScan(
    regex: stdLib.RegExp,
    options: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.ScanContext,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.ContextualBufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
               *  Scan regular expression matches in a given range in reverse order,
               *  calling the given iterator function on each match.
               */
  def backwardsScanInRange(
    regex: stdLib.RegExp,
    range: RangeCompatible,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.BufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
               *  Scan regular expression matches in a given range in reverse order,
               *  calling the given iterator function on each match.
               */
  def backwardsScanInRange(
    regex: stdLib.RegExp,
    range: RangeCompatible,
    options: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.ScanContext,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.ContextualBufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
               *  Convert a position in the buffer in row/column coordinates to an absolute
               *  character offset, inclusive of line ending characters.
               */
  def characterIndexForPosition(position: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
  /**
               *  Convert a position in the buffer in row/column coordinates to an absolute
               *  character offset, inclusive of line ending characters.
               */
  def characterIndexForPosition(position: Point): scala.Double = js.native
  /**
               *  Clear the undo stack. When calling this method within a transaction,
               *  the ::onDidChangeText event will not be triggered because the information
               *  describing the changes is lost.
               */
  def clearUndoStack(): scala.Unit = js.native
  /** Clip the given point so it is at a valid position in the buffer. */
  def clipPosition(position: PointCompatible): Point = js.native
  /** Clip the given range so it starts and ends at valid positions. */
  def clipRange(range: RangeCompatible): Range = js.native
  /**
               *  Create a pointer to the current state of the buffer for use with
               *  ::revertToCheckpoint and ::groupChangesSinceCheckpoint.
               */
  def createCheckpoint(): scala.Double = js.native
  /**
               *  Schedules a 'did-stop-changing' emission. The event will be emitted between
               *  now and TextBuffer::stoppedChangingDelay milliseconds in the future.
               */
  def debouncedEmitDidStopChangingEvent(): scala.Unit = js.native
  /** Delete the text in the given range. */
  def delete(range: RangeCompatible): Range = js.native
  /** Delete the line associated with a specified row. */
  def deleteRow(row: scala.Double): Range = js.native
  /** Delete the lines associated with the specified row range. */
  def deleteRows(startRow: scala.Double, endRow: scala.Double): Range = js.native
  // Lifecycle
  /** Destroys the buffer, emitting the 'did-destroy' prior to doing so. */
  def destroy(): scala.Unit = js.native
  /** Performs the necessary work, then emits the 'did-stop-changing' event. */
  def emitDidStopChangingEvent(): scala.Unit = js.native
  /** Find markers conforming to the given parameters in the default marker layer. */
  def findMarkers(params: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.FindMarker): js.Array[Marker] = js.native
  /**
               *  Returns a list of changes since the given checkpoint.
               *  If the given checkpoint is no longer present in the undo history, this method
               *  will return an empty Array.
               */
  def getChangesSinceCheckpoint(checkpoint: scala.Double): js.Array[textDashBufferLib.Anon_NewExtent] = js.native
  /** Get the default MarkerLayer. */
  def getDefaultMarkerLayer(): MarkerLayer = js.native
  /** Returns the string encoding of this buffer. */
  def getEncoding(): java.lang.String = js.native
  /** Get the maximal position in the buffer, where new text would be appended. */
  def getEndPosition(): Point = js.native
  /** Get the first position in the buffer, which is always [0, 0]. */
  def getFirstPosition(): Point = js.native
  /** Get the text of the last line of the buffer, without its line ending. */
  def getLastLine(): java.lang.String = js.native
  /** Get the last 0-indexed row in the buffer. */
  def getLastRow(): scala.Double = js.native
  /** Get the number of lines in the buffer. */
  def getLineCount(): scala.Double = js.native
  /** Get the text of all lines in the buffer, without their line endings. */
  def getLines(): js.Array[java.lang.String] = js.native
  /** Get an existing marker by its id from the default marker layer. */
  def getMarker(id: scala.Double): Marker = js.native
  /** Get the number of markers in the default marker layer. */
  def getMarkerCount(): scala.Double = js.native
  /**
               *  Get a MarkerLayer by id.
               *  Returns a MarkerLayer or `` if no layer exists with the given id.
               */
  def getMarkerLayer(id: java.lang.String): js.UndefOr[MarkerLayer] = js.native
  /** Get all existing markers on the default marker layer. */
  def getMarkers(): js.Array[Marker] = js.native
  /** Get the length of the buffer in characters. */
  def getMaxCharacterIndex(): scala.Double = js.native
  /** Get the path of the associated file. */
  def getPath(): js.UndefOr[java.lang.String] = js.native
  // Buffer Range Details
  /** Get the range spanning from [0, 0] to ::getEndPosition. */
  def getRange(): Range = js.native
  /**
               *  Get the number of milliseconds that will elapse without a change before
               *  ::onDidStopChanging observers are invoked following a change.
               */
  def getStoppedChangingDelay(): scala.Double = js.native
  /** Get the entire text of the buffer. */
  def getText(): java.lang.String = js.native
  /** Get the text in a range. */
  def getTextInRange(range: RangeCompatible): java.lang.String = js.native
  /** Get the path of the associated file. */
  def getUri(): java.lang.String = js.native
  /**
               *  Group all changes since the given checkpoint into a single transaction for
               *  purposes of undo/redo.
               *  Returns a boolean indicating whether the operation succeeded.
               */
  def groupChangesSinceCheckpoint(checkpoint: scala.Double): scala.Boolean = js.native
  /** Identifies if the buffer belongs to multiple editors. */
  def hasMultipleEditors(): scala.Boolean = js.native
  /** Insert text at the given position. */
  def insert(position: PointCompatible, text: java.lang.String): Range = js.native
  /** Insert text at the given position. */
  def insert(position: PointCompatible, text: java.lang.String, options: textDashBufferLib.Anon_Undo): Range = js.native
  /** Returns whether or not the given buffer is alive. */
  def isAlive(): scala.Boolean = js.native
  /** Returns whether or not the given buffer has been destroyed. */
  def isDestroyed(): scala.Boolean = js.native
  // Reading Text
  /** Determine whether the buffer is empty. */
  def isEmpty(): scala.Boolean = js.native
  /**
               *  Determine if the in-memory contents of the buffer conflict with the on-disk
               *  contents of its associated file.
               */
  def isInConflict(): scala.Boolean = js.native
  // File Details
  /**
               *  Determine if the in-memory contents of the buffer differ from its contents
               *  on disk.
               *  If the buffer is unsaved, always returns true unless the buffer is empty.
               */
  def isModified(): scala.Boolean = js.native
  /** Returns whether or not this text buffer is currently retained. */
  def isRetained(): scala.Boolean = js.native
  /** Determine if the given row contains only whitespace. */
  def isRowBlank(row: scala.Double): scala.Boolean = js.native
  /** Get the line ending for the given 0-indexed row. */
  def lineEndingForRow(row: scala.Double): js.UndefOr[java.lang.String] = js.native
  /** Get the text of the line at the given row, without its line ending. */
  def lineForRow(row: scala.Double): js.UndefOr[java.lang.String] = js.native
  /**
               *  Get the length of the line for the given 0-indexed row, without its line
               *  ending.
               */
  def lineLengthForRow(row: scala.Double): scala.Double = js.native
  /** Create a marker at the given position with no tail in the default marker layer. */
  def markPosition(position: PointCompatible): Marker = js.native
  /** Create a marker at the given position with no tail in the default marker layer. */
  def markPosition(position: PointCompatible, options: textDashBufferLib.Anon_ExclusiveInvalidate): Marker = js.native
  /** Create a marker with the given range in the default marker layer. */
  def markRange(range: RangeCompatible): Marker = js.native
  /** Create a marker with the given range in the default marker layer. */
  def markRange(range: RangeCompatible, properties: textDashBufferLib.Anon_Exclusive): Marker = js.native
  /**
               *  Given a row, find the next row that's not blank.
               *  Returns a number or null if there's no next non-blank row.
               */
  def nextNonBlankRow(startRow: scala.Double): scala.Double | scala.Null = js.native
  /**
               *  Invoke the given callback synchronously when the content of the buffer
               *  changes. You should probably not be using this in packages.
               */
  def onDidChange(
    callback: js.Function1[
      /* event */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs.BufferChanged, 
      scala.Unit
    ]
  ): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback when the value of ::getEncoding changes. */
  def onDidChangeEncoding(callback: js.Function1[/* encoding */ java.lang.String, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback if the value of ::isModified changes. */
  def onDidChangeModified(callback: js.Function1[/* modified */ scala.Boolean, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback when the value of ::getPath changes. */
  def onDidChangePath(callback: js.Function1[/* path */ java.lang.String, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Invoke the given callback synchronously when a transaction finishes with
               *  a list of all the changes in the transaction.
               */
  def onDidChangeText(
    callback: js.Function1[
      /* event */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs.BufferStoppedChanging, 
      scala.Unit
    ]
  ): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Invoke the given callback when the in-memory contents of the buffer become
               *  in conflict with the contents of the file on disk.
               */
  def onDidConflict(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  def onDidCreateMarker(callback: js.Function1[/* marker */ Marker, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback after the file backing the buffer is deleted. */
  def onDidDelete(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback when the buffer is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Invoke the given callback after the buffer is reloaded from the contents
               *  of its file on disk.
               */
  def onDidReload(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback after the buffer is saved to disk. */
  def onDidSave(
    callback: js.Function1[
      /* event */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs.FileSaved, 
      scala.Unit
    ]
  ): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Invoke the given callback asynchronously following one or more changes after
               *  ::getStoppedChangingDelay milliseconds elapse without an additional change.
               */
  def onDidStopChanging(
    callback: js.Function1[
      /* event */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs.BufferStoppedChanging, 
      scala.Unit
    ]
  ): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Invoke the given callback when all marker ::onDidChange observers have been
               *  notified following a change to the buffer.
               */
  def onDidUpdateMarkers(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  // Event Subscription
  /**
               *  Invoke the given callback synchronously before the content of the buffer
               *  changes.
               */
  def onWillChange(
    callback: js.Function1[
      /* event */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs.BufferChanging, 
      scala.Unit
    ]
  ): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Invoke the given callback before the buffer is reloaded from the contents
               *  of its file on disk.
               */
  def onWillReload(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Invoke the given callback before the buffer is saved to disk. If the
               *  given callback returns a promise, then the buffer will not be saved until
               *  the promise resolves.
               */
  def onWillSave(callback: js.Function0[stdLib.Promise[scala.Unit] | scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback when there is an error in watching the file. */
  def onWillThrowWatchError(
    callback: js.Function1[
      /* errorObject */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs.BufferWatchError, 
      scala.Unit
    ]
  ): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
               *  Convert an absolute character offset, inclusive of newlines, to a position
               *  in the buffer in row/column coordinates.
               */
  def positionForCharacterIndex(offset: scala.Double): Point = js.native
  /**
               *  Given a row, find the first preceding row that's not blank.
               *  Returns a number or null if there's no preceding non-blank row.
               */
  def previousNonBlankRow(startRow: scala.Double): scala.Double | scala.Null = js.native
  /** Get the range for the given row. */
  def rangeForRow(row: scala.Double, includeNewline: scala.Boolean): Range = js.native
  /** Redo the last operation. */
  def redo(): scala.Boolean = js.native
  /** Release the text buffer, destroying it if there are no other retainers. */
  def release(): TextBuffer = js.native
  /** Reload the buffer's contents from disk. */
  def reload(): scala.Unit = js.native
  /** Replace all regular expression matches in the entire buffer. */
  def replace(regex: stdLib.RegExp, replacementText: java.lang.String): scala.Double = js.native
  /** Retains the text buffer, preventing its destruction via TextBuffer::release. */
  def retain(): TextBuffer = js.native
  /**
               *  Revert the buffer to the state it was in when the given checkpoint was created.
               *  Returns a boolean indicating whether the operation succeeded.
               */
  def revertToCheckpoint(checkpoint: scala.Double): scala.Boolean = js.native
  // Buffer Operations
  /** Save the buffer. */
  def save(): stdLib.Promise[scala.Unit] = js.native
  /** Save the buffer at a specific path. */
  def saveAs(filePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  // Search and Replace
  /**
               *  Scan regular expression matches in the entire buffer, calling the given
               *  iterator function on each match.
               */
  def scan(
    regex: stdLib.RegExp,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.BufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
               *  Scan regular expression matches in the entire buffer, calling the given
               *  iterator function on each match.
               */
  def scan(
    regex: stdLib.RegExp,
    options: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.ScanContext,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.ContextualBufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
               *  Scan regular expression matches in a given range , calling the given
               *  iterator function on each match.
               */
  def scanInRange(
    regex: stdLib.RegExp,
    range: RangeCompatible,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.BufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
               *  Scan regular expression matches in a given range , calling the given
               *  iterator function on each match.
               */
  def scanInRange(
    regex: stdLib.RegExp,
    range: RangeCompatible,
    options: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.ScanContext,
    iterator: js.Function1[
      /* params */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.StructuresNs.ContextualBufferScanResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Sets the character set encoding for this buffer. */
  def setEncoding(encoding: java.lang.String): scala.Unit = js.native
  /** Set the path for the buffer's associated file. */
  def setPath(filePath: java.lang.String): scala.Unit = js.native
  // Mutating Text
  /** Replace the entire contents of the buffer with the given text. */
  def setText(text: java.lang.String): Range = js.native
  /** Set the text in the given range. */
  def setTextInRange(range: RangeCompatible, text: java.lang.String): Range = js.native
  /** Set the text in the given range. */
  def setTextInRange(range: RangeCompatible, text: java.lang.String, options: textDashBufferLib.Anon_Undo): Range = js.native
  /**
               *  Replace the current buffer contents by applying a diff based on the
               *  given text.
               */
  def setTextViaDiff(text: java.lang.String): scala.Unit = js.native
  def transact[T](fn: js.Function0[T]): T = js.native
  /** Batch multiple operations as a single undo/redo step. */
  def transact[T](groupingInterval: scala.Double, fn: js.Function0[T]): T = js.native
  // History
  /** Undo the last operation. If a transaction is in progress, aborts it. */
  def undo(): scala.Boolean = js.native
}

