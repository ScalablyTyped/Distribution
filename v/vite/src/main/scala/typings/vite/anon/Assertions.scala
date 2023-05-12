package typings.vite.anon

import typings.rollup.mod.CustomPluginOptions
import typings.std.Record
import typings.std.Set
import typings.vite.mod.Plugin2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assertions extends StObject {
  
  var assertions: js.UndefOr[Record[String, String]] = js.undefined
  
  var custom: js.UndefOr[CustomPluginOptions] = js.undefined
  
  /* Excluded from this release type: scan */
  var isEntry: js.UndefOr[Boolean] = js.undefined
  
  var skip: js.UndefOr[Set[Plugin2]] = js.undefined
  
  var ssr: js.UndefOr[Boolean] = js.undefined
}
object Assertions {
  
  inline def apply(): Assertions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assertions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Assertions] (val x: Self) extends AnyVal {
    
    inline def setAssertions(value: Record[String, String]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
    
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
