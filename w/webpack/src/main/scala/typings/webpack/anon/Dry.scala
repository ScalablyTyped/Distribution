package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dry extends StObject {
  
  /**
  		 * Log the assets that should be removed instead of deleting them.
  		 */
  var dry: Boolean
  
  /**
  		 * Keep these assets.
  		 */
  var keep: js.UndefOr[String | js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
}
object Dry {
  
  inline def apply(dry: Boolean): Dry = {
    val __obj = js.Dynamic.literal(dry = dry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dry]
  }
  
  extension [Self <: Dry](x: Self) {
    
    inline def setDry(value: Boolean): Self = StObject.set(x, "dry", value.asInstanceOf[js.Any])
    
    inline def setKeep(value: String | js.RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
    
    inline def setKeepFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "keep", js.Any.fromFunction1(value))
    
    inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
  }
}
