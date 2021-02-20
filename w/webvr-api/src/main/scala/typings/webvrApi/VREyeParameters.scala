package typings.webvrApi

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VREyeParameters extends StObject {
  
  /** @deprecated */
  val fieldOfView: VRFieldOfView = js.native
  
  val offset: Float32Array = js.native
  
  val renderHeight: Double = js.native
  
  val renderWidth: Double = js.native
}
object VREyeParameters {
  
  @scala.inline
  def apply(fieldOfView: VRFieldOfView, offset: Float32Array, renderHeight: Double, renderWidth: Double): VREyeParameters = {
    val __obj = js.Dynamic.literal(fieldOfView = fieldOfView.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], renderHeight = renderHeight.asInstanceOf[js.Any], renderWidth = renderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VREyeParameters]
  }
  
  @scala.inline
  implicit class VREyeParametersMutableBuilder[Self <: VREyeParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldOfView(value: VRFieldOfView): Self = StObject.set(x, "fieldOfView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Float32Array): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderHeight(value: Double): Self = StObject.set(x, "renderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderWidth(value: Double): Self = StObject.set(x, "renderWidth", value.asInstanceOf[js.Any])
  }
}
