package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldingRange extends StObject {
  
  /**
    * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
    */
  var endCharacter: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based line number where the folded range ends.
    */
  var endLine: Double
  
  /**
    * Describes the kind of the folding range such as `comment' or 'region'. The kind
    * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
    */
  var startCharacter: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based line number from where the folded range starts.
    */
  var startLine: Double
}
object FoldingRange {
  
  inline def apply(endLine: Double, startLine: Double): FoldingRange = {
    val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
  
  @JSImport("vscode-languageserver-types", "FoldingRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new FoldingRange literal.
    */
  inline def create(startLine: Double, endLine: Double): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: Double, endLine: Double, startCharacter: Double): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Double, kind: String): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: Double, endLine: Double, startCharacter: Double, endCharacter: Unit, kind: String): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: Double, endLine: Double, startCharacter: Unit, endCharacter: Double): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: Double, endLine: Double, startCharacter: Unit, endCharacter: Double, kind: String): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  inline def create(startLine: Double, endLine: Double, startCharacter: Unit, endCharacter: Unit, kind: String): FoldingRange = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(startLine.asInstanceOf[js.Any], endLine.asInstanceOf[js.Any], startCharacter.asInstanceOf[js.Any], endCharacter.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[FoldingRange]
  
  /**
    * Checks whether the given literal conforms to the [FoldingRange](#FoldingRange) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.FoldingRange */ Boolean]
  
  extension [Self <: FoldingRange](x: Self) {
    
    inline def setEndCharacter(value: Double): Self = StObject.set(x, "endCharacter", value.asInstanceOf[js.Any])
    
    inline def setEndCharacterUndefined: Self = StObject.set(x, "endCharacter", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStartCharacter(value: Double): Self = StObject.set(x, "startCharacter", value.asInstanceOf[js.Any])
    
    inline def setStartCharacterUndefined: Self = StObject.set(x, "startCharacter", js.undefined)
    
    inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
  }
}
