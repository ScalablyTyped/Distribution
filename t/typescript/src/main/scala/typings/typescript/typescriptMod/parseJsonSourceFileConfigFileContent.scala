package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "parseJsonSourceFileConfigFileContent")
@js.native
object parseJsonSourceFileConfigFileContent extends js.Object {
  def apply(sourceFile: TsConfigSourceFile, host: ParseConfigHost, basePath: String): ParsedCommandLine = js.native
  def apply(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions
  ): ParsedCommandLine = js.native
  def apply(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String
  ): ParsedCommandLine = js.native
  def apply(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path]
  ): ParsedCommandLine = js.native
  def apply(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): ParsedCommandLine = js.native
  def apply(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo],
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): ParsedCommandLine = js.native
}

