package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object for DataUrl condition.
  */
trait AssetParserDataUrlOptions extends StObject {
  
  /**
  	 * Maximum size of asset that should be inline as modules. Default: 8kb.
  	 */
  var maxSize: js.UndefOr[Double] = js.undefined
}
object AssetParserDataUrlOptions {
  
  inline def apply(): AssetParserDataUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetParserDataUrlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetParserDataUrlOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
  }
}
