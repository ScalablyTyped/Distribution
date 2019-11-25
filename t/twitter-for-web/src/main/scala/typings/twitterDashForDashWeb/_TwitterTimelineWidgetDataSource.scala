package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.collection
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.likes
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.list
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.profile
import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TwitterTimelineWidgetDataSource extends js.Object

object _TwitterTimelineWidgetDataSource {
  @scala.inline
  def Anon_Id(id: String, sourceType: list): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def Anon_Likes(screenName: String, sourceType: likes): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def Anon_LikesSourceType(sourceType: likes, userId: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def Anon_List(ownerScreenName: String, slug: String, sourceType: list): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def Anon_ProfileSourceType(sourceType: profile, userId: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def TwitterTimelineWidgetUrlDataSource(sourceType: url, url: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def Anon_Profile(screenName: String, sourceType: profile): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def TwitterTimelineWidgetCollectionDataSource(id: String, sourceType: collection): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
}

