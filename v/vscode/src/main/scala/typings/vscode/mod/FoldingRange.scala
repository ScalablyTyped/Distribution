package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "FoldingRange")
@js.native
open class FoldingRange protected () extends StObject {
  /**
    * Creates a new folding range.
    *
    * @param start The start line of the folded range.
    * @param end The end line of the folded range.
    * @param kind The kind of the folding range.
    */
  def this(start: Double, end: Double) = this()
  def this(start: Double, end: Double, kind: FoldingRangeKind) = this()
  
  /**
    * The zero-based end line of the range to fold. The folded area ends with the line's last character.
    * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
    */
  var end: Double = js.native
  
  /**
    * Describes the {@link FoldingRangeKind Kind} of the folding range such as {@link FoldingRangeKind.Comment Comment} or
    * {@link FoldingRangeKind.Region Region}. The kind is used to categorize folding ranges and used by commands
    * like 'Fold all comments'. See
    * {@link FoldingRangeKind} for an enumeration of all kinds.
    * If not set, the range is originated from a syntax element.
    */
  var kind: js.UndefOr[FoldingRangeKind] = js.native
  
  /**
    * The zero-based start line of the range to fold. The folded area starts after the line's last character.
    * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
    */
  var start: Double = js.native
}
