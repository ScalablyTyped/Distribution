package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwitterTimelineWidgetUrlDataSource extends _TwitterTimelineWidgetDataSource {
  
  var sourceType: url = js.native
  
  var url: String = js.native
}
object TwitterTimelineWidgetUrlDataSource {
  
  @scala.inline
  def apply(sourceType: url, url: String): TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetUrlDataSource]
  }
  
  @scala.inline
  implicit class TwitterTimelineWidgetUrlDataSourceMutableBuilder[Self <: TwitterTimelineWidgetUrlDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceType(value: url): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
