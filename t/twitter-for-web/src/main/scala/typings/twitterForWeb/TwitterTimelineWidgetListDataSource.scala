package typings.twitterForWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.twitterForWeb.anon.OwnerScreenName
  - typings.twitterForWeb.anon.Id
*/
trait TwitterTimelineWidgetListDataSource
  extends StObject
     with _TwitterTimelineWidgetDataSource
object TwitterTimelineWidgetListDataSource {
  
  @scala.inline
  def Id(id: String): typings.twitterForWeb.anon.Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typings.twitterForWeb.anon.Id]
  }
  
  @scala.inline
  def OwnerScreenName(ownerScreenName: String, slug: String): typings.twitterForWeb.anon.OwnerScreenName = {
    val __obj = js.Dynamic.literal(ownerScreenName = ownerScreenName.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sourceType = "list")
    __obj.asInstanceOf[typings.twitterForWeb.anon.OwnerScreenName]
  }
}
