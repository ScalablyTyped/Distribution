package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.twitterForWeb.anon.ScreenName
  - typings.twitterForWeb.anon.SourceType
*/
trait TwitterTimelineWidgetProfileDataSource
  extends StObject
     with _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetProfileDataSource {
  
  inline def ScreenName(screenName: String): typings.twitterForWeb.anon.ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = "profile")
    __obj.asInstanceOf[typings.twitterForWeb.anon.ScreenName]
  }
  
  inline def SourceType(userId: String): typings.twitterForWeb.anon.SourceType = {
    val __obj = js.Dynamic.literal(sourceType = "profile", userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.SourceType]
  }
}
