package typings.twitterForWeb

import typings.twitterForWeb.twitterForWebStrings.collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwitterTimelineWidgetCollectionDataSource
  extends StObject
     with _TwitterTimelineWidgetDataSource {
  
  var id: String
  
  var sourceType: collection
}
object TwitterTimelineWidgetCollectionDataSource {
  
  @scala.inline
  def apply(id: String): TwitterTimelineWidgetCollectionDataSource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sourceType = "collection")
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
