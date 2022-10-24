package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoveredLabel extends StObject {
  
  var hoveredLabel: Null
}
object HoveredLabel {
  
  inline def apply(hoveredLabel: Null): HoveredLabel = {
    val __obj = js.Dynamic.literal(hoveredLabel = hoveredLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoveredLabel]
  }
  
  extension [Self <: HoveredLabel](x: Self) {
    
    inline def setHoveredLabel(value: Null): Self = StObject.set(x, "hoveredLabel", value.asInstanceOf[js.Any])
  }
}
