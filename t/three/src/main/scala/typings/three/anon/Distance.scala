package typings.three.anon

import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  var distance: Double
  
  var `object`: Object3D
}
object Distance {
  
  @scala.inline
  def apply(distance: Double, `object`: Object3D): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
  
  @scala.inline
  implicit class DistanceMutableBuilder[Self <: Distance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Object3D): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
