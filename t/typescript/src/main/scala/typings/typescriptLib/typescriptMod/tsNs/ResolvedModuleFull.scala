package typings
package typescriptLib.typescriptMod.tsNs

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

