package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetLikesDataSource
import typings.twitterForWeb.twitterForWebStrings.likes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenNameSourceType extends TwitterTimelineWidgetLikesDataSource {
  
  var screenName: String = js.native
  
  var sourceType: likes = js.native
}
object ScreenNameSourceType {
  
  @scala.inline
  def apply(screenName: String, sourceType: likes): ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenNameSourceType]
  }
  
  @scala.inline
  implicit class ScreenNameSourceTypeOps[Self <: ScreenNameSourceType] (val x: Self) extends AnyVal {
    
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
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: likes): Self = this.set("sourceType", value.asInstanceOf[js.Any])
  }
}
