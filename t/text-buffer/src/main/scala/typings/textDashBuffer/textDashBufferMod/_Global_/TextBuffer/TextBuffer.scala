package typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer

import typings.eventDashKit.eventDashKitMod.Disposable
import typings.pathwatcher.pathwatcherMod.File
import typings.std.RegExp
import typings.textDashBuffer.Anon_ExclusiveInside
import typings.textDashBuffer.Anon_ExclusiveInsideInvalidate
import typings.textDashBuffer.Anon_MaintainHistory
import typings.textDashBuffer.Anon_NewExtent
import typings.textDashBuffer.Anon_NormalizeLineEndings
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events.BufferChanged
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events.BufferChanging
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events.BufferStoppedChanging
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events.BufferWatchError
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Events.FileSaved
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Options.FindMarker
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Options.ScanContext
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Structures.BufferScanResult
import typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.Structures.ContextualBufferScanResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  A mutable text container with undo/redo support and the ability to
  *  annotate logical regions in the text.
  */
@js.native
trait TextBuffer extends js.Object {
  var conflict: Boolean = js.native
  var destroyed: Boolean = js.native
  // Properties
  var file: File = js.native
  var id: String = js.native
  var lineEndings: js.Array[String] = js.native
  var lines: js.Array[String] = js.native
  var loaded: Boolean = js.native
  var refcount: Double = js.native
  var stoppedChangingDelay: Double = js.native
  /**
    *  Call within a transaction to terminate the function's execution and
    *  revert any changes performed up to the abortion.
    */
  def abortTransaction(): Unit = js.native
  // Markers
  /** Create a layer to contain a set of related markers. */
  def addMarkerLayer(): MarkerLayer = js.native
  def addMarkerLayer(options: Anon_MaintainHistory): MarkerLayer = js.native
  /** Append text to the end of the buffer. */
  def append(text: String): Range = js.native
  def append(text: String, options: Anon_NormalizeLineEndings): Range = js.native
  /**
    *  Scan regular expression matches in the entire buffer in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScan(regex: RegExp, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in the entire buffer in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScan(
    regex: RegExp,
    options: ScanContext,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  /**
    *  Scan regular expression matches in a given range in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScanInRange(regex: RegExp, range: RangeCompatible, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in a given range in reverse order,
    *  calling the given iterator function on each match.
    */
  def backwardsScanInRange(
    regex: RegExp,
    range: RangeCompatible,
    options: ScanContext,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  def characterIndexForPosition(position: js.Tuple2[Double, Double]): Double = js.native
  /**
    *  Convert a position in the buffer in row/column coordinates to an absolute
    *  character offset, inclusive of line ending characters.
    */
  def characterIndexForPosition(position: Point): Double = js.native
  /**
    *  Clear the undo stack. When calling this method within a transaction,
    *  the ::onDidChangeText event will not be triggered because the information
    *  describing the changes is lost.
    */
  def clearUndoStack(): Unit = js.native
  /** Clip the given point so it is at a valid position in the buffer. */
  def clipPosition(position: PointCompatible): Point = js.native
  /** Clip the given range so it starts and ends at valid positions. */
  def clipRange(range: RangeCompatible): Range = js.native
  /**
    *  Create a pointer to the current state of the buffer for use with
    *  ::revertToCheckpoint and ::groupChangesSinceCheckpoint.
    */
  def createCheckpoint(): Double = js.native
  /**
    *  Schedules a 'did-stop-changing' emission. The event will be emitted between
    *  now and TextBuffer::stoppedChangingDelay milliseconds in the future.
    */
  def debouncedEmitDidStopChangingEvent(): Unit = js.native
  /** Delete the text in the given range. */
  def delete(range: RangeCompatible): Range = js.native
  /** Delete the line associated with a specified row. */
  def deleteRow(row: Double): Range = js.native
  /** Delete the lines associated with the specified row range. */
  def deleteRows(startRow: Double, endRow: Double): Range = js.native
  // Lifecycle
  /** Destroys the buffer, emitting the 'did-destroy' prior to doing so. */
  def destroy(): Unit = js.native
  /** Performs the necessary work, then emits the 'did-stop-changing' event. */
  def emitDidStopChangingEvent(): Unit = js.native
  /** Find markers conforming to the given parameters in the default marker layer. */
  def findMarkers(params: FindMarker): js.Array[Marker] = js.native
  /**
    *  Returns a list of changes since the given checkpoint.
    *  If the given checkpoint is no longer present in the undo history, this method
    *  will return an empty Array.
    */
  def getChangesSinceCheckpoint(checkpoint: Double): js.Array[Anon_NewExtent] = js.native
  /** Get the default MarkerLayer. */
  def getDefaultMarkerLayer(): MarkerLayer = js.native
  /** Returns the string encoding of this buffer. */
  def getEncoding(): String = js.native
  /** Get the maximal position in the buffer, where new text would be appended. */
  def getEndPosition(): Point = js.native
  /** Get the first position in the buffer, which is always [0, 0]. */
  def getFirstPosition(): Point = js.native
  /** Get the text of the last line of the buffer, without its line ending. */
  def getLastLine(): String = js.native
  /** Get the last 0-indexed row in the buffer. */
  def getLastRow(): Double = js.native
  /** Get the number of lines in the buffer. */
  def getLineCount(): Double = js.native
  /** Get the text of all lines in the buffer, without their line endings. */
  def getLines(): js.Array[String] = js.native
  /** Get an existing marker by its id from the default marker layer. */
  def getMarker(id: Double): Marker = js.native
  /** Get the number of markers in the default marker layer. */
  def getMarkerCount(): Double = js.native
  /**
    *  Get a MarkerLayer by id.
    *  Returns a MarkerLayer or `` if no layer exists with the given id.
    */
  def getMarkerLayer(id: String): js.UndefOr[MarkerLayer] = js.native
  /** Get all existing markers on the default marker layer. */
  def getMarkers(): js.Array[Marker] = js.native
  /** Get the length of the buffer in characters. */
  def getMaxCharacterIndex(): Double = js.native
  /** Get the path of the associated file. */
  def getPath(): js.UndefOr[String] = js.native
  // Buffer Range Details
  /** Get the range spanning from [0, 0] to ::getEndPosition. */
  def getRange(): Range = js.native
  /**
    *  Get the number of milliseconds that will elapse without a change before
    *  ::onDidStopChanging observers are invoked following a change.
    */
  def getStoppedChangingDelay(): Double = js.native
  /** Get the entire text of the buffer. */
  def getText(): String = js.native
  /** Get the text in a range. */
  def getTextInRange(range: RangeCompatible): String = js.native
  /** Get the path of the associated file. */
  def getUri(): String = js.native
  /**
    *  Group all changes since the given checkpoint into a single transaction for
    *  purposes of undo/redo.
    *  Returns a boolean indicating whether the operation succeeded.
    */
  def groupChangesSinceCheckpoint(checkpoint: Double): Boolean = js.native
  /** Identifies if the buffer belongs to multiple editors. */
  def hasMultipleEditors(): Boolean = js.native
  /** Insert text at the given position. */
  def insert(position: PointCompatible, text: String): Range = js.native
  def insert(position: PointCompatible, text: String, options: Anon_NormalizeLineEndings): Range = js.native
  /** Returns whether or not the given buffer is alive. */
  def isAlive(): Boolean = js.native
  /** Returns whether or not the given buffer has been destroyed. */
  def isDestroyed(): Boolean = js.native
  // Reading Text
  /** Determine whether the buffer is empty. */
  def isEmpty(): Boolean = js.native
  /**
    *  Determine if the in-memory contents of the buffer conflict with the on-disk
    *  contents of its associated file.
    */
  def isInConflict(): Boolean = js.native
  // File Details
  /**
    *  Determine if the in-memory contents of the buffer differ from its contents
    *  on disk.
    *  If the buffer is unsaved, always returns true unless the buffer is empty.
    */
  def isModified(): Boolean = js.native
  /** Returns whether or not this text buffer is currently retained. */
  def isRetained(): Boolean = js.native
  /** Determine if the given row contains only whitespace. */
  def isRowBlank(row: Double): Boolean = js.native
  /** Get the line ending for the given 0-indexed row. */
  def lineEndingForRow(row: Double): js.UndefOr[String] = js.native
  /** Get the text of the line at the given row, without its line ending. */
  def lineForRow(row: Double): js.UndefOr[String] = js.native
  /**
    *  Get the length of the line for the given 0-indexed row, without its line
    *  ending.
    */
  def lineLengthForRow(row: Double): Double = js.native
  /** Create a marker at the given position with no tail in the default marker layer. */
  def markPosition(position: PointCompatible): Marker = js.native
  def markPosition(position: PointCompatible, options: Anon_ExclusiveInsideInvalidate): Marker = js.native
  /** Create a marker with the given range in the default marker layer. */
  def markRange(range: RangeCompatible): Marker = js.native
  def markRange(range: RangeCompatible, properties: Anon_ExclusiveInside): Marker = js.native
  /**
    *  Given a row, find the next row that's not blank.
    *  Returns a number or null if there's no next non-blank row.
    */
  def nextNonBlankRow(startRow: Double): Double | Null = js.native
  /**
    *  Invoke the given callback synchronously when the content of the buffer
    *  changes. You should probably not be using this in packages.
    */
  def onDidChange(callback: js.Function1[/* event */ BufferChanged, Unit]): Disposable = js.native
  /** Invoke the given callback when the value of ::getEncoding changes. */
  def onDidChangeEncoding(callback: js.Function1[/* encoding */ String, Unit]): Disposable = js.native
  /** Invoke the given callback if the value of ::isModified changes. */
  def onDidChangeModified(callback: js.Function1[/* modified */ Boolean, Unit]): Disposable = js.native
  /** Invoke the given callback when the value of ::getPath changes. */
  def onDidChangePath(callback: js.Function1[/* path */ String, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback synchronously when a transaction finishes with
    *  a list of all the changes in the transaction.
    */
  def onDidChangeText(callback: js.Function1[/* event */ BufferStoppedChanging, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when the in-memory contents of the buffer become
    *  in conflict with the contents of the file on disk.
    */
  def onDidConflict(callback: js.Function0[Unit]): Disposable = js.native
  def onDidCreateMarker(callback: js.Function1[/* marker */ Marker, Unit]): Disposable = js.native
  /** Invoke the given callback after the file backing the buffer is deleted. */
  def onDidDelete(callback: js.Function0[Unit]): Disposable = js.native
  /** Invoke the given callback when the buffer is destroyed. */
  def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
  /**
    *  Invoke the given callback after the buffer is reloaded from the contents
    *  of its file on disk.
    */
  def onDidReload(callback: js.Function0[Unit]): Disposable = js.native
  /** Invoke the given callback after the buffer is saved to disk. */
  def onDidSave(callback: js.Function1[/* event */ FileSaved, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback asynchronously following one or more changes after
    *  ::getStoppedChangingDelay milliseconds elapse without an additional change.
    */
  def onDidStopChanging(callback: js.Function1[/* event */ BufferStoppedChanging, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback when all marker ::onDidChange observers have been
    *  notified following a change to the buffer.
    */
  def onDidUpdateMarkers(callback: js.Function0[Unit]): Disposable = js.native
  // Event Subscription
  /**
    *  Invoke the given callback synchronously before the content of the buffer
    *  changes.
    */
  def onWillChange(callback: js.Function1[/* event */ BufferChanging, Unit]): Disposable = js.native
  /**
    *  Invoke the given callback before the buffer is reloaded from the contents
    *  of its file on disk.
    */
  def onWillReload(callback: js.Function0[Unit]): Disposable = js.native
  /**
    *  Invoke the given callback before the buffer is saved to disk. If the
    *  given callback returns a promise, then the buffer will not be saved until
    *  the promise resolves.
    */
  def onWillSave(callback: js.Function0[js.Promise[Unit] | Unit]): Disposable = js.native
  /** Invoke the given callback when there is an error in watching the file. */
  def onWillThrowWatchError(callback: js.Function1[/* errorObject */ BufferWatchError, Unit]): Disposable = js.native
  /**
    *  Convert an absolute character offset, inclusive of newlines, to a position
    *  in the buffer in row/column coordinates.
    */
  def positionForCharacterIndex(offset: Double): Point = js.native
  /**
    *  Given a row, find the first preceding row that's not blank.
    *  Returns a number or null if there's no preceding non-blank row.
    */
  def previousNonBlankRow(startRow: Double): Double | Null = js.native
  /** Get the range for the given row. */
  def rangeForRow(row: Double, includeNewline: Boolean): Range = js.native
  /** Redo the last operation. */
  def redo(): Boolean = js.native
  /** Release the text buffer, destroying it if there are no other retainers. */
  def release(): typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.TextBuffer = js.native
  /** Reload the buffer's contents from disk. */
  def reload(): Unit = js.native
  /** Replace all regular expression matches in the entire buffer. */
  def replace(regex: RegExp, replacementText: String): Double = js.native
  /** Retains the text buffer, preventing its destruction via TextBuffer::release. */
  def retain(): typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer.TextBuffer = js.native
  /**
    *  Revert the buffer to the state it was in when the given checkpoint was created.
    *  Returns a boolean indicating whether the operation succeeded.
    */
  def revertToCheckpoint(checkpoint: Double): Boolean = js.native
  // Buffer Operations
  /** Save the buffer. */
  def save(): js.Promise[Unit] = js.native
  /** Save the buffer at a specific path. */
  def saveAs(filePath: String): js.Promise[Unit] = js.native
  // Search and Replace
  /**
    *  Scan regular expression matches in the entire buffer, calling the given
    *  iterator function on each match.
    */
  def scan(regex: RegExp, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in the entire buffer, calling the given
    *  iterator function on each match.
    */
  def scan(
    regex: RegExp,
    options: ScanContext,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  /**
    *  Scan regular expression matches in a given range , calling the given
    *  iterator function on each match.
    */
  def scanInRange(regex: RegExp, range: RangeCompatible, iterator: js.Function1[/* params */ BufferScanResult, Unit]): Unit = js.native
  /**
    *  Scan regular expression matches in a given range , calling the given
    *  iterator function on each match.
    */
  def scanInRange(
    regex: RegExp,
    range: RangeCompatible,
    options: ScanContext,
    iterator: js.Function1[/* params */ ContextualBufferScanResult, Unit]
  ): Unit = js.native
  /** Sets the character set encoding for this buffer. */
  def setEncoding(encoding: String): Unit = js.native
  /** Set the path for the buffer's associated file. */
  def setPath(filePath: String): Unit = js.native
  // Mutating Text
  /** Replace the entire contents of the buffer with the given text. */
  def setText(text: String): Range = js.native
  /** Set the text in the given range. */
  def setTextInRange(range: RangeCompatible, text: String): Range = js.native
  def setTextInRange(range: RangeCompatible, text: String, options: Anon_NormalizeLineEndings): Range = js.native
  /**
    *  Replace the current buffer contents by applying a diff based on the
    *  given text.
    */
  def setTextViaDiff(text: String): Unit = js.native
  def transact[T](fn: js.Function0[T]): T = js.native
  /** Batch multiple operations as a single undo/redo step. */
  def transact[T](groupingInterval: Double, fn: js.Function0[T]): T = js.native
  // History
  /** Undo the last operation. If a transaction is in progress, aborts it. */
  def undo(): Boolean = js.native
}

