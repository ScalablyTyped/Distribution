package typings.tileReduce.TileReduce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends js.Object {
  
  var layers: js.UndefOr[js.Array[String]] = js.native
  
  var maxrate: js.UndefOr[Double] = js.native
  
  var mbtiles: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Source {
  
  @scala.inline
  def apply(name: String): Source = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setMaxrate(value: Double): Self = this.set("maxrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxrate: Self = this.set("maxrate", js.undefined)
    
    @scala.inline
    def setMbtiles(value: String): Self = this.set("mbtiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMbtiles: Self = this.set("mbtiles", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
