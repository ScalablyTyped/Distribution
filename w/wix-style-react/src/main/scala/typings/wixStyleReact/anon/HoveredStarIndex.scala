package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoveredStarIndex extends StObject {
  
  var hoveredStarIndex: Double
  
  var starsRatingBarSize: Any
}
object HoveredStarIndex {
  
  inline def apply(hoveredStarIndex: Double, starsRatingBarSize: Any): HoveredStarIndex = {
    val __obj = js.Dynamic.literal(hoveredStarIndex = hoveredStarIndex.asInstanceOf[js.Any], starsRatingBarSize = starsRatingBarSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoveredStarIndex]
  }
  
  extension [Self <: HoveredStarIndex](x: Self) {
    
    inline def setHoveredStarIndex(value: Double): Self = StObject.set(x, "hoveredStarIndex", value.asInstanceOf[js.Any])
    
    inline def setStarsRatingBarSize(value: Any): Self = StObject.set(x, "starsRatingBarSize", value.asInstanceOf[js.Any])
  }
}
