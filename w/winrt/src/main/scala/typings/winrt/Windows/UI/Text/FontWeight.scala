package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  var weight: Double
}
object FontWeight {
  
  @scala.inline
  def apply(weight: Double): FontWeight = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeight]
  }
  
  @scala.inline
  implicit class FontWeightMutableBuilder[Self <: FontWeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
