package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  var extensions: js.UndefOr[Any] = js.undefined
  
  var index: Double
  
  var texCoord: js.UndefOr[Double] = js.undefined
}
object Extensions {
  
  inline def apply(index: Double): Extensions = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setExtensions(value: Any): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setTexCoord(value: Double): Self = StObject.set(x, "texCoord", value.asInstanceOf[js.Any])
    
    inline def setTexCoordUndefined: Self = StObject.set(x, "texCoord", js.undefined)
  }
}
