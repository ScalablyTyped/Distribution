package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontStyles extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var face: js.UndefOr[String] = js.native
  
  var mod: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var vadjust: js.UndefOr[Double] = js.native
}
object FontStyles {
  
  @scala.inline
  def apply(): FontStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyles]
  }
  
  @scala.inline
  implicit class FontStylesOps[Self <: FontStyles] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFace(value: String): Self = this.set("face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFace: Self = this.set("face", js.undefined)
    
    @scala.inline
    def setMod(value: String): Self = this.set("mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMod: Self = this.set("mod", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVadjust(value: Double): Self = this.set("vadjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVadjust: Self = this.set("vadjust", js.undefined)
  }
}
