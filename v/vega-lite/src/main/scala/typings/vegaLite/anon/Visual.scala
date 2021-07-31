package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visual extends StObject {
  
  var data: js.UndefOr[String] = js.undefined
  
  var visual: js.UndefOr[String] = js.undefined
}
object Visual {
  
  @scala.inline
  def apply(): Visual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visual]
  }
  
  @scala.inline
  implicit class VisualMutableBuilder[Self <: Visual] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setVisual(value: String): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
