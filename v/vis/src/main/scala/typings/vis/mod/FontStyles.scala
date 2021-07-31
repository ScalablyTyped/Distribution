package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontStyles extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var face: js.UndefOr[String] = js.undefined
  
  var mod: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var vadjust: js.UndefOr[Double] = js.undefined
}
object FontStyles {
  
  @scala.inline
  def apply(): FontStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyles]
  }
  
  @scala.inline
  implicit class FontStylesMutableBuilder[Self <: FontStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    @scala.inline
    def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setVadjust(value: Double): Self = StObject.set(x, "vadjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVadjustUndefined: Self = StObject.set(x, "vadjust", js.undefined)
  }
}
