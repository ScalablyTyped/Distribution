package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitterDashForDashWeb {
  /**
    * Base type for TwitterTimelineWidgetOptions. TwitterTimelineWidgetOptions can
    * use all options of tweet widgets and button widgets
    */
  type TwitterTimelineWidgetBaseOptions = TwitterTweetWidgetOptions with TwitterButtonWidgetOptions
  /* Rewritten from type alias, can be one of: 
    - typings.twitterDashForDashWeb.TwitterTimelineWidgetProfileDataSource
    - typings.twitterDashForDashWeb.TwitterTimelineWidgetLikesDataSource
    - typings.twitterDashForDashWeb.TwitterTimelineWidgetListDataSource
    - typings.twitterDashForDashWeb.TwitterTimelineWidgetCollectionDataSource
    - typings.twitterDashForDashWeb.TwitterTimelineWidgetUrlDataSource
    - java.lang.String
  */
  type TwitterTimelineWidgetDataSource = _TwitterTimelineWidgetDataSource | String
  /**
    * The interface for additional options for embedded Timelines.
    */
  type TwitterTimelineWidgetOptions = TwitterTimelineWidgetBaseOptions with Anon_AriaPolite
}
