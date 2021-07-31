package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TwitterTimelineWidgetDataSource extends StObject
object _TwitterTimelineWidgetDataSource {
  
  @scala.inline
  def Id(id: String): typings.twitterForWeb.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typings.twitterForWeb.anon.Id]
  }
  
  @scala.inline
  def OwnerScreenName(ownerScreenName: String, slug: String): typings.twitterForWeb.anon.OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typings.twitterForWeb.anon.OwnerScreenName]
  }
  
  @scala.inline
  def ScreenName(screenName: String): typings.twitterForWeb.anon.ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "profile")
    __obj.asInstanceOf[typings.twitterForWeb.anon.ScreenName]
  }
  
  @scala.inline
  def ScreenNameSourceType(screenName: String): typings.twitterForWeb.anon.ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "likes")
    __obj.asInstanceOf[typings.twitterForWeb.anon.ScreenNameSourceType]
  }
  
  @scala.inline
  def SourceType(userId: String): typings.twitterForWeb.anon.SourceType = {
    val __obj = js.Dynamic.literal(sourceType = "profile", userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.SourceType]
  }
  
  @scala.inline
  def TwitterTimelineWidgetCollectionDataSource(id: String): typings.twitterForWeb.TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "collection")
    __obj.asInstanceOf[typings.twitterForWeb.TwitterTimelineWidgetCollectionDataSource]
  }
  
  @scala.inline
  def TwitterTimelineWidgetUrlDataSource(url: String): typings.twitterForWeb.TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = "url", url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.TwitterTimelineWidgetUrlDataSource]
  }
  
  @scala.inline
  def UserId(userId: String): typings.twitterForWeb.anon.UserId = {
    val __obj = js.Dynamic.literal(sourceType = "likes", userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.UserId]
  }
}
