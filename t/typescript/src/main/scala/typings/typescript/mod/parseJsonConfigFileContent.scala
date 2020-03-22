package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "parseJsonConfigFileContent")
@js.native
object parseJsonConfigFileContent extends js.Object {
  def apply(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: js.UndefOr[CompilerOptions],
    configFileName: js.UndefOr[java.lang.String],
    resolutionStack: js.UndefOr[js.Array[Path]],
    extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
    extendedConfigCache: js.UndefOr[Map[ExtendedConfigCacheEntry]],
    existingWatchOptions: js.UndefOr[WatchOptions]
  ): ParsedCommandLine = js.native
}

