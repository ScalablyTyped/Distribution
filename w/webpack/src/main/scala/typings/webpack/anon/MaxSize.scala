package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxSize extends StObject {
  
  /**
  		 * Sets the name delimiter for created chunks
  		 */
  var automaticNameDelimiter: js.UndefOr[String] = js.undefined
  
  /**
  		 * Maximal size hint for the created chunks
  		 */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Minimal size for the created chunk
  		 */
  var minSize: js.UndefOr[Double] = js.undefined
}
object MaxSize {
  
  inline def apply(): MaxSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSize]
  }
  
  extension [Self <: MaxSize](x: Self) {
    
    inline def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    inline def setAutomaticNameDelimiterUndefined: Self = StObject.set(x, "automaticNameDelimiter", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
