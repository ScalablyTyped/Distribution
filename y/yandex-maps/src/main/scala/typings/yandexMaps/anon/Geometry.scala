package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry[TargetGeometry] extends StObject {
  
  var geometry: js.UndefOr[TargetGeometry] = js.undefined
}
object Geometry {
  
  @scala.inline
  def apply[TargetGeometry](): Geometry[TargetGeometry] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry[TargetGeometry]]
  }
  
  @scala.inline
  implicit class GeometryMutableBuilder[Self <: Geometry[?], TargetGeometry] (val x: Self & Geometry[TargetGeometry]) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: TargetGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
  }
}
