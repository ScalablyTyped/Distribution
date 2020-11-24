package typings.vegaTypings.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendLayout extends BaseLegendLayout {
  
  var bottom: js.UndefOr[BaseLegendLayout] = js.native
  
  var `bottom-left`: js.UndefOr[BaseLegendLayout] = js.native
  
  var `bottom-right`: js.UndefOr[BaseLegendLayout] = js.native
  
  var left: js.UndefOr[BaseLegendLayout] = js.native
  
  var right: js.UndefOr[BaseLegendLayout] = js.native
  
  var top: js.UndefOr[BaseLegendLayout] = js.native
  
  var `top-left`: js.UndefOr[BaseLegendLayout] = js.native
  
  var `top-right`: js.UndefOr[BaseLegendLayout] = js.native
}
object LegendLayout {
  
  @scala.inline
  def apply(): LegendLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendLayout]
  }
  
  @scala.inline
  implicit class LegendLayoutOps[Self <: LegendLayout] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: BaseLegendLayout): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def `setBottom-left`(value: BaseLegendLayout): Self = this.set("bottom-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBottom-left`: Self = this.set("bottom-left", js.undefined)
    
    @scala.inline
    def `setBottom-right`(value: BaseLegendLayout): Self = this.set("bottom-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBottom-right`: Self = this.set("bottom-right", js.undefined)
    
    @scala.inline
    def setLeft(value: BaseLegendLayout): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setRight(value: BaseLegendLayout): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setTop(value: BaseLegendLayout): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def `setTop-left`(value: BaseLegendLayout): Self = this.set("top-left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTop-left`: Self = this.set("top-left", js.undefined)
    
    @scala.inline
    def `setTop-right`(value: BaseLegendLayout): Self = this.set("top-right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteTop-right`: Self = this.set("top-right", js.undefined)
  }
}
