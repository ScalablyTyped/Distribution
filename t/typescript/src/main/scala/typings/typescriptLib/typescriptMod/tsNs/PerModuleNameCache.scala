package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerModuleNameCache extends js.Object {
  def get(directory: java.lang.String): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
  def set(directory: java.lang.String, result: ResolvedModuleWithFailedLookupLocations): scala.Unit
}

object PerModuleNameCache {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, js.UndefOr[ResolvedModuleWithFailedLookupLocations]],
    set: js.Function2[java.lang.String, ResolvedModuleWithFailedLookupLocations, scala.Unit]
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[PerModuleNameCache]
  }
}

