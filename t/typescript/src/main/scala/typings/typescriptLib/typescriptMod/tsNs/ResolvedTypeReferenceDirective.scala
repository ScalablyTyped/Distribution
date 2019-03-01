package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedTypeReferenceDirective extends js.Object {
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[scala.Boolean] = js.undefined
  var packageId: js.UndefOr[PackageId] = js.undefined
  var primary: scala.Boolean
  var resolvedFileName: js.UndefOr[java.lang.String]
}

object ResolvedTypeReferenceDirective {
  @scala.inline
  def apply(
    primary: scala.Boolean,
    isExternalLibraryImport: js.UndefOr[scala.Boolean] = js.undefined,
    packageId: PackageId = null,
    resolvedFileName: java.lang.String = null
  ): ResolvedTypeReferenceDirective = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(isExternalLibraryImport)) __obj.updateDynamic("isExternalLibraryImport")(isExternalLibraryImport)
    if (packageId != null) __obj.updateDynamic("packageId")(packageId)
    if (resolvedFileName != null) __obj.updateDynamic("resolvedFileName")(resolvedFileName)
    __obj.asInstanceOf[ResolvedTypeReferenceDirective]
  }
}

