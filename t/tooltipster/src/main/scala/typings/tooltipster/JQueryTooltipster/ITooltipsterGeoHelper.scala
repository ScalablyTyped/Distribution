package typings.tooltipster.JQueryTooltipster

import typings.tooltipster.anon.FixedLineage
import typings.tooltipster.anon.Scroll
import typings.tooltipster.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipsterGeoHelper extends js.Object {
  
  var document: Size = js.native
  
  var origin: FixedLineage = js.native
  
  var window: Scroll = js.native
}
object ITooltipsterGeoHelper {
  
  @scala.inline
  def apply(document: Size, origin: FixedLineage, window: Scroll): ITooltipsterGeoHelper = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipsterGeoHelper]
  }
  
  @scala.inline
  implicit class ITooltipsterGeoHelperOps[Self <: ITooltipsterGeoHelper] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: Size): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: FixedLineage): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Scroll): Self = this.set("window", value.asInstanceOf[js.Any])
  }
}
