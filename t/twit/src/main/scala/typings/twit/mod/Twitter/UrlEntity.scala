package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlEntity extends StObject {
  
  var display_url: String
  
  var expanded_url: String
  
  var indices: js.Tuple2[Double, Double]
  
  var url: String
}
object UrlEntity {
  
  @scala.inline
  def apply(display_url: String, expanded_url: String, indices: js.Tuple2[Double, Double], url: String): UrlEntity = {
    val __obj = js.Dynamic.literal(display_url = display_url.asInstanceOf[js.Any], expanded_url = expanded_url.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlEntity]
  }
  
  @scala.inline
  implicit class UrlEntityMutableBuilder[Self <: UrlEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded_url(value: String): Self = StObject.set(x, "expanded_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
