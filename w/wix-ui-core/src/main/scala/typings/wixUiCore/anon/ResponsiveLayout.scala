package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveLayout extends StObject {
  
  var responsiveLayout: js.Any
}
object ResponsiveLayout {
  
  inline def apply(responsiveLayout: js.Any): ResponsiveLayout = {
    val __obj = js.Dynamic.literal(responsiveLayout = responsiveLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveLayout]
  }
  
  extension [Self <: ResponsiveLayout](x: Self) {
    
    inline def setResponsiveLayout(value: js.Any): Self = StObject.set(x, "responsiveLayout", value.asInstanceOf[js.Any])
  }
}
