package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelValue extends StObject {
  
  var label: Requireable[String]
  
  var value: Requireable[Double]
}
object LabelValue {
  
  inline def apply(label: Requireable[String], value: Requireable[Double]): LabelValue = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelValue]
  }
  
  extension [Self <: LabelValue](x: Self) {
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
