package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ExtendedConfigCacheEntry
import typings.typescript.mod.FileExtensionInfo
import typings.typescript.mod.Map
import typings.typescript.mod.ParseConfigHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Path
import typings.typescript.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.parseJsonConfigFileContent")
@js.native
object parseJsonConfigFileContent extends js.Object {
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: String,
    existingOptions: js.UndefOr[CompilerOptions],
    configFileName: js.UndefOr[String],
    resolutionStack: js.UndefOr[js.Array[Path]],
    extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
    extendedConfigCache: js.UndefOr[Map[ExtendedConfigCacheEntry]],
    existingWatchOptions: js.UndefOr[WatchOptions]
  ): ParsedCommandLine = js.native
}

