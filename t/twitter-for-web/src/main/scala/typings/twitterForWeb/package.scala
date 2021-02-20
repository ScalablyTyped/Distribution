package typings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object twitterForWeb {
  
  /**
    * Base type for TwitterTimelineWidgetOptions. TwitterTimelineWidgetOptions can
    * use all options of tweet widgets and button widgets
    */
  type TwitterTimelineWidgetBaseOptions = typings.twitterForWeb.TwitterTweetWidgetOptions with typings.twitterForWeb.TwitterButtonWidgetOptions
  
  /* Rewritten from type alias, can be one of: 
    - typings.twitterForWeb.TwitterTimelineWidgetProfileDataSource
    - typings.twitterForWeb.TwitterTimelineWidgetLikesDataSource
    - typings.twitterForWeb.TwitterTimelineWidgetListDataSource
    - typings.twitterForWeb.TwitterTimelineWidgetCollectionDataSource
    - typings.twitterForWeb.TwitterTimelineWidgetUrlDataSource
    - java.lang.String
  */
  type TwitterTimelineWidgetDataSource = typings.twitterForWeb._TwitterTimelineWidgetDataSource | java.lang.String
}
