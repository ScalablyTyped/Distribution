package typings.timelinejs.knightlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeLine extends js.Object {
  
  var asset: js.UndefOr[ITimeLineAsset] = js.native
  
  var date: js.UndefOr[js.Array[ITimelineDate]] = js.native
  
  var era: js.UndefOr[js.Array[ITimelineEra]] = js.native
  
  var headline: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ITimeLine {
  
  @scala.inline
  def apply(): ITimeLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeLine]
  }
  
  @scala.inline
  implicit class ITimeLineOps[Self <: ITimeLine] (val x: Self) extends AnyVal {
    
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
    def setDateVarargs(value: ITimelineDate*): Self = this.set("date", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: js.Array[ITimelineDate]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setEraVarargs(value: ITimelineEra*): Self = this.set("era", js.Array(value :_*))
    
    @scala.inline
    def setEra(value: js.Array[ITimelineEra]): Self = this.set("era", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEra: Self = this.set("era", js.undefined)
    
    @scala.inline
    def setHeadline(value: String): Self = this.set("headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
