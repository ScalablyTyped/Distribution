package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Depth extends StObject {
  
  var depth: Double = js.native
  
  var depthSegments: Double = js.native
  
  var height: Double = js.native
  
  var heightSegments: Double = js.native
  
  var width: Double = js.native
  
  var widthSegments: Double = js.native
}
object Depth {
  
  @scala.inline
  def apply(
    depth: Double,
    depthSegments: Double,
    height: Double,
    heightSegments: Double,
    width: Double,
    widthSegments: Double
  ): Depth = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], depthSegments = depthSegments.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
  
  @scala.inline
  implicit class DepthMutableBuilder[Self <: Depth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthSegments(value: Double): Self = StObject.set(x, "depthSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightSegments(value: Double): Self = StObject.set(x, "heightSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthSegments(value: Double): Self = StObject.set(x, "widthSegments", value.asInstanceOf[js.Any])
  }
}
