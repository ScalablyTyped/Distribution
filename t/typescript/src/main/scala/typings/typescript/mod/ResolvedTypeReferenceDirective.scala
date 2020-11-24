package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedTypeReferenceDirective extends js.Object {
  
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.native
  
  var packageId: js.UndefOr[PackageId] = js.native
  
  var primary: Boolean = js.native
  
  var resolvedFileName: js.UndefOr[java.lang.String] = js.native
}
object ResolvedTypeReferenceDirective {
  
  @scala.inline
  def apply(primary: Boolean): ResolvedTypeReferenceDirective = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirective]
  }
  
  @scala.inline
  implicit class ResolvedTypeReferenceDirectiveOps[Self <: ResolvedTypeReferenceDirective] (val x: Self) extends AnyVal {
    
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
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExternalLibraryImport(value: Boolean): Self = this.set("isExternalLibraryImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExternalLibraryImport: Self = this.set("isExternalLibraryImport", js.undefined)
    
    @scala.inline
    def setPackageId(value: PackageId): Self = this.set("packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
    
    @scala.inline
    def setResolvedFileName(value: java.lang.String): Self = this.set("resolvedFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedFileName: Self = this.set("resolvedFileName", js.undefined)
  }
}
