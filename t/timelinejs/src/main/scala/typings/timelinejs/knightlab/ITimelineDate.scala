package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimelineDate extends ITimelineEra {
  
  var asset: js.UndefOr[ITimeLineAsset] = js.native
  
  var classname: js.UndefOr[String] = js.native
}
object ITimelineDate {
  
  @scala.inline
  def apply(endDate: String, headline: String, startDate: String, text: String): ITimelineDate = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineDate]
  }
  
  @scala.inline
  implicit class ITimelineDateOps[Self <: ITimelineDate] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: ITimeLineAsset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setClassname(value: String): Self = this.set("classname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassname: Self = this.set("classname", js.undefined)
  }
}
