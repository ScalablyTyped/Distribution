package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SyntaxTree")
@js.native
class SyntaxTree protected () extends js.Object {
  def this(sourceUnit: SourceUnitSyntax, isDeclaration: scala.Boolean, diagnostics: js.Array[Diagnostic], fileName: java.lang.String, lineMap: LineMap, parseOtions: ParseOptions) = this()
  var _allDiagnostics: js.Any = js.native
  var _fileName: js.Any = js.native
  var _isDeclaration: js.Any = js.native
  var _lineMap: js.Any = js.native
  var _parseOptions: js.Any = js.native
  var _parserDiagnostics: js.Any = js.native
  var _sourceUnit: js.Any = js.native
  /* private */ def computeDiagnostics(): js.Any = js.native
  def diagnostics(): js.Array[Diagnostic] = js.native
  def fileName(): java.lang.String = js.native
  def isDeclaration(): scala.Boolean = js.native
  def lineMap(): LineMap = js.native
  def parseOptions(): ParseOptions = js.native
  def sourceUnit(): SourceUnitSyntax = js.native
  def structuralEquals(tree: SyntaxTree): scala.Boolean = js.native
  def toJSON(key: js.Any): js.Any = js.native
}

