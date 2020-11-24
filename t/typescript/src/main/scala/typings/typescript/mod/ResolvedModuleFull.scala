package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedModuleFull extends ResolvedModule {
  
  /**
    * Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
    * This is optional for backwards-compatibility, but will be added if not provided.
    */
  var extension: Extension = js.native
  
  var packageId: js.UndefOr[PackageId] = js.native
}
object ResolvedModuleFull {
  
  @scala.inline
  def apply(extension: Extension, resolvedFileName: java.lang.String): ResolvedModuleFull = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModuleFull]
  }
  
  @scala.inline
  implicit class ResolvedModuleFullOps[Self <: ResolvedModuleFull] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: Extension): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageId(value: PackageId): Self = this.set("packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageId: Self = this.set("packageId", js.undefined)
  }
}
