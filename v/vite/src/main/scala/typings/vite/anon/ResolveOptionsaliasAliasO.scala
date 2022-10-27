package typings.vite.anon

import typings.vite.mod.Alias
import typings.vite.mod.AliasOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vite.vite.ResolveOptions & {  alias :vite.vite.AliasOptions | undefined} */
trait ResolveOptionsaliasAliasO extends StObject {
  
  var alias: js.UndefOr[AliasOptions] = js.undefined
  
  /**
    * @deprecated In future, `mainFields` should be used instead.
    * @default true
    */
  var browserField: js.UndefOr[Boolean] = js.undefined
  
  var conditions: js.UndefOr[js.Array[String]] = js.undefined
  
  var dedupe: js.UndefOr[js.Array[String]] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
}
object ResolveOptionsaliasAliasO {
  
  inline def apply(): ResolveOptionsaliasAliasO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveOptionsaliasAliasO]
  }
  
  extension [Self <: ResolveOptionsaliasAliasO](x: Self) {
    
    inline def setAlias(value: AliasOptions): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliasVarargs(value: Alias*): Self = StObject.set(x, "alias", js.Array(value*))
    
    inline def setBrowserField(value: Boolean): Self = StObject.set(x, "browserField", value.asInstanceOf[js.Any])
    
    inline def setBrowserFieldUndefined: Self = StObject.set(x, "browserField", js.undefined)
    
    inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDedupe(value: js.Array[String]): Self = StObject.set(x, "dedupe", value.asInstanceOf[js.Any])
    
    inline def setDedupeUndefined: Self = StObject.set(x, "dedupe", js.undefined)
    
    inline def setDedupeVarargs(value: String*): Self = StObject.set(x, "dedupe", js.Array(value*))
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
    
    inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
    
    inline def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value*))
    
    inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
    
    inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
  }
}
