package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorRGB extends StObject {
  
  var b: NumericValueRef = js.native
  
  var g: NumericValueRef = js.native
  
  var r: NumericValueRef = js.native
}
object ColorRGB {
  
  @scala.inline
  def apply(b: NumericValueRef, g: NumericValueRef, r: NumericValueRef): ColorRGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorRGB]
  }
  
  @scala.inline
  implicit class ColorRGBMutableBuilder[Self <: ColorRGB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: NumericValueRef): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: NumericValueRef): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: NumericValueRef): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
