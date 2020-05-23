package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    resolvedFileName: java.lang.String,
    isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined,
    packageId: PackageId = null
  ): ResolvedModuleFull = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternalLibraryImport)) __obj.updateDynamic("isExternalLibraryImport")(isExternalLibraryImport.get.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModuleFull]
  }
}

