package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectionParameters extends StObject {
  
  var aspect: Double
  
  var far: Double
  
  var focalDistance: Double
  
  var fov: Double
  
  var near: Double
}
object ProjectionParameters {
  
  @scala.inline
  def apply(aspect: Double, far: Double, focalDistance: Double, fov: Double, near: Double): ProjectionParameters = {
    val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], focalDistance = focalDistance.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParameters]
  }
  
  @scala.inline
  implicit class ProjectionParametersMutableBuilder[Self <: ProjectionParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalDistance(value: Double): Self = StObject.set(x, "focalDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
  }
}
