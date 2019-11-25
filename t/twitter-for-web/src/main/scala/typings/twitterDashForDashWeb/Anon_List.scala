package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_List extends TwitterTimelineWidgetListDataSource {
  var ownerScreenName: String
  var slug: String
  var sourceType: list
}

object Anon_List {
  @scala.inline
  def apply(ownerScreenName: String, slug: String, sourceType: list): Anon_List = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_List]
  }
}

