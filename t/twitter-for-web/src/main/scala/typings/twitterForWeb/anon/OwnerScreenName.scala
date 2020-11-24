package typings.twitterForWeb.anon

import typings.twitterForWeb.TwitterTimelineWidgetListDataSource
import typings.twitterForWeb.twitterForWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnerScreenName extends TwitterTimelineWidgetListDataSource {
  
  var ownerScreenName: String = js.native
  
  var slug: String = js.native
  
  var sourceType: list = js.native
}
object OwnerScreenName {
  
  @scala.inline
  def apply(ownerScreenName: String, slug: String, sourceType: list): OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnerScreenName]
  }
  
  @scala.inline
  implicit class OwnerScreenNameOps[Self <: OwnerScreenName] (val x: Self) extends AnyVal {
    
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
    def setOwnerScreenName(value: String): Self = this.set("ownerScreenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: list): Self = this.set("sourceType", value.asInstanceOf[js.Any])
  }
}
