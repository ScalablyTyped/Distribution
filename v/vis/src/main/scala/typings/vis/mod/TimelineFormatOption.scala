package typings.vis.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFormatOption extends js.Object {
  
  var majorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.native
  
  var minorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.native
}
object TimelineFormatOption {
  
  @scala.inline
  def apply(): TimelineFormatOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineFormatOption]
  }
  
  @scala.inline
  implicit class TimelineFormatOptionOps[Self <: TimelineFormatOption] (val x: Self) extends AnyVal {
    
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
    def setMajorLabelsFunction3(value: (/* date */ Date, /* scale */ String, /* step */ Double) => String): Self = this.set("majorLabels", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMajorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = this.set("majorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorLabels: Self = this.set("majorLabels", js.undefined)
    
    @scala.inline
    def setMinorLabelsFunction3(value: (/* date */ Date, /* scale */ String, /* step */ Double) => String): Self = this.set("minorLabels", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMinorLabels(value: TimelineFormatLabelsOption | TimelineFormatLabelsFunction): Self = this.set("minorLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorLabels: Self = this.set("minorLabels", js.undefined)
  }
}
