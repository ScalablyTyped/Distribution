package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "SyntaxTree")
@js.native
class SyntaxTree protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.SyntaxTree {
  def this(
    sourceUnit: typings.typescriptServices.TypeScript.SourceUnitSyntax,
    isDeclaration: Boolean,
    diagnostics: js.Array[typings.typescriptServices.TypeScript.Diagnostic],
    fileName: String,
    lineMap: typings.typescriptServices.TypeScript.LineMap,
    parseOtions: typings.typescriptServices.TypeScript.ParseOptions
  ) = this()
  
  /* private */ /* CompleteClass */
  var _allDiagnostics: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _fileName: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _isDeclaration: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _lineMap: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _parseOptions: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _parserDiagnostics: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _sourceUnit: js.Any = js.native
  
  /* private */ /* CompleteClass */
  override def computeDiagnostics(): js.Any = js.native
  
  /* CompleteClass */
  override def diagnostics(): js.Array[typings.typescriptServices.TypeScript.Diagnostic] = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def isDeclaration(): Boolean = js.native
  
  /* CompleteClass */
  override def lineMap(): typings.typescriptServices.TypeScript.LineMap = js.native
  
  /* CompleteClass */
  override def parseOptions(): typings.typescriptServices.TypeScript.ParseOptions = js.native
  
  /* CompleteClass */
  override def sourceUnit(): typings.typescriptServices.TypeScript.SourceUnitSyntax = js.native
  
  /* CompleteClass */
  override def structuralEquals(tree: typings.typescriptServices.TypeScript.SyntaxTree): Boolean = js.native
  
  /* CompleteClass */
  override def toJSON(key: js.Any): js.Any = js.native
}
