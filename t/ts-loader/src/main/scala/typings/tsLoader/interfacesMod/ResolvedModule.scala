package typings.tsLoader.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedModule extends js.Object {
  
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.native
  
  var originalFileName: String = js.native
  
  var resolvedFileName: String = js.native
  
  var resolvedModule: js.UndefOr[ResolvedModule] = js.native
}
object ResolvedModule {
  
  @scala.inline
  def apply(originalFileName: String, resolvedFileName: String): ResolvedModule = {
    val __obj = js.Dynamic.literal(originalFileName = originalFileName.asInstanceOf[js.Any], resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
  
  @scala.inline
  implicit class ResolvedModuleOps[Self <: ResolvedModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOriginalFileName(value: String): Self = this.set("originalFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedFileName(value: String): Self = this.set("resolvedFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExternalLibraryImport(value: Boolean): Self = this.set("isExternalLibraryImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExternalLibraryImport: Self = this.set("isExternalLibraryImport", js.undefined)
    
    @scala.inline
    def setResolvedModule(value: ResolvedModule): Self = this.set("resolvedModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedModule: Self = this.set("resolvedModule", js.undefined)
  }
}
