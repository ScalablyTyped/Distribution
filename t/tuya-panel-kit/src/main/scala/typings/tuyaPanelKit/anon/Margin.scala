package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Margin extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var onThumbTintColor: js.UndefOr[String] = js.undefined
  
  var onTintColor: js.UndefOr[String] = js.undefined
  
  var thumbSize: js.UndefOr[Double] = js.undefined
  
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  var tintColor: js.UndefOr[String | StringDictionary[String]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Margin {
  
  inline def apply(): Margin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margin]
  }
  
  extension [Self <: Margin](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMargin(value: Double | js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    inline def setOnThumbTintColor(value: String): Self = StObject.set(x, "onThumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnThumbTintColorUndefined: Self = StObject.set(x, "onThumbTintColor", js.undefined)
    
    inline def setOnTintColor(value: String): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnTintColorUndefined: Self = StObject.set(x, "onTintColor", js.undefined)
    
    inline def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    inline def setThumbSizeUndefined: Self = StObject.set(x, "thumbSize", js.undefined)
    
    inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    inline def setTintColor(value: String | StringDictionary[String]): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
