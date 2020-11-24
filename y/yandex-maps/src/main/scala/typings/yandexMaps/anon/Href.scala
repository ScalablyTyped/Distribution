package typings.yandexMaps.anon

import typings.yandexMaps.mod.IGeometryJson
import typings.yandexMaps.mod.IShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Href extends js.Object {
  
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
  implicit class HrefOps[Self <: Href] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOoffsetVarargs(value: Double*): Self = this.set("ooffset", js.Array(value :_*))
    
    @scala.inline
    def setOoffset(value: js.Array[Double]): Self = this.set("ooffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeVarargs(value: Double*): Self = this.set("size", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: js.Array[Double]): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: IShape | IGeometryJson): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
}
