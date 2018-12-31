package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerModuleNameCache extends js.Object {
  def get(directory: java.lang.String): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
  def set(directory: java.lang.String, result: ResolvedModuleWithFailedLookupLocations): scala.Unit
}

