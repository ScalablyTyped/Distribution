package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var default: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var `type`: array
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setDefault(value: js.Array[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: js.Any*): Self = StObject.set(x, "default", js.Array(value :_*))
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
