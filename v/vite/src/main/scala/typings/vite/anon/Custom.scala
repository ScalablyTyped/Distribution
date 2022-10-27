package typings.vite.anon

import typings.rollup.mod.CustomPluginOptions
import typings.std.Set
import typings.vite.mod.Plugin2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom extends StObject {
  
  var custom: js.UndefOr[CustomPluginOptions] = js.undefined
  
  /* Excluded from this release type: scan */
  var isEntry: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[Set[Plugin2]] = js.undefined
  
  var ssr: js.UndefOr[Boolean] = js.undefined
}
object Custom {
  
  inline def apply(): Custom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Custom]
  }
  
  extension [Self <: Custom](x: Self) {
    
    inline def setCustom(value: CustomPluginOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsEntryUndefined: Self = StObject.set(x, "isEntry", js.undefined)
    
    inline def setSkip(value: Set[Plugin2]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
  }
}
