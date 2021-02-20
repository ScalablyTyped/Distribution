package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.twitterForWeb.anon.ScreenName
  - typings.twitterForWeb.anon.SourceType
*/
trait TwitterTimelineWidgetProfileDataSource extends _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetProfileDataSource {
  
  @scala.inline
  def ScreenName(screenName: String, sourceType: profile): typings.twitterForWeb.anon.ScreenName = {
    val __obj = js.Dynamic.literal(screenName = screenName.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.ScreenName]
  }
  
  @scala.inline
  def SourceType(sourceType: profile, userId: String): typings.twitterForWeb.anon.SourceType = {
    val __obj = js.Dynamic.literal(sourceType = sourceType.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.SourceType]
  }
}
