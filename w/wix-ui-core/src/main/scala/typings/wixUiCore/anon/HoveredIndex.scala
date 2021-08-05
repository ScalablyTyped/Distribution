package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoveredIndex extends StObject {
  
  var hoveredIndex: Double
}
object HoveredIndex {
  
  inline def apply(hoveredIndex: Double): HoveredIndex = {
    val __obj = js.Dynamic.literal(hoveredIndex = hoveredIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoveredIndex]
  }
  
  extension [Self <: HoveredIndex](x: Self) {
    
    inline def setHoveredIndex(value: Double): Self = StObject.set(x, "hoveredIndex", value.asInstanceOf[js.Any])
  }
}
