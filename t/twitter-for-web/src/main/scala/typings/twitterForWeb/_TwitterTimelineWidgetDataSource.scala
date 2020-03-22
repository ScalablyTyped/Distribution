package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.collection
import typings.twitterForWeb.twitterForWebStrings.likes
import typings.twitterForWeb.twitterForWebStrings.list
import typings.twitterForWeb.twitterForWebStrings.profile
import typings.twitterForWeb.twitterForWebStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _TwitterTimelineWidgetDataSource extends js.Object

object _TwitterTimelineWidgetDataSource {
  @scala.inline
  def AnonId(id: String, sourceType: list): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def TwitterTimelineWidgetCollectionDataSource(id: String, sourceType: collection): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def AnonScreenName(screenName: String, sourceType: profile): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def AnonOwnerScreenName(ownerScreenName: String, slug: String, sourceType: list): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def AnonSourceType(sourceType: profile, userId: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def AnonScreenNameSourceType(screenName: String, sourceType: likes): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def TwitterTimelineWidgetUrlDataSource(sourceType: url, url: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
  @scala.inline
  def AnonUserId(sourceType: likes, userId: String): _TwitterTimelineWidgetDataSource = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_TwitterTimelineWidgetDataSource]
  }
}

