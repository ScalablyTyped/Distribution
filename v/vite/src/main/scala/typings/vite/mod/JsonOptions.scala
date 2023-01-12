package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonOptions extends StObject {
  
  /**
    * Generate a named export for every property of the JSON object
    * @default true
    */
  var namedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Generate performant output as JSON.parse("stringified").
    * Enabling this will disable namedExports.
    * @default false
    */
  var stringify: js.UndefOr[Boolean] = js.undefined
}
object JsonOptions {
  
  inline def apply(): JsonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonOptions] (val x: Self) extends AnyVal {
    
    inline def setNamedExports(value: Boolean): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
    
    inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
    
    inline def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
  }
}
