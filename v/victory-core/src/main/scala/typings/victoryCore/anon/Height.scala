package typings.victoryCore.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var className: Requireable[String]
  
  var height: Requireable[js.UndefOr[Double]]
  
  var style: Requireable[js.Object]
  
  var viewBox: Requireable[String]
  
  var width: Requireable[js.UndefOr[Double]]
}
object Height {
  
  inline def apply(
    className: Requireable[String],
    height: Requireable[js.UndefOr[Double]],
    style: Requireable[js.Object],
    viewBox: Requireable[String],
    width: Requireable[js.UndefOr[Double]]
  ): Height = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setViewBox(value: Requireable[String]): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[js.UndefOr[Double]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
