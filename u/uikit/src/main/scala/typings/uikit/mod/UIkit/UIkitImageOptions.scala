package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitImageOptions extends js.Object {
  
  var dataSrc: js.UndefOr[String] = js.native
  
  var dataSrcset: js.UndefOr[String | Boolean] = js.native
  
  var height: js.UndefOr[String | Boolean] = js.native
  
  var offsetLeft: js.UndefOr[String | Double] = js.native
  
  var offsetTop: js.UndefOr[String] = js.native
  
  var sizes: js.UndefOr[String | Boolean] = js.native
  
  var target: js.UndefOr[String | Boolean] = js.native
  
  var width: js.UndefOr[String | Boolean] = js.native
}
object UIkitImageOptions {
  
  @scala.inline
  def apply(): UIkitImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitImageOptions]
  }
  
  @scala.inline
  implicit class UIkitImageOptionsOps[Self <: UIkitImageOptions] (val x: Self) extends AnyVal {
    
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
    def setDataSrc(value: String): Self = this.set("dataSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSrc: Self = this.set("dataSrc", js.undefined)
    
    @scala.inline
    def setDataSrcset(value: String | Boolean): Self = this.set("dataSrcset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSrcset: Self = this.set("dataSrcset", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOffsetLeft(value: String | Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetLeft: Self = this.set("offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: String): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetTop: Self = this.set("offsetTop", js.undefined)
    
    @scala.inline
    def setSizes(value: String | Boolean): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setTarget(value: String | Boolean): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
