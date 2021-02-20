package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingRange extends StObject {
  
  /**
    * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
    */
  var endCharacter: js.UndefOr[Double] = js.native
  
  /**
    * The zero-based line number where the folded range ends.
    */
  var endLine: Double = js.native
  
  /**
    * Describes the kind of the folding range such as `comment' or 'region'. The kind
    * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
    */
  var startCharacter: js.UndefOr[Double] = js.native
  
  /**
    * The zero-based line number from where the folded range starts.
    */
  var startLine: Double = js.native
}
object FoldingRange {
  
  @scala.inline
  def apply(endLine: Double, startLine: Double): FoldingRange = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  
  /**
    * Creates a new FoldingRange literal.
    */
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double): FoldingRange = js.native
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: js.UndefOr[scala.Nothing],
    kind: String
  ): FoldingRange = js.native
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: Double
  ): FoldingRange = js.native
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: js.UndefOr[scala.Nothing],
    endCharacter: Double,
    kind: String
  ): FoldingRange = js.native
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double): FoldingRange = js.native
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(
    startLine: Double,
    endLine: Double,
    startCharacter: Double,
    endCharacter: js.UndefOr[scala.Nothing],
    kind: String
  ): FoldingRange = js.native
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): FoldingRange = js.native
  @JSImport("vscode-languageserver-types", "FoldingRange.create")
  @js.native
  def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): FoldingRange = js.native
  
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  @JSImport("vscode-languageserver-types", "FoldingRange.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = js.native
  
  @scala.inline
  implicit class FoldingRangeMutableBuilder[Self <: FoldingRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndCharacter(value: Double): Self = StObject.set(x, "endCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCharacterUndefined: Self = StObject.set(x, "endCharacter", js.undefined)
    
    @scala.inline
    def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setStartCharacter(value: Double): Self = StObject.set(x, "startCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartCharacterUndefined: Self = StObject.set(x, "startCharacter", js.undefined)
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
  }
}
