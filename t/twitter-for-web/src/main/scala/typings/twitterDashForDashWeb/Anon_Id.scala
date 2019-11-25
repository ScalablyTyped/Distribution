package typings.twitterDashForDashWeb

import typings.twitterDashForDashWeb.twitterDashForDashWebStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends TwitterTimelineWidgetListDataSource {
  var id: String
  var sourceType: list
}

object Anon_Id {
  @scala.inline
  def apply(id: String, sourceType: list): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

