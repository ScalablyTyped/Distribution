package typings.typedoc.mod.TypeScript

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ExtendedConfigCacheEntry
import typings.typescript.mod.Map
import typings.typescript.mod.ParseConfigFileHost
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getParsedCommandLineOfConfigFile")
@js.native
object getParsedCommandLineOfConfigFile extends js.Object {
  def apply(configFileName: String, optionsToExtend: CompilerOptions, host: ParseConfigFileHost): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry],
    watchOptionsToExtend: WatchOptions
  ): js.UndefOr[ParsedCommandLine] = js.native
}

