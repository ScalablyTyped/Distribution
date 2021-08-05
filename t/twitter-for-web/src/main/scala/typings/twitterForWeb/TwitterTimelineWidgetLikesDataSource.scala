package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.twitterForWeb.anon.ScreenNameSourceType
  - typings.twitterForWeb.anon.UserId
*/
trait TwitterTimelineWidgetLikesDataSource
  extends StObject
     with _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetLikesDataSource {
  
  inline def ScreenNameSourceType(screenName: String): typings.twitterForWeb.anon.ScreenNameSourceType = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "likes")
    __obj.asInstanceOf[typings.twitterForWeb.anon.ScreenNameSourceType]
  }
  
  inline def UserId(userId: String): typings.twitterForWeb.anon.UserId = {
    val __obj = js.Dynamic.literal(sourceType = "likes", userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.UserId]
  }
}
