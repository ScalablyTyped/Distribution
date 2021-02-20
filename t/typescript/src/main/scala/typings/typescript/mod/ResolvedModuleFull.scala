package typings.typescript.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ResolvedModuleFullMutableBuilder[Self <: ResolvedModuleFull] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: Extension): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageId(value: PackageId): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
  }
}
