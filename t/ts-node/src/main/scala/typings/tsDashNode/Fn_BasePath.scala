package typings.tsDashNode

import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ExtendedConfigCacheEntry
import typings.typescript.typescriptMod.FileExtensionInfo
import typings.typescript.typescriptMod.Map
import typings.typescript.typescriptMod.ParseConfigHost
import typings.typescript.typescriptMod.ParsedCommandLine
import typings.typescript.typescriptMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BasePath extends js.Object {
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

