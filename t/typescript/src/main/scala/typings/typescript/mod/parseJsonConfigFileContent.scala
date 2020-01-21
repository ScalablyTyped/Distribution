package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "parseJsonConfigFileContent")
@js.native
object parseJsonConfigFileContent extends js.Object {
  def apply(json: js.Any, host: ParseConfigHost, basePath: java.lang.String): ParsedCommandLine = js.native
  def apply(json: js.Any, host: ParseConfigHost, basePath: java.lang.String, existingOptions: CompilerOptions): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path]
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo],
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): ParsedCommandLine = js.native
}

