package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TwitterTimelineWidgetCollectionDataSource extends _TwitterTimelineWidgetDataSource {
  
  var id: String = js.native
  
  var sourceType: collection = js.native
}
object TwitterTimelineWidgetCollectionDataSource {
  
  @scala.inline
  def apply(id: String, sourceType: collection): TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTimelineWidgetCollectionDataSource]
  }
  
  @scala.inline
  implicit class TwitterTimelineWidgetCollectionDataSourceMutableBuilder[Self <: TwitterTimelineWidgetCollectionDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: collection): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
  }
}
