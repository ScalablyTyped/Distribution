package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.collection
import typings.twitterForWeb.twitterForWebStrings.likes
import typings.twitterForWeb.twitterForWebStrings.list
import typings.twitterForWeb.twitterForWebStrings.profile
import typings.twitterForWeb.twitterForWebStrings.url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TwitterTimelineWidgetDataSource extends StObject
object _TwitterTimelineWidgetDataSource {
  
  @scala.inline
  def Id(id: String, sourceType: list): typings.twitterForWeb.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.Id]
  }
  
  @scala.inline
  def OwnerScreenName(ownerScreenName: String, slug: String, sourceType: list): typings.twitterForWeb.anon.OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.OwnerScreenName]
  }
  
  @scala.inline
  def ScreenName(screenName: String, sourceType: profile): typings.twitterForWeb.anon.ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.ScreenName]
  }
  
  @scala.inline
  def ScreenNameSourceType(screenName: String, sourceType: likes): typings.twitterForWeb.anon.ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.ScreenNameSourceType]
  }
  
  @scala.inline
  def SourceType(sourceType: profile, userId: String): typings.twitterForWeb.anon.SourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.SourceType]
  }
  
  @scala.inline
  def TwitterTimelineWidgetCollectionDataSource(id: String, sourceType: collection): typings.twitterForWeb.TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.TwitterTimelineWidgetCollectionDataSource]
  }
  
  @scala.inline
  def TwitterTimelineWidgetUrlDataSource(sourceType: url, url: String): typings.twitterForWeb.TwitterTimelineWidgetUrlDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.TwitterTimelineWidgetUrlDataSource]
  }
  
  @scala.inline
  def UserId(sourceType: likes, userId: String): typings.twitterForWeb.anon.UserId = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.UserId]
  }
}
