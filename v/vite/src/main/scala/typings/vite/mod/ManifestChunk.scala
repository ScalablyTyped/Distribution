package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestChunk extends StObject {
  
  var assets: js.UndefOr[js.Array[String]] = js.undefined
  
  var css: js.UndefOr[js.Array[String]] = js.undefined
  
  var dynamicImports: js.UndefOr[js.Array[String]] = js.undefined
  
  var file: String
  
  var imports: js.UndefOr[js.Array[String]] = js.undefined
  
  var isDynamicEntry: js.UndefOr[Boolean] = js.undefined
  
  var isEntry: js.UndefOr[Boolean] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object ManifestChunk {
  
  inline def apply(file: String): ManifestChunk = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestChunk] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[String]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: String*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setCss(value: js.Array[String]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setCssVarargs(value: String*): Self = StObject.set(x, "css", js.Array(value*))
    
    inline def setDynamicImports(value: js.Array[String]): Self = StObject.set(x, "dynamicImports", value.asInstanceOf[js.Any])
    
    inline def setDynamicImportsUndefined: Self = StObject.set(x, "dynamicImports", js.undefined)
    
    inline def setDynamicImportsVarargs(value: String*): Self = StObject.set(x, "dynamicImports", js.Array(value*))
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setIsDynamicEntry(value: Boolean): Self = StObject.set(x, "isDynamicEntry", value.asInstanceOf[js.Any])
    
    inline def setIsDynamicEntryUndefined: Self = StObject.set(x, "isDynamicEntry", js.undefined)
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsEntryUndefined: Self = StObject.set(x, "isEntry", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
