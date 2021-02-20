package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.twitterForWeb.anon.OwnerScreenName
  - typings.twitterForWeb.anon.Id
*/
trait TwitterTimelineWidgetListDataSource extends _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetListDataSource {
  
  @scala.inline
  def Id(id: String, sourceType: list): typings.twitterForWeb.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.Id]
  }
  
  @scala.inline
  def OwnerScreenName(ownerScreenName: String, slug: String, sourceType: list): typings.twitterForWeb.anon.OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.twitterForWeb.anon.OwnerScreenName]
  }
}
