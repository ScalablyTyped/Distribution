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

