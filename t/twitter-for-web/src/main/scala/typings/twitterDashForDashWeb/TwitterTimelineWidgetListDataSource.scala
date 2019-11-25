package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twitterDashForDashWeb.Anon_List
  - typings.twitterDashForDashWeb.Anon_Id
*/
trait TwitterTimelineWidgetListDataSource extends _TwitterTimelineWidgetDataSource

object TwitterTimelineWidgetListDataSource {
  @scala.inline
  def Anon_List(ownerScreenName: String, slug: String, sourceType: list): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
  @scala.inline
  def Anon_Id(id: String, sourceType: list): TwitterTimelineWidgetListDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterTimelineWidgetListDataSource]
  }
}

