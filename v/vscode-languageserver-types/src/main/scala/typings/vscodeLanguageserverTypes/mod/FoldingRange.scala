package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRange extends StObject {
  
  /**
    * The text that the client should show when the specified range is
    * collapsed. If not defined or not supported by the client, a default
    * will be chosen by the client.
    *
    * @since 3.17.0
    */
  var collapsedText: js.UndefOr[String] = js.undefined
  
  /**
    * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
    */
  var endCharacter: js.UndefOr[uinteger] = js.undefined
  
  /**
    * The zero-based end line of the range to fold. The folded area ends with the line's last character.
    * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
    */
  var endLine: uinteger
  
  /**
    * Describes the kind of the folding range such as `comment' or 'region'. The kind
    * is used to categorize folding ranges and used by commands like 'Fold all comments'.
    * See [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[FoldingRangeKind] = js.undefined
  
  /**
    * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
    */
  var startCharacter: js.UndefOr[uinteger] = js.undefined
  
  /**
    * The zero-based start line of the range to fold. The folded area starts after the line's last character.
    * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
    */
  var startLine: uinteger
}
object FoldingRange {
  
  inline def apply(endLine: uinteger, startLine: uinteger): FoldingRange = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  
  @JSImport("vscode-languageserver-types", "FoldingRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FoldingRange literal.
    */
  inline def create(startLine: uinteger, endLine: uinteger): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: Unit,
    endCharacter: Unit,
    kind: Unit,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: Unit,
    endCharacter: Unit,
    kind: FoldingRangeKind
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: Unit,
    endCharacter: Unit,
    kind: FoldingRangeKind,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: uinteger, endLine: uinteger, startCharacter: Unit, endCharacter: uinteger): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: Unit,
    endCharacter: uinteger,
    kind: Unit,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: Unit,
    endCharacter: uinteger,
    kind: FoldingRangeKind
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: Unit,
    endCharacter: uinteger,
    kind: FoldingRangeKind,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: uinteger, endLine: uinteger, startCharacter: uinteger): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: uinteger,
    endCharacter: Unit,
    kind: Unit,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: uinteger,
    endCharacter: Unit,
    kind: FoldingRangeKind
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: uinteger,
    endCharacter: Unit,
    kind: FoldingRangeKind,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: uinteger, endLine: uinteger, startCharacter: uinteger, endCharacter: uinteger): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: uinteger,
    endCharacter: uinteger,
    kind: Unit,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: uinteger,
    endCharacter: uinteger,
    kind: FoldingRangeKind
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(
    startLine: uinteger,
    endLine: uinteger,
    startCharacter: uinteger,
    endCharacter: uinteger,
    kind: FoldingRangeKind,
    collapsedText: String
  ): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], collapsedText.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean]
  
  extension [Self <: FoldingRange](x: Self) {
    
    inline def setCollapsedText(value: String): Self = StObject.set(x, "collapsedText", value.asInstanceOf[js.Any])
    
    inline def setCollapsedTextUndefined: Self = StObject.set(x, "collapsedText", js.undefined)
    
    inline def setEndCharacter(value: uinteger): Self = StObject.set(x, "endCharacter", value.asInstanceOf[js.Any])
    
    inline def setEndCharacterUndefined: Self = StObject.set(x, "endCharacter", js.undefined)
    
    inline def setEndLine(value: uinteger): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setKind(value: FoldingRangeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartCharacter(value: uinteger): Self = StObject.set(x, "startCharacter", value.asInstanceOf[js.Any])
    
    inline def setStartCharacterUndefined: Self = StObject.set(x, "startCharacter", js.undefined)
    
    inline def setStartLine(value: uinteger): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
  }
}
