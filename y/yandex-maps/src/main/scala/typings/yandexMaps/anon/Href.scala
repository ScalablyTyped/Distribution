package typings.yandexMaps.anon

import typings.yandexMaps.mod.IGeometryJson
import typings.yandexMaps.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Href extends StObject {
  
  var href: String
  
  var ooffset: js.Array[Double]
  
  var shape: js.UndefOr[IShape | IGeometryJson] = js.undefined
  
  var size: js.Array[Double]
}
object Href {
  
  inline def apply(href: String, ooffset: js.Array[Double], size: js.Array[Double]): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], ooffset = ooffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  extension [Self <: Href](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setOoffset(value: js.Array[Double]): Self = StObject.set(x, "ooffset", value.asInstanceOf[js.Any])
    
    inline def setOoffsetVarargs(value: Double*): Self = StObject.set(x, "ooffset", js.Array(value :_*))
    
    inline def setShape(value: IShape | IGeometryJson): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
