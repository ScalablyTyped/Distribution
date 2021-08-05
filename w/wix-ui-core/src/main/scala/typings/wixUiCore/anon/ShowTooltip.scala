package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowTooltip extends StObject {
  
  var showTooltip: Boolean
}
object ShowTooltip {
  
  inline def apply(showTooltip: Boolean): ShowTooltip = {
    val __obj = js.Dynamic.literal(showTooltip = showTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTooltip]
  }
  
  extension [Self <: ShowTooltip](x: Self) {
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
  }
}
