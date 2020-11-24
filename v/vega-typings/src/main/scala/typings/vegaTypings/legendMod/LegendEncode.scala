package typings.vegaTypings.legendMod

import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.encodeMod.RectEncodeEntry
import typings.vegaTypings.encodeMod.SymbolEncodeEntry
import typings.vegaTypings.encodeMod.TextEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendEncode extends js.Object {
  
  var entries: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  
  var gradient: js.UndefOr[GuideEncodeEntry[RectEncodeEntry]] = js.native
  
  var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
  
  var legend: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  
  var symbols: js.UndefOr[GuideEncodeEntry[SymbolEncodeEntry]] = js.native
  
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
}
object LegendEncode {
  
  @scala.inline
  def apply(): LegendEncode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendEncode]
  }
  
  @scala.inline
  implicit class LegendEncodeOps[Self <: LegendEncode] (val x: Self) extends AnyVal {
    
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
    def setEntries(value: GuideEncodeEntry[GroupEncodeEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setGradient(value: GuideEncodeEntry[RectEncodeEntry]): Self = this.set("gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradient: Self = this.set("gradient", js.undefined)
    
    @scala.inline
    def setLabels(value: GuideEncodeEntry[TextEncodeEntry]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLegend(value: GuideEncodeEntry[GroupEncodeEntry]): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setSymbols(value: GuideEncodeEntry[SymbolEncodeEntry]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
    
    @scala.inline
    def setTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
