package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaEntity extends StObject {
  
  var display_url: String
  
  var expanded_url: String
  
  var id: Double
  
  var id_str: String
  
  var indices: js.Tuple2[Double, Double]
  
  var media_url: String
  
  var media_url_https: String
  
  var sizes: Sizes
  
  var source_status_id: Double
  
  var source_status_id_str: String
  
  var `type`: String
  
  var url: String
}
object MediaEntity {
  
  @scala.inline
  def apply(
    display_url: String,
    expanded_url: String,
    id: Double,
    id_str: String,
    indices: js.Tuple2[Double, Double],
    media_url: String,
    media_url_https: String,
    sizes: Sizes,
    source_status_id: Double,
    source_status_id_str: String,
    `type`: String,
    url: String
  ): MediaEntity = {
    val __obj = js.Dynamic.literal(display_url = display_url.asInstanceOf[js.Any], expanded_url = expanded_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], media_url = media_url.asInstanceOf[js.Any], media_url_https = media_url_https.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], source_status_id = source_status_id.asInstanceOf[js.Any], source_status_id_str = source_status_id_str.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEntity]
  }
  
  @scala.inline
  implicit class MediaEntityMutableBuilder[Self <: MediaEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpanded_url(value: String): Self = StObject.set(x, "expanded_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndices(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_url(value: String): Self = StObject.set(x, "media_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_url_https(value: String): Self = StObject.set(x, "media_url_https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizes(value: Sizes): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_status_id(value: Double): Self = StObject.set(x, "source_status_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_status_id_str(value: String): Self = StObject.set(x, "source_status_id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
