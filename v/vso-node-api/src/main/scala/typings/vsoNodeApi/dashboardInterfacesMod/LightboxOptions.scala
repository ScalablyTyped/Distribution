package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightboxOptions extends StObject {
  
  /**
    * Height of desired lightbox, in pixels
    */
  var height: Double = js.native
  
  /**
    * True to allow lightbox resizing, false to disallow lightbox resizing, defaults to false.
    */
  var resizable: Boolean = js.native
  
  /**
    * Width of desired lightbox, in pixels
    */
  var width: Double = js.native
}
object LightboxOptions {
  
  @scala.inline
  def apply(height: Double, resizable: Boolean, width: Double): LightboxOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightboxOptions]
  }
  
  @scala.inline
  implicit class LightboxOptionsMutableBuilder[Self <: LightboxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
