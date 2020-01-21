package typings.tsNode

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ExtendedConfigCacheEntry
import typings.typescript.mod.FileExtensionInfo
import typings.typescript.mod.Map
import typings.typescript.mod.ParseConfigHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnBasePath extends js.Object {
  def apply(json: js.Any, host: ParseConfigHost, basePath: String): ParsedCommandLine = js.native
  def apply(json: js.Any, host: ParseConfigHost, basePath: String, existingOptions: CompilerOptions): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path]
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: CompilerOptions,
    configFileName: String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo],
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): ParsedCommandLine = js.native
}

