package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedModuleFull
  extends StObject
     with ResolvedModule {
  
  /**
    * Extension of resolvedFileName. This must match what's at the end of resolvedFileName.
    * This is optional for backwards-compatibility, but will be added if not provided.
    */
  var `extension`: Extension
  
  var packageId: js.UndefOr[PackageId] = js.undefined
}
object ResolvedModuleFull {
  
  @scala.inline
  def apply(`extension`: Extension, resolvedFileName: java.lang.String): ResolvedModuleFull = {
    val __obj = js.Dynamic.literal(resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
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
