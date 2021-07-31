package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  var angle: js.UndefOr[Double] = js.undefined
  
  var renderBehindTheNode: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object Angle {
  
  @scala.inline
  def apply(): Angle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Angle]
  }
  
  @scala.inline
  implicit class AngleMutableBuilder[Self <: Angle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setRenderBehindTheNode(value: Boolean): Self = StObject.set(x, "renderBehindTheNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderBehindTheNodeUndefined: Self = StObject.set(x, "renderBehindTheNode", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
