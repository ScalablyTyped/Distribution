package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocument
  extends StObject
     with ConfigurationScope {
  
  /**
    * The {@link EndOfLine end of line} sequence that is predominately
    * used in this document.
    */
  val eol: EndOfLine = js.native
  
  /**
    * The file system path of the associated resource. Shorthand
    * notation for {@link TextDocument.uri TextDocument.uri.fsPath}. Independent of the uri scheme.
    */
  val fileName: String = js.native
  
  /**
    * Get the text of this document. A substring can be retrieved by providing
    * a range. The range will be {@link TextDocument.validateRange adjusted}.
    *
    * @param range Include only the text included by the range.
    * @return The text inside the provided range or the entire text.
    */
  def getText(): String = js.native
  def getText(range: Range): String = js.native
  
  /**
    * Get a word-range at the given position. By default words are defined by
    * common separators, like space, -, _, etc. In addition, per language custom
    * [word definitions} can be defined. It
    * is also possible to provide a custom regular expression.
    *
    * * *Note 1:* A custom regular expression must not match the empty string and
    * if it does, it will be ignored.
    * * *Note 2:* A custom regular expression will fail to match multiline strings
    * and in the name of speed regular expressions should not match words with
    * spaces. Use {@linkcode TextLine.text} for more complex, non-wordy, scenarios.
    *
    * The position will be {@link TextDocument.validatePosition adjusted}.
    *
    * @param position A position.
    * @param regex Optional regular expression that describes what a word is.
    * @return A range spanning a word, or `undefined`.
    */
  def getWordRangeAtPosition(position: Position): js.UndefOr[Range] = js.native
  def getWordRangeAtPosition(position: Position, regex: js.RegExp): js.UndefOr[Range] = js.native
  
  /**
    * `true` if the document has been closed. A closed document isn't synchronized anymore
    * and won't be re-used when the same resource is opened again.
    */
  val isClosed: Boolean = js.native
  
  /**
    * `true` if there are unpersisted changes.
    */
  val isDirty: Boolean = js.native
  
  /**
    * Is this document representing an untitled file which has never been saved yet. *Note* that
    * this does not mean the document will be saved to disk, use {@linkcode Uri.scheme}
    * to figure out where a document will be {@link FileSystemProvider saved}, e.g. `file`, `ftp` etc.
    */
  val isUntitled: Boolean = js.native
  
  /**
    * The identifier of the language associated with this document.
    */
  val languageId: String = js.native
  
  /**
    * Returns a text line denoted by the line number. Note
    * that the returned object is *not* live and changes to the
    * document are not reflected.
    *
    * @param line A line number in [0, lineCount).
    * @return A {@link TextLine line}.
    */
  def lineAt(line: Double): TextLine = js.native
  /**
    * Returns a text line denoted by the position. Note
    * that the returned object is *not* live and changes to the
    * document are not reflected.
    *
    * The position will be {@link TextDocument.validatePosition adjusted}.
    *
    * @see {@link TextDocument.lineAt}
    *
    * @param position A position.
    * @return A {@link TextLine line}.
    */
  def lineAt(position: Position): TextLine = js.native
  
  /**
    * The number of lines in this document.
    */
  val lineCount: Double = js.native
  
  /**
    * Converts the position to a zero-based offset.
    *
    * The position will be {@link TextDocument.validatePosition adjusted}.
    *
    * @param position A position.
    * @return A valid zero-based offset.
    */
  def offsetAt(position: Position): Double = js.native
  
  /**
    * Converts a zero-based offset to a position.
    *
    * @param offset A zero-based offset.
    * @return A valid {@link Position}.
    */
  def positionAt(offset: Double): Position = js.native
  
  /**
    * Save the underlying file.
    *
    * @return A promise that will resolve to `true` when the file
    * has been saved. If the save failed, will return `false`.
    */
  def save(): Thenable[Boolean] = js.native
  
  /**
    * The associated uri for this document.
    *
    * *Note* that most documents use the `file`-scheme, which means they are files on disk. However, **not** all documents are
    * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
    *
    * @see {@link FileSystemProvider}
    * @see {@link TextDocumentContentProvider}
    */
  val uri: Uri = js.native
  
  /**
    * Ensure a position is contained in the range of this document.
    *
    * @param position A position.
    * @return The given position or a new, adjusted position.
    */
  def validatePosition(position: Position): Position = js.native
  
  /**
    * Ensure a range is completely contained in this document.
    *
    * @param range A range.
    * @return The given range or a new, adjusted range.
    */
  def validateRange(range: Range): Range = js.native
  
  /**
    * The version number of this document (it will strictly increase after each
    * change, including undo/redo).
    */
  val version: Double = js.native
}
