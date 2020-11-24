package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitGridOptions extends js.Object {
  
  var `first-column`: js.UndefOr[String] = js.native
  
  var margin: js.UndefOr[String] = js.native
  
  var masonry: js.UndefOr[Boolean] = js.native
  
  var parallax: js.UndefOr[Double] = js.native
}
object UIkitGridOptions {
  
  @scala.inline
  def apply(): UIkitGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitGridOptions]
  }
  
  @scala.inline
  implicit class UIkitGridOptionsOps[Self <: UIkitGridOptions] (val x: Self) extends AnyVal {
    
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
    def `setFirst-column`(value: String): Self = this.set("first-column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFirst-column`: Self = this.set("first-column", js.undefined)
    
    @scala.inline
    def setMargin(value: String): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMasonry(value: Boolean): Self = this.set("masonry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasonry: Self = this.set("masonry", js.undefined)
    
    @scala.inline
    def setParallax(value: Double): Self = this.set("parallax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallax: Self = this.set("parallax", js.undefined)
  }
}
