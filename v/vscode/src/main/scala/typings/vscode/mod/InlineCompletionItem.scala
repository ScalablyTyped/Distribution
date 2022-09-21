package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "InlineCompletionItem")
@js.native
open class InlineCompletionItem protected () extends StObject {
  /**
    * Creates a new inline completion item.
    *
    * @param insertText The text to replace the range with.
    * @param range The range to replace. If not set, the word at the requested position will be used.
    * @param command An optional {@link Command} that is executed *after* inserting this completion.
    */
  def this(insertText: String) = this()
  def this(insertText: SnippetString) = this()
  def this(insertText: String, range: Range) = this()
  def this(insertText: SnippetString, range: Range) = this()
  def this(insertText: String, range: Unit, command: Command) = this()
  def this(insertText: String, range: Range, command: Command) = this()
  def this(insertText: SnippetString, range: Unit, command: Command) = this()
  def this(insertText: SnippetString, range: Range, command: Command) = this()
  
  /**
    * An optional {@link Command} that is executed *after* inserting this completion.
    */
  var command: js.UndefOr[Command] = js.native
  
  /**
    * A text that is used to decide if this inline completion should be shown. When `falsy`
    * the {@link InlineCompletionItem.insertText} is used.
    *
    * An inline completion is shown if the text to replace is a prefix of the filter text.
    */
  var filterText: js.UndefOr[String] = js.native
  
  /**
    * The text to replace the range with. Must be set.
    * Is used both for the preview and the accept operation.
    */
  var insertText: String | SnippetString = js.native
  
  /**
    * The range to replace.
    * Must begin and end on the same line.
    *
    * Prefer replacements over insertions to provide a better experience when the user deletes typed text.
    */
  var range: js.UndefOr[Range] = js.native
}
