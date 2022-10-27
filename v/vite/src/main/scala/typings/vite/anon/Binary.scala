package typings.vite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binary extends StObject {
  
  var binary: js.UndefOr[Boolean] = js.undefined
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var fin: js.UndefOr[Boolean] = js.undefined
  
  var mask: js.UndefOr[Boolean] = js.undefined
}
object Binary {
  
  inline def apply(): Binary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Binary]
  }
  
  extension [Self <: Binary](x: Self) {
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setFin(value: Boolean): Self = StObject.set(x, "fin", value.asInstanceOf[js.Any])
    
    inline def setFinUndefined: Self = StObject.set(x, "fin", js.undefined)
    
    inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
