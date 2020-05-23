package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitOptions extends js.Object {
  var _commonDirectoryPath: js.Any
  var _diagnostic: js.Any
  var _outputDirectory: js.Any
  var _settings: js.Any
  var _sharedOutputFile: js.Any
  var _sourceMapRootDirectory: js.Any
  var _sourceRootDirectory: js.Any
  def commonDirectoryPath(): String
  def compilationSettings(): ImmutableCompilationSettings
  /* private */ def determineCommonDirectoryPath(compiler: js.Any): js.Any
  def diagnostic(): Diagnostic
  def outputDirectory(): String
  def resolvePath(path: String): String
  def sharedOutputFile(): String
  def sourceMapRootDirectory(): String
  def sourceRootDirectory(): String
}

object EmitOptions {
  @scala.inline
  def apply(
    _commonDirectoryPath: js.Any,
    _diagnostic: js.Any,
    _outputDirectory: js.Any,
    _settings: js.Any,
    _sharedOutputFile: js.Any,
    _sourceMapRootDirectory: js.Any,
    _sourceRootDirectory: js.Any,
    commonDirectoryPath: () => String,
    compilationSettings: () => ImmutableCompilationSettings,
    determineCommonDirectoryPath: js.Any => js.Any,
    diagnostic: () => Diagnostic,
    outputDirectory: () => String,
    resolvePath: String => String,
    sharedOutputFile: () => String,
    sourceMapRootDirectory: () => String,
    sourceRootDirectory: () => String
  ): EmitOptions = {
    val __obj = js.Dynamic.literal(_commonDirectoryPath = _commonDirectoryPath.asInstanceOf[js.Any], _diagnostic = _diagnostic.asInstanceOf[js.Any], _outputDirectory = _outputDirectory.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _sharedOutputFile = _sharedOutputFile.asInstanceOf[js.Any], _sourceMapRootDirectory = _sourceMapRootDirectory.asInstanceOf[js.Any], _sourceRootDirectory = _sourceRootDirectory.asInstanceOf[js.Any], commonDirectoryPath = js.Any.fromFunction0(commonDirectoryPath), compilationSettings = js.Any.fromFunction0(compilationSettings), determineCommonDirectoryPath = js.Any.fromFunction1(determineCommonDirectoryPath), diagnostic = js.Any.fromFunction0(diagnostic), outputDirectory = js.Any.fromFunction0(outputDirectory), resolvePath = js.Any.fromFunction1(resolvePath), sharedOutputFile = js.Any.fromFunction0(sharedOutputFile), sourceMapRootDirectory = js.Any.fromFunction0(sourceMapRootDirectory), sourceRootDirectory = js.Any.fromFunction0(sourceRootDirectory))
    __obj.asInstanceOf[EmitOptions]
  }
}

