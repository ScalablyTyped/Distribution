package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry[TargetGeometry] extends StObject {
  
  var geometry: js.UndefOr[TargetGeometry] = js.undefined
}
object Geometry {
  
  inline def apply[TargetGeometry](): Geometry[TargetGeometry] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry[TargetGeometry]]
  }
  
  extension [Self <: Geometry[?], TargetGeometry](x: Self & Geometry[TargetGeometry]) {
    
    inline def setGeometry(value: TargetGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
  }
}
