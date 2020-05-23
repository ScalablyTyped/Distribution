package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedModule extends js.Object {
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined
  /** Path of the file the module was resolved to. */
  var resolvedFileName: java.lang.String
}

object ResolvedModule {
  @scala.inline
  def apply(resolvedFileName: java.lang.String, isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined): ResolvedModule = {
    val __obj = js.Dynamic.literal(resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternalLibraryImport)) __obj.updateDynamic("isExternalLibraryImport")(isExternalLibraryImport.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
}

