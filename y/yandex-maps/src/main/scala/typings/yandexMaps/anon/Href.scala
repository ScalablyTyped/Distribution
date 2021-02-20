package typings.yandexMaps.anon

import typings.yandexMaps.mod.IGeometryJson
import typings.yandexMaps.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Href extends StObject {
  
  var href: String = js.native
  
  var ooffset: js.Array[Double] = js.native
  
  var shape: js.UndefOr[IShape | IGeometryJson] = js.native
  
  var size: js.Array[Double] = js.native
}
object Href {
  
  @scala.inline
  def apply(href: String, ooffset: js.Array[Double], size: js.Array[Double]): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], ooffset = ooffset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
  
  @scala.inline
  implicit class HrefMutableBuilder[Self <: Href] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOoffset(value: js.Array[Double]): Self = StObject.set(x, "ooffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOoffsetVarargs(value: Double*): Self = StObject.set(x, "ooffset", js.Array(value :_*))
    
    @scala.inline
    def setShape(value: IShape | IGeometryJson): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
  }
}
