package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedModuleWithFailedLookupLocations extends js.Object {
  val resolvedModule: js.UndefOr[ResolvedModuleFull] = js.undefined
}

object ResolvedModuleWithFailedLookupLocations {
  @scala.inline
  def apply(resolvedModule: ResolvedModuleFull = null): ResolvedModuleWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal()
    if (resolvedModule != null) __obj.updateDynamic("resolvedModule")(resolvedModule)
    __obj.asInstanceOf[ResolvedModuleWithFailedLookupLocations]
  }
}

