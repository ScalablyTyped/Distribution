package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "parseJsonSourceFileConfigFileContent")
@js.native
object parseJsonSourceFileConfigFileContent extends js.Object {
  
  def apply(
    sourceFile: TsConfigSourceFile,
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
