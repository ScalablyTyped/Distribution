package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced options for cleaning assets.
  */
trait CleanOptions extends StObject {
  
  /**
  	 * Log the assets that should be removed instead of deleting them.
  	 */
  var dry: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Keep these assets.
  	 */
  var keep: js.UndefOr[String | js.RegExp | (js.Function1[/* filename */ String, Boolean])] = js.undefined
}
object CleanOptions {
  
  inline def apply(): CleanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CleanOptions]
  }
  
  extension [Self <: CleanOptions](x: Self) {
    
    inline def setDry(value: Boolean): Self = StObject.set(x, "dry", value.asInstanceOf[js.Any])
    
    inline def setDryUndefined: Self = StObject.set(x, "dry", js.undefined)
    
    inline def setKeep(value: String | js.RegExp | (js.Function1[/* filename */ String, Boolean])): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
    
    inline def setKeepFunction1(value: /* filename */ String => Boolean): Self = StObject.set(x, "keep", js.Any.fromFunction1(value))
    
    inline def setKeepUndefined: Self = StObject.set(x, "keep", js.undefined)
  }
}
