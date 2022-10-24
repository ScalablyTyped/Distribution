package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterHeight extends StObject {
  
  var footerHeight: Double
  
  var headerContainerHeight: Double
  
  var headerWrapperHeight: Double
  
  var minimized: Boolean
  
  var tailHeight: Double
}
object FooterHeight {
  
  inline def apply(
    footerHeight: Double,
    headerContainerHeight: Double,
    headerWrapperHeight: Double,
    minimized: Boolean,
    tailHeight: Double
  ): FooterHeight = {
    val __obj = js.Dynamic.literal(footerHeight = footerHeight.asInstanceOf[js.Any], headerContainerHeight = headerContainerHeight.asInstanceOf[js.Any], headerWrapperHeight = headerWrapperHeight.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], tailHeight = tailHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterHeight]
  }
  
  extension [Self <: FooterHeight](x: Self) {
    
    inline def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderContainerHeight(value: Double): Self = StObject.set(x, "headerContainerHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderWrapperHeight(value: Double): Self = StObject.set(x, "headerWrapperHeight", value.asInstanceOf[js.Any])
    
    inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
    
    inline def setTailHeight(value: Double): Self = StObject.set(x, "tailHeight", value.asInstanceOf[js.Any])
  }
}
