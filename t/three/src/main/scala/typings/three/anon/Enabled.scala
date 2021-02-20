package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enabled extends StObject {
  
  var enabled: Boolean = js.native
  
  var fullHeight: Double = js.native
  
  var fullWidth: Double = js.native
  
  var height: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var width: Double = js.native
}
object Enabled {
  
  @scala.inline
  def apply(
    enabled: Boolean,
    fullHeight: Double,
    fullWidth: Double,
    height: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double
  ): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fullHeight = fullHeight.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullHeight(value: Double): Self = StObject.set(x, "fullHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidth(value: Double): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
