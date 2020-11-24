package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBarParams extends TrafficParams {
  
  // Progress Bar
  var legend: js.UndefOr[String | `true` | ValueStringCallback] = js.native
  
  var legendAlign: js.UndefOr[Align] = js.native
  
  var legendColor: js.UndefOr[Color] = js.native
}
object ProgressBarParams {
  
  @scala.inline
  def apply(): ProgressBarParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarParams]
  }
  
  @scala.inline
  implicit class ProgressBarParamsOps[Self <: ProgressBarParams] (val x: Self) extends AnyVal {
    
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
    def setLegendFunction1(value: /* value */ js.Any => String): Self = this.set("legend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegend(value: String | `true` | ValueStringCallback): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLegendAlign(value: Align): Self = this.set("legendAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendAlign: Self = this.set("legendAlign", js.undefined)
    
    @scala.inline
    def setLegendColorVarargs(value: js.Any*): Self = this.set("legendColor", js.Array(value :_*))
    
    @scala.inline
    def setLegendColorFunction1(value: /* value */ js.Any => String): Self = this.set("legendColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLegendColor(value: Color): Self = this.set("legendColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendColor: Self = this.set("legendColor", js.undefined)
  }
}
