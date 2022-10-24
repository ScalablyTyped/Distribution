package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionMaxLines extends StObject {
  
  var dataHook: Any
  
  var description: Any
  
  var descriptionMaxLines: Any
  
  var previewUrl: Any
  
  var skin: Any
  
  var title: Any
  
  var titleMaxLines: Any
}
object DescriptionMaxLines {
  
  inline def apply(
    dataHook: Any,
    description: Any,
    descriptionMaxLines: Any,
    previewUrl: Any,
    skin: Any,
    title: Any,
    titleMaxLines: Any
  ): DescriptionMaxLines = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], descriptionMaxLines = descriptionMaxLines.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleMaxLines = titleMaxLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionMaxLines]
  }
  
  extension [Self <: DescriptionMaxLines](x: Self) {
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Any): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionMaxLines(value: Any): Self = StObject.set(x, "descriptionMaxLines", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrl(value: Any): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Any): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleMaxLines(value: Any): Self = StObject.set(x, "titleMaxLines", value.asInstanceOf[js.Any])
  }
}
