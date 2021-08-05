package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionalLength extends StObject {
  
  var directionalLength: Double
  
  var hemiLength: Double
  
  var numDirectionalShadows: Double
  
  var numPointShadows: Double
  
  var numSpotShadows: Double
  
  var pointLength: Double
  
  var rectAreaLength: Double
  
  var spotLength: Double
}
object DirectionalLength {
  
  inline def apply(
    directionalLength: Double,
    hemiLength: Double,
    numDirectionalShadows: Double,
    numPointShadows: Double,
    numSpotShadows: Double,
    pointLength: Double,
    rectAreaLength: Double,
    spotLength: Double
  ): DirectionalLength = {
    val __obj = js.Dynamic.literal(directionalLength = directionalLength.asInstanceOf[js.Any], hemiLength = hemiLength.asInstanceOf[js.Any], numDirectionalShadows = numDirectionalShadows.asInstanceOf[js.Any], numPointShadows = numPointShadows.asInstanceOf[js.Any], numSpotShadows = numSpotShadows.asInstanceOf[js.Any], pointLength = pointLength.asInstanceOf[js.Any], rectAreaLength = rectAreaLength.asInstanceOf[js.Any], spotLength = spotLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalLength]
  }
  
  extension [Self <: DirectionalLength](x: Self) {
    
    inline def setDirectionalLength(value: Double): Self = StObject.set(x, "directionalLength", value.asInstanceOf[js.Any])
    
    inline def setHemiLength(value: Double): Self = StObject.set(x, "hemiLength", value.asInstanceOf[js.Any])
    
    inline def setNumDirectionalShadows(value: Double): Self = StObject.set(x, "numDirectionalShadows", value.asInstanceOf[js.Any])
    
    inline def setNumPointShadows(value: Double): Self = StObject.set(x, "numPointShadows", value.asInstanceOf[js.Any])
    
    inline def setNumSpotShadows(value: Double): Self = StObject.set(x, "numSpotShadows", value.asInstanceOf[js.Any])
    
    inline def setPointLength(value: Double): Self = StObject.set(x, "pointLength", value.asInstanceOf[js.Any])
    
    inline def setRectAreaLength(value: Double): Self = StObject.set(x, "rectAreaLength", value.asInstanceOf[js.Any])
    
    inline def setSpotLength(value: Double): Self = StObject.set(x, "spotLength", value.asInstanceOf[js.Any])
  }
}
