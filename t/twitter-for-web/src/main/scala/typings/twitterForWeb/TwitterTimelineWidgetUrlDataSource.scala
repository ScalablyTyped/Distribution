package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwitterTimelineWidgetUrlDataSource
  extends StObject
     with _TwitterTimelineWidgetDataSource {
  
  var sourceType: url
  
  var url: String
}
object TwitterTimelineWidgetUrlDataSource {
  
  @scala.inline
  def apply(url: String): TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = "url", url = url.asInstanceOf[js.Any])
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
