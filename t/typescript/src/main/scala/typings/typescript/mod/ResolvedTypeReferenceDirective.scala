package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedTypeReferenceDirective extends StObject {
  
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
  implicit class ResolvedTypeReferenceDirectiveMutableBuilder[Self <: ResolvedTypeReferenceDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsExternalLibraryImport(value: Boolean): Self = StObject.set(x, "isExternalLibraryImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExternalLibraryImportUndefined: Self = StObject.set(x, "isExternalLibraryImport", js.undefined)
    
    @scala.inline
    def setPackageId(value: PackageId): Self = StObject.set(x, "packageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageIdUndefined: Self = StObject.set(x, "packageId", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedFileName(value: java.lang.String): Self = StObject.set(x, "resolvedFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedFileNameUndefined: Self = StObject.set(x, "resolvedFileName", js.undefined)
  }
}
