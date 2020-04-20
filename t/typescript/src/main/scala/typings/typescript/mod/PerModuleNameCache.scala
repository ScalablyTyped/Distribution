package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerModuleNameCache extends js.Object {
  def get(directory: java.lang.String): js.UndefOr[ResolvedModuleWithFailedLookupLocations]
  def set(directory: java.lang.String, result: ResolvedModuleWithFailedLookupLocations): Unit
}

object PerModuleNameCache {
  @scala.inline
  def apply(
    get: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations],
    set: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Unit
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PerModuleNameCache]
  }
}

