package typings.vite.anon

import typings.rollup.mod.CustomPluginOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom extends StObject {
  
  var assertions: Record[String, String]
  
  var custom: js.UndefOr[CustomPluginOptions] = js.undefined
  
  /* Excluded from this release type: scan */
  var isEntry: Boolean
  
  var ssr: js.UndefOr[Boolean] = js.undefined
}
object Custom {
  
  inline def apply(assertions: Record[String, String], isEntry: Boolean): Custom = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], isEntry = isEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
    
    inline def setAssertions(value: Record[String, String]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: CustomPluginOptions): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
  }
}
