package typings.three.anon

import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry[TBufferGeometry /* <: BufferGeometry */] extends StObject {
  
  var geometry: TBufferGeometry
  
  var thresholdAngle: Double
}
object Geometry {
  
  inline def apply[TBufferGeometry /* <: BufferGeometry */](geometry: TBufferGeometry, thresholdAngle: Double): Geometry[TBufferGeometry] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], thresholdAngle = thresholdAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry[TBufferGeometry]]
  }
  
  extension [Self <: Geometry[?], TBufferGeometry /* <: BufferGeometry */](x: Self & Geometry[TBufferGeometry]) {
    
    inline def setGeometry(value: TBufferGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setThresholdAngle(value: Double): Self = StObject.set(x, "thresholdAngle", value.asInstanceOf[js.Any])
  }
}
