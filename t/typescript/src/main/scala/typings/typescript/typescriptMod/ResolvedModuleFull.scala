package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ResolvedModule with an explicitly provided `extension` property.
  * Prefer this over `ResolvedModule`.
  * If changing this, remember to change `moduleResolutionIsEqualTo`.
  */
trait ResolvedModuleFull extends ResolvedModule {
  /**
    * Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
    * This is optional for backwards-compatibility, but will be added if not provided.
    */
  var extension: Extension
  var packageId: js.UndefOr[PackageId] = js.undefined
}

object ResolvedModuleFull {
  @scala.inline
  def apply(
    extension: Extension,
    resolvedFileName: String,
    isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined,
    packageId: PackageId = null
  ): ResolvedModuleFull = {
    val __obj = js.Dynamic.literal(extension = extension, resolvedFileName = resolvedFileName)
    if (!js.isUndefined(isExternalLibraryImport)) __obj.updateDynamic("isExternalLibraryImport")(isExternalLibraryImport)
    if (packageId != null) __obj.updateDynamic("packageId")(packageId)
    __obj.asInstanceOf[ResolvedModuleFull]
  }
}

