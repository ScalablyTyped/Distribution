package typings.three.anon

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] extends StObject {
  
  val geometry: TBufferGeometry | Null
  
  val thresholdAngle: Double
}
object Geometry {
  
  inline def apply[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */](thresholdAngle: Double): Geometry[TBufferGeometry] = {
    val __obj = js.Dynamic.literal(thresholdAngle = thresholdAngle.asInstanceOf[js.Any], geometry = null)
    __obj.asInstanceOf[Geometry[TBufferGeometry]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geometry[?], TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] (val x: Self & Geometry[TBufferGeometry]) extends AnyVal {
    
    inline def setGeometry(value: TBufferGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryNull: Self = StObject.set(x, "geometry", null)
    
    inline def setThresholdAngle(value: Double): Self = StObject.set(x, "thresholdAngle", value.asInstanceOf[js.Any])
  }
}
