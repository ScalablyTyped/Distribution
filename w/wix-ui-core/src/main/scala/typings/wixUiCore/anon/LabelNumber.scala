package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelNumber extends StObject {
  
  var label: Double
  
  var value: Double
}
object LabelNumber {
  
  @scala.inline
  def apply(label: Double, value: Double): LabelNumber = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelNumber]
  }
  
  @scala.inline
  implicit class LabelNumberMutableBuilder[Self <: LabelNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
