package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveLayout extends StObject {
  
  var responsiveLayout: Null
}
object ResponsiveLayout {
  
  inline def apply(responsiveLayout: Null): ResponsiveLayout = {
    val __obj = js.Dynamic.literal(responsiveLayout = responsiveLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveLayout]
  }
  
  extension [Self <: ResponsiveLayout](x: Self) {
    
    inline def setResponsiveLayout(value: Null): Self = StObject.set(x, "responsiveLayout", value.asInstanceOf[js.Any])
  }
}
