package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry[TargetGeometry] extends StObject {
  
  var geometry: js.UndefOr[TargetGeometry] = js.native
}
object Geometry {
  
  @scala.inline
  def apply[TargetGeometry](): Geometry[TargetGeometry] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry[TargetGeometry]]
  }
  
  @scala.inline
  implicit class GeometryMutableBuilder[Self <: Geometry[_], TargetGeometry] (val x: Self with Geometry[TargetGeometry]) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: TargetGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
  }
}
