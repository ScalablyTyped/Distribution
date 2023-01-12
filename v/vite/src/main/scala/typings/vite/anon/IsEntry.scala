package typings.vite.anon

import typings.rollup.mod.CustomPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEntry extends StObject {
  
  var custom: js.UndefOr[CustomPluginOptions] = js.undefined
  
  /* Excluded from this release type: scan */
  var isEntry: Boolean
  
  var ssr: js.UndefOr[Boolean] = js.undefined
}
object IsEntry {
  
  inline def apply(isEntry: Boolean): IsEntry = {
    val __obj = js.Dynamic.literal(isEntry = isEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsEntry] (val x: Self) extends AnyVal {
    
    inline def setCustom(value: CustomPluginOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
  }
}
