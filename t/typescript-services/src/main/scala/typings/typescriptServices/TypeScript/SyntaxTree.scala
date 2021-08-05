package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxTree extends StObject {
  
  /* private */ var _allDiagnostics: js.Any
  
  /* private */ var _fileName: js.Any
  
  /* private */ var _isDeclaration: js.Any
  
  /* private */ var _lineMap: js.Any
  
  /* private */ var _parseOptions: js.Any
  
  /* private */ var _parserDiagnostics: js.Any
  
  /* private */ var _sourceUnit: js.Any
  
  /* private */ def computeDiagnostics(): js.Any
  
  def diagnostics(): js.Array[Diagnostic]
  
  def fileName(): String
  
  def isDeclaration(): Boolean
  
  def lineMap(): LineMap
  
  def parseOptions(): ParseOptions
  
  def sourceUnit(): SourceUnitSyntax
  
  def structuralEquals(tree: SyntaxTree): Boolean
  
  def toJSON(key: js.Any): js.Any
}
object SyntaxTree {
  
  inline def apply(
    _allDiagnostics: js.Any,
    _fileName: js.Any,
    _isDeclaration: js.Any,
    _lineMap: js.Any,
    _parseOptions: js.Any,
    _parserDiagnostics: js.Any,
    _sourceUnit: js.Any,
    computeDiagnostics: () => js.Any,
    diagnostics: () => js.Array[Diagnostic],
    fileName: () => String,
    isDeclaration: () => Boolean,
    lineMap: () => LineMap,
    parseOptions: () => ParseOptions,
    sourceUnit: () => SourceUnitSyntax,
    structuralEquals: SyntaxTree => Boolean,
    toJSON: js.Any => js.Any
  ): SyntaxTree = {
    val __obj = js.Dynamic.literal(_allDiagnostics = _allDiagnostics.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _isDeclaration = _isDeclaration.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _parseOptions = _parseOptions.asInstanceOf[js.Any], _parserDiagnostics = _parserDiagnostics.asInstanceOf[js.Any], _sourceUnit = _sourceUnit.asInstanceOf[js.Any], computeDiagnostics = js.Any.fromFunction0(computeDiagnostics), diagnostics = js.Any.fromFunction0(diagnostics), fileName = js.Any.fromFunction0(fileName), isDeclaration = js.Any.fromFunction0(isDeclaration), lineMap = js.Any.fromFunction0(lineMap), parseOptions = js.Any.fromFunction0(parseOptions), sourceUnit = js.Any.fromFunction0(sourceUnit), structuralEquals = js.Any.fromFunction1(structuralEquals), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[SyntaxTree]
  }
  
  extension [Self <: SyntaxTree](x: Self) {
    
    inline def setComputeDiagnostics(value: () => js.Any): Self = StObject.set(x, "computeDiagnostics", js.Any.fromFunction0(value))
    
    inline def setDiagnostics(value: () => js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", js.Any.fromFunction0(value))
    
    inline def setFileName(value: () => String): Self = StObject.set(x, "fileName", js.Any.fromFunction0(value))
    
    inline def setIsDeclaration(value: () => Boolean): Self = StObject.set(x, "isDeclaration", js.Any.fromFunction0(value))
    
    inline def setLineMap(value: () => LineMap): Self = StObject.set(x, "lineMap", js.Any.fromFunction0(value))
    
    inline def setParseOptions(value: () => ParseOptions): Self = StObject.set(x, "parseOptions", js.Any.fromFunction0(value))
    
    inline def setSourceUnit(value: () => SourceUnitSyntax): Self = StObject.set(x, "sourceUnit", js.Any.fromFunction0(value))
    
    inline def setStructuralEquals(value: SyntaxTree => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: js.Any => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_allDiagnostics(value: js.Any): Self = StObject.set(x, "_allDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_fileName(value: js.Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    inline def set_isDeclaration(value: js.Any): Self = StObject.set(x, "_isDeclaration", value.asInstanceOf[js.Any])
    
    inline def set_lineMap(value: js.Any): Self = StObject.set(x, "_lineMap", value.asInstanceOf[js.Any])
    
    inline def set_parseOptions(value: js.Any): Self = StObject.set(x, "_parseOptions", value.asInstanceOf[js.Any])
    
    inline def set_parserDiagnostics(value: js.Any): Self = StObject.set(x, "_parserDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_sourceUnit(value: js.Any): Self = StObject.set(x, "_sourceUnit", value.asInstanceOf[js.Any])
  }
}
