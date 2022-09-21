package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportModuleOptions extends StObject {
  
  /**
  	 * target base uri
  	 */
  var baseUri: js.UndefOr[String] = js.undefined
  
  /**
  	 * the target layer
  	 */
  var layer: js.UndefOr[String] = js.undefined
  
  /**
  	 * the target public path
  	 */
  var publicPath: js.UndefOr[String] = js.undefined
}
object ImportModuleOptions {
  
  inline def apply(): ImportModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportModuleOptions]
  }
  
  extension [Self <: ImportModuleOptions](x: Self) {
    
    inline def setBaseUri(value: String): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
    
    inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
  }
}
