package typings.three.anon

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryTBufferGeometry[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] extends StObject {
  
  val geometry: TBufferGeometry
}
object GeometryTBufferGeometry {
  
  inline def apply[TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */](geometry: TBufferGeometry): GeometryTBufferGeometry[TBufferGeometry] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryTBufferGeometry[TBufferGeometry]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeometryTBufferGeometry[?], TBufferGeometry /* <: BufferGeometry[NormalBufferAttributes] */] (val x: Self & GeometryTBufferGeometry[TBufferGeometry]) extends AnyVal {
    
    inline def setGeometry(value: TBufferGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
  }
}
