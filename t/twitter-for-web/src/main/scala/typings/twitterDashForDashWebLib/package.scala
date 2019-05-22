package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object twitterDashForDashWebLib {
  /**
    * Base type for TwitterTimelineWidgetOptions. TwitterTimelineWidgetOptions can
    * use all options of tweet widgets and button widgets
    */
  type TwitterTimelineWidgetBaseOptions = TwitterTweetWidgetOptions with TwitterButtonWidgetOptions
  /* Rewritten from type alias, can be one of: 
    - TwitterTimelineWidgetProfileDataSource
    - TwitterTimelineWidgetLikesDataSource
    - TwitterTimelineWidgetListDataSource
    - TwitterTimelineWidgetCollectionDataSource
    - TwitterTimelineWidgetUrlDataSource
    - java.lang.String
  */
  type TwitterTimelineWidgetDataSource = _TwitterTimelineWidgetDataSource | java.lang.String
  /**
    * The interface for additional options for embedded Timelines.
    */
  type TwitterTimelineWidgetOptions = TwitterTimelineWidgetBaseOptions with Anon_AriaPolite
}
