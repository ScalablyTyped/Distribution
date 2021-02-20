package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorLAB extends StObject {
  
  var a: NumericValueRef = js.native
  
  var b: NumericValueRef = js.native
  
  var l: NumericValueRef = js.native
}
object ColorLAB {
  
  @scala.inline
  def apply(a: NumericValueRef, b: NumericValueRef, l: NumericValueRef): ColorLAB = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorLAB]
  }
  
  @scala.inline
  implicit class ColorLABMutableBuilder[Self <: ColorLAB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: NumericValueRef): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: NumericValueRef): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: NumericValueRef): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
  }
}
