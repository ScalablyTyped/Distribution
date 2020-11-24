package typings.timelinejs3.TL

import typings.timelinejs3.timelinejs3Strings.cosmological
import typings.timelinejs3.timelinejs3Strings.human
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimelineConfig extends js.Object {
  
  var eras: js.UndefOr[js.Array[ITimelineEra]] = js.native
  
  var events: js.Array[ITimelineSlideData] = js.native
  
  /*
    * Either human or cosmological. If no scale is specified, the default is human. The cosmological scale is
    * required to handle dates in the very distant past or future. (Before Tuesday, April 20th, 271,821 BCE
    * after Saturday, September 13 275,760 CE) For the cosmological scale, only the year is considered, but it's
    * OK to have a cosmological timeline with years between 271,821 BCE and 275,760 CE.
    */
  var scale: js.UndefOr[human | cosmological] = js.native
  
  var title: js.UndefOr[ITimelineSlideData] = js.native
}
object ITimelineConfig {
  
  @scala.inline
  def apply(events: js.Array[ITimelineSlideData]): ITimelineConfig = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineConfig]
  }
  
  @scala.inline
  implicit class ITimelineConfigOps[Self <: ITimelineConfig] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: ITimelineSlideData*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[ITimelineSlideData]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErasVarargs(value: ITimelineEra*): Self = this.set("eras", js.Array(value :_*))
    
    @scala.inline
    def setEras(value: js.Array[ITimelineEra]): Self = this.set("eras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEras: Self = this.set("eras", js.undefined)
    
    @scala.inline
    def setScale(value: human | cosmological): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setTitle(value: ITimelineSlideData): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
