package typings.three.anon

import typings.three.bufferGeometryMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryTBufferGeometry[TBufferGeometry /* <: BufferGeometry */] extends StObject {
  
  var geometry: TBufferGeometry
}
object GeometryTBufferGeometry {
  
  inline def apply[TBufferGeometry /* <: BufferGeometry */](geometry: TBufferGeometry): GeometryTBufferGeometry[TBufferGeometry] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryTBufferGeometry[TBufferGeometry]]
  }
  
  extension [Self <: GeometryTBufferGeometry[?], TBufferGeometry /* <: BufferGeometry */](x: Self & GeometryTBufferGeometry[TBufferGeometry]) {
    
    inline def setGeometry(value: TBufferGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
