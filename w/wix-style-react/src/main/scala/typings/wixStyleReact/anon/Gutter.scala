package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gutter extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var gutter: Any
  
  var image: Any
  
  var imageFit: Any
  
  var imagePosition: Any
  
  var width: Any
}
object Gutter {
  
  inline def apply(
    children: Any,
    className: Any,
    dataHook: Any,
    gutter: Any,
    image: Any,
    imageFit: Any,
    imagePosition: Any,
    width: Any
  ): Gutter = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageFit = imageFit.asInstanceOf[js.Any], imagePosition = imagePosition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gutter]
  }
  
  extension [Self <: Gutter](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setGutter(value: Any): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageFit(value: Any): Self = StObject.set(x, "imageFit", value.asInstanceOf[js.Any])
    
    inline def setImagePosition(value: Any): Self = StObject.set(x, "imagePosition", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
