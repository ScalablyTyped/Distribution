package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxTree extends StObject {
  
  /* private */ var _allDiagnostics: Any
  
  /* private */ var _fileName: Any
  
  /* private */ var _isDeclaration: Any
  
  /* private */ var _lineMap: Any
  
  /* private */ var _parseOptions: Any
  
  /* private */ var _parserDiagnostics: Any
  
  /* private */ var _sourceUnit: Any
  
  /* private */ def computeDiagnostics(): Any
  
  def diagnostics(): js.Array[Diagnostic]
  
  def fileName(): String
  
  def isDeclaration(): Boolean
  
  def lineMap(): LineMap
  
  def parseOptions(): ParseOptions
  
  def sourceUnit(): SourceUnitSyntax
  
  def structuralEquals(tree: SyntaxTree): Boolean
  
  def toJSON(key: Any): Any
}
object SyntaxTree {
  
  inline def apply(
    _allDiagnostics: Any,
    _fileName: Any,
    _isDeclaration: Any,
    _lineMap: Any,
    _parseOptions: Any,
    _parserDiagnostics: Any,
    _sourceUnit: Any,
    computeDiagnostics: () => Any,
    diagnostics: () => js.Array[Diagnostic],
    fileName: () => String,
    isDeclaration: () => Boolean,
    lineMap: () => LineMap,
    parseOptions: () => ParseOptions,
    sourceUnit: () => SourceUnitSyntax,
    structuralEquals: SyntaxTree => Boolean,
    toJSON: Any => Any
  ): SyntaxTree = {
    val __obj = js.Dynamic.literal(_allDiagnostics = _allDiagnostics.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _isDeclaration = _isDeclaration.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _parseOptions = _parseOptions.asInstanceOf[js.Any], _parserDiagnostics = _parserDiagnostics.asInstanceOf[js.Any], _sourceUnit = _sourceUnit.asInstanceOf[js.Any], computeDiagnostics = js.Any.fromFunction0(computeDiagnostics), diagnostics = js.Any.fromFunction0(diagnostics), fileName = js.Any.fromFunction0(fileName), isDeclaration = js.Any.fromFunction0(isDeclaration), lineMap = js.Any.fromFunction0(lineMap), parseOptions = js.Any.fromFunction0(parseOptions), sourceUnit = js.Any.fromFunction0(sourceUnit), structuralEquals = js.Any.fromFunction1(structuralEquals), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[SyntaxTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntaxTree] (val x: Self) extends AnyVal {
    
    inline def setComputeDiagnostics(value: () => Any): Self = StObject.set(x, "computeDiagnostics", js.Any.fromFunction0(value))
    
    inline def setDiagnostics(value: () => js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", js.Any.fromFunction0(value))
    
    inline def setFileName(value: () => String): Self = StObject.set(x, "fileName", js.Any.fromFunction0(value))
    
    inline def setIsDeclaration(value: () => Boolean): Self = StObject.set(x, "isDeclaration", js.Any.fromFunction0(value))
    
    inline def setLineMap(value: () => LineMap): Self = StObject.set(x, "lineMap", js.Any.fromFunction0(value))
    
    inline def setParseOptions(value: () => ParseOptions): Self = StObject.set(x, "parseOptions", js.Any.fromFunction0(value))
    
    inline def setSourceUnit(value: () => SourceUnitSyntax): Self = StObject.set(x, "sourceUnit", js.Any.fromFunction0(value))
    
    inline def setStructuralEquals(value: SyntaxTree => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: Any => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_allDiagnostics(value: Any): Self = StObject.set(x, "_allDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    inline def set_isDeclaration(value: Any): Self = StObject.set(x, "_isDeclaration", value.asInstanceOf[js.Any])
    
    inline def set_lineMap(value: Any): Self = StObject.set(x, "_lineMap", value.asInstanceOf[js.Any])
    
    inline def set_parseOptions(value: Any): Self = StObject.set(x, "_parseOptions", value.asInstanceOf[js.Any])
    
    inline def set_parserDiagnostics(value: Any): Self = StObject.set(x, "_parserDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_sourceUnit(value: Any): Self = StObject.set(x, "_sourceUnit", value.asInstanceOf[js.Any])
  }
}
