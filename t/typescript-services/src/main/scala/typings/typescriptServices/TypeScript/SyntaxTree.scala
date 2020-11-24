package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxTree extends js.Object {
  
  var _allDiagnostics: js.Any = js.native
  
  var _fileName: js.Any = js.native
  
  var _isDeclaration: js.Any = js.native
  
  var _lineMap: js.Any = js.native
  
  var _parseOptions: js.Any = js.native
  
  var _parserDiagnostics: js.Any = js.native
  
  var _sourceUnit: js.Any = js.native
  
  /* private */ def computeDiagnostics(): js.Any = js.native
  
  def diagnostics(): js.Array[Diagnostic] = js.native
  
  def fileName(): String = js.native
  
  def isDeclaration(): Boolean = js.native
  
  def lineMap(): LineMap = js.native
  
  def parseOptions(): ParseOptions = js.native
  
  def sourceUnit(): SourceUnitSyntax = js.native
  
  def structuralEquals(tree: SyntaxTree): Boolean = js.native
  
  def toJSON(key: js.Any): js.Any = js.native
}
object SyntaxTree {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SyntaxTreeOps[Self <: SyntaxTree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_allDiagnostics(value: js.Any): Self = this.set("_allDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fileName(value: js.Any): Self = this.set("_fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isDeclaration(value: js.Any): Self = this.set("_isDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lineMap(value: js.Any): Self = this.set("_lineMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parseOptions(value: js.Any): Self = this.set("_parseOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_parserDiagnostics(value: js.Any): Self = this.set("_parserDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUnit(value: js.Any): Self = this.set("_sourceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeDiagnostics(value: () => js.Any): Self = this.set("computeDiagnostics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDiagnostics(value: () => js.Array[Diagnostic]): Self = this.set("diagnostics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileName(value: () => String): Self = this.set("fileName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDeclaration(value: () => Boolean): Self = this.set("isDeclaration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLineMap(value: () => LineMap): Self = this.set("lineMap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParseOptions(value: () => ParseOptions): Self = this.set("parseOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSourceUnit(value: () => SourceUnitSyntax): Self = this.set("sourceUnit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructuralEquals(value: SyntaxTree => Boolean): Self = this.set("structuralEquals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: js.Any => js.Any): Self = this.set("toJSON", js.Any.fromFunction1(value))
  }
}
