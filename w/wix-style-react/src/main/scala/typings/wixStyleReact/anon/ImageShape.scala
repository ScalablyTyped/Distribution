package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageShape extends StObject {
  
  var height: String
  
  var imageShape: String
  
  var imageSize: String
  
  var itemsPerPage: Double
  
  var maxHeight: String
  
  var searchPlaceholder: String
  
  var withSearch: Boolean
}
object ImageShape {
  
  inline def apply(
    height: String,
    imageShape: String,
    imageSize: String,
    itemsPerPage: Double,
    maxHeight: String,
    searchPlaceholder: String,
    withSearch: Boolean
  ): ImageShape = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], imageShape = imageShape.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], withSearch = withSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageShape]
  }
  
  extension [Self <: ImageShape](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageShape(value: String): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
    
    inline def setImageSize(value: String): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setWithSearch(value: Boolean): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
  }
}
