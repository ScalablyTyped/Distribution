package typings
package tsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BasePath extends js.Object {
  def apply(json: js.Any, host: typescriptLib.typescriptMod.ParseConfigHost, basePath: java.lang.String): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.FileExtensionInfo]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
  def apply(
    json: js.Any,
    host: typescriptLib.typescriptMod.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.FileExtensionInfo],
    extendedConfigCache: typescriptLib.typescriptMod.Map[typescriptLib.typescriptMod.ExtendedConfigCacheEntry]
  ): typescriptLib.typescriptMod.ParsedCommandLine = js.native
}

