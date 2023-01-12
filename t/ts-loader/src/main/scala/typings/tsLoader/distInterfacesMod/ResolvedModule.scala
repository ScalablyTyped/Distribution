package typings.tsLoader.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedModule extends StObject {
  
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined
  
  var originalFileName: String
  
  var resolvedFileName: String
  
  var resolvedModule: js.UndefOr[ResolvedModule] = js.undefined
}
object ResolvedModule {
  
  inline def apply(originalFileName: String, resolvedFileName: String): ResolvedModule = {
    val __obj = js.Dynamic.literal(originalFileName = originalFileName.asInstanceOf[js.Any], resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedModule] (val x: Self) extends AnyVal {
    
    inline def setIsExternalLibraryImport(value: Boolean): Self = StObject.set(x, "isExternalLibraryImport", value.asInstanceOf[js.Any])
    
    inline def setIsExternalLibraryImportUndefined: Self = StObject.set(x, "isExternalLibraryImport", js.undefined)
    
    inline def setOriginalFileName(value: String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
    
    inline def setResolvedFileName(value: String): Self = StObject.set(x, "resolvedFileName", value.asInstanceOf[js.Any])
    
    inline def setResolvedModule(value: ResolvedModule): Self = StObject.set(x, "resolvedModule", value.asInstanceOf[js.Any])
    
    inline def setResolvedModuleUndefined: Self = StObject.set(x, "resolvedModule", js.undefined)
  }
}
