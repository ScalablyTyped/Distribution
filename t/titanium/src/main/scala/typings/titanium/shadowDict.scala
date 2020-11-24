package typings.titanium

import typings.titanium.Titanium.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary describing the shadow effect for text.
  */
@js.native
trait shadowDict extends js.Object {
  
  /**
    * Specifies the blur radius of the shadow.
    */
  var blurRadius: js.UndefOr[Double] = js.native
  
  /**
    * Color name or hex triplet specifying the color of the shadow.
    */
  var color: js.UndefOr[String | Color] = js.native
  
  /**
    * <Size> with the properties `width` and `height` used as the horizontal
    * and vertical offset of the shadow, respectively.
    */
  var offset: js.UndefOr[Size] = js.native
}
object shadowDict {
  
  @scala.inline
  def apply(): shadowDict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shadowDict]
  }
  
  @scala.inline
  implicit class shadowDictOps[Self <: shadowDict] (val x: Self) extends AnyVal {
    
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
    def setBlurRadius(value: Double): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurRadius: Self = this.set("blurRadius", js.undefined)
    
    @scala.inline
    def setColor(value: String | Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
