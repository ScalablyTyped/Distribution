package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeselectAllText extends StObject {
  
  var cancelButtonText: String
  
  var deselectAllText: String
  
  var disableConfirmation: Boolean
  
  var height: String
  
  var imageShape: String
  
  var imageSize: String
  
  var itemsPerPage: Double
  
  var maxHeight: String
  
  var okButtonText: String
  
  var searchPlaceholder: String
  
  var selectAllText: String
  
  var title: String
  
  var withSearch: Boolean
}
object DeselectAllText {
  
  inline def apply(
    cancelButtonText: String,
    deselectAllText: String,
    disableConfirmation: Boolean,
    height: String,
    imageShape: String,
    imageSize: String,
    itemsPerPage: Double,
    maxHeight: String,
    okButtonText: String,
    searchPlaceholder: String,
    selectAllText: String,
    title: String,
    withSearch: Boolean
  ): DeselectAllText = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], deselectAllText = deselectAllText.asInstanceOf[js.Any], disableConfirmation = disableConfirmation.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageShape = imageShape.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], okButtonText = okButtonText.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAllText = selectAllText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], withSearch = withSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeselectAllText]
  }
  
  extension [Self <: DeselectAllText](x: Self) {
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    inline def setDisableConfirmation(value: Boolean): Self = StObject.set(x, "disableConfirmation", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageShape(value: String): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
    
    inline def setImageSize(value: String): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWithSearch(value: Boolean): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
  }
}
