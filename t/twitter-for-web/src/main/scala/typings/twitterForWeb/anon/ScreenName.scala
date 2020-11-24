package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetProfileDataSource
import typings.twitterForWeb.twitterForWebStrings.profile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenName extends TwitterTimelineWidgetProfileDataSource {
  
  var screenName: String = js.native
  
  var sourceType: profile = js.native
}
object ScreenName {
  
  @scala.inline
  def apply(screenName: String, sourceType: profile): ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenName]
  }
  
  @scala.inline
  implicit class ScreenNameOps[Self <: ScreenName] (val x: Self) extends AnyVal {
    
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
    def setSourceType(value: profile): Self = this.set("sourceType", value.asInstanceOf[js.Any])
  }
}
