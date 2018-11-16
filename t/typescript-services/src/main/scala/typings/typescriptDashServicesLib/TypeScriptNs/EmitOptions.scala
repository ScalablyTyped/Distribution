package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EmitOptions")
@js.native
class EmitOptions protected () extends js.Object {
  def this(compiler: TypeScriptCompiler, resolvePath: js.Function1[/* path */ java.lang.String, java.lang.String]) = this()
  var _commonDirectoryPath: js.Any = js.native
  var _diagnostic: js.Any = js.native
  var _outputDirectory: js.Any = js.native
  var _settings: js.Any = js.native
  var _sharedOutputFile: js.Any = js.native
  var _sourceMapRootDirectory: js.Any = js.native
  var _sourceRootDirectory: js.Any = js.native
  def commonDirectoryPath(): java.lang.String = js.native
  def compilationSettings(): ImmutableCompilationSettings = js.native
  /* private */ def determineCommonDirectoryPath(compiler: js.Any): js.Any = js.native
  def diagnostic(): Diagnostic = js.native
  def outputDirectory(): java.lang.String = js.native
  def resolvePath(path: java.lang.String): java.lang.String = js.native
  def sharedOutputFile(): java.lang.String = js.native
  def sourceMapRootDirectory(): java.lang.String = js.native
  def sourceRootDirectory(): java.lang.String = js.native
}

