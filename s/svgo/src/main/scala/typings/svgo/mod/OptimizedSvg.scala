package typings.svgo.mod

import typings.svgo.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizedSvg extends StObject {
  
  var data: String
  
  var info: Height
  
  var path: js.UndefOr[String] = js.undefined
}
object OptimizedSvg {
  
  inline def apply(data: String, info: Height): OptimizedSvg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizedSvg]
  }
  
  extension [Self <: OptimizedSvg](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: Height): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
