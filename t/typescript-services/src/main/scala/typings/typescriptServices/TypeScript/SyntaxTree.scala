package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxTree extends js.Object {
  var _allDiagnostics: js.Any
  var _fileName: js.Any
  var _isDeclaration: js.Any
  var _lineMap: js.Any
  var _parseOptions: js.Any
  var _parserDiagnostics: js.Any
  var _sourceUnit: js.Any
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
}

