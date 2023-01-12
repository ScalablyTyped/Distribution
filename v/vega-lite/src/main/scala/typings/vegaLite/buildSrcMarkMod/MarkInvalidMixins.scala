package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.vegaLiteStrings.filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkInvalidMixins extends StObject {
  
  /**
    * Defines how Vega-Lite should handle marks for invalid values (`null` and `NaN`).
    * - If set to `"filter"` (default), all data items with null values will be skipped (for line, trail, and area marks) or filtered (for other marks).
    * - If `null`, all data items are included. In this case, invalid values will be interpreted as zeroes.
    */
  var invalid: js.UndefOr[filter | Hide | Null] = js.undefined
}
object MarkInvalidMixins {
  
  inline def apply(): MarkInvalidMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkInvalidMixins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkInvalidMixins] (val x: Self) extends AnyVal {
    
    inline def setInvalid(value: filter | Hide): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidNull: Self = StObject.set(x, "invalid", null)
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
  }
}
