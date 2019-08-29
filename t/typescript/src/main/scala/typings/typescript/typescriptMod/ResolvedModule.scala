package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedModule extends js.Object {
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined
  /** Path of the file the module was resolved to. */
  var resolvedFileName: String
}

object ResolvedModule {
  @scala.inline
  def apply(resolvedFileName: String, isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined): ResolvedModule = {
    val __obj = js.Dynamic.literal(resolvedFileName = resolvedFileName)
    if (!js.isUndefined(isExternalLibraryImport)) __obj.updateDynamic("isExternalLibraryImport")(isExternalLibraryImport)
    __obj.asInstanceOf[ResolvedModule]
  }
}

