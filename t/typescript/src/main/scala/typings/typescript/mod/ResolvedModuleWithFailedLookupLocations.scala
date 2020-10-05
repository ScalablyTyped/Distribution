package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedModuleWithFailedLookupLocations extends js.Object {
  val resolvedModule: js.UndefOr[ResolvedModuleFull] = js.native
}

object ResolvedModuleWithFailedLookupLocations {
  @scala.inline
  def apply(): ResolvedModuleWithFailedLookupLocations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolvedModuleWithFailedLookupLocations]
  }
  @scala.inline
  implicit class ResolvedModuleWithFailedLookupLocationsOps[Self <: ResolvedModuleWithFailedLookupLocations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResolvedModule(value: ResolvedModuleFull): Self = this.set("resolvedModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedModule: Self = this.set("resolvedModule", js.undefined)
  }
  
}

