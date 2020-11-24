package typings.vegaTypings.axisMod

import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.encodeMod.RuleEncodeEntry
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.legendMod.GuideEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisEncode extends js.Object {
  
  /**
    * Custom encoding for the axis container.
    */
  var axis: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  
  /**
    * Custom encoding for the axis domain rule mark.
    */
  var domain: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.native
  
  /**
    * Custom encoding for axis gridline rule marks.
    */
  var grid: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.native
  
  /**
    * Custom encoding for axis label text marks.
    */
  var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
  
  /**
    * Custom encoding for axis tick rule marks.
    */
  var ticks: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  
  /**
    * Custom encoding for the axis title text mark.
    */
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
}
object AxisEncode {
  
  @scala.inline
  def apply(): AxisEncode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisEncode]
  }
  
  @scala.inline
  implicit class AxisEncodeOps[Self <: AxisEncode] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: GuideEncodeEntry[GroupEncodeEntry]): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setDomain(value: GuideEncodeEntry[RuleEncodeEntry]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setGrid(value: GuideEncodeEntry[RuleEncodeEntry]): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setLabels(value: GuideEncodeEntry[TextEncodeEntry]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setTicks(value: GuideEncodeEntry[GroupEncodeEntry]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
