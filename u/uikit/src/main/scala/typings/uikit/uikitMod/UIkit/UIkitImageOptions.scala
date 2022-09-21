package typings.uikit.uikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitImageOptions extends StObject {
  
  var dataSrc: js.UndefOr[String] = js.undefined
  
  var dataSrcset: js.UndefOr[String | Boolean] = js.undefined
  
  var height: js.UndefOr[String | Boolean] = js.undefined
  
  var offsetLeft: js.UndefOr[String | Double] = js.undefined
  
  var offsetTop: js.UndefOr[String] = js.undefined
  
  var sizes: js.UndefOr[String | Boolean] = js.undefined
  
  var target: js.UndefOr[String | Boolean] = js.undefined
  
  var width: js.UndefOr[String | Boolean] = js.undefined
}
object UIkitImageOptions {
  
  inline def apply(): UIkitImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitImageOptions]
  }
  
  extension [Self <: UIkitImageOptions](x: Self) {
    
    inline def setDataSrc(value: String): Self = StObject.set(x, "dataSrc", value.asInstanceOf[js.Any])
    
    inline def setDataSrcUndefined: Self = StObject.set(x, "dataSrc", js.undefined)
    
    inline def setDataSrcset(value: String | Boolean): Self = StObject.set(x, "dataSrcset", value.asInstanceOf[js.Any])
    
    inline def setDataSrcsetUndefined: Self = StObject.set(x, "dataSrcset", js.undefined)
    
    inline def setHeight(value: String | Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOffsetLeft(value: String | Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    inline def setOffsetTop(value: String): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    
    inline def setSizes(value: String | Boolean): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setTarget(value: String | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setWidth(value: String | Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
