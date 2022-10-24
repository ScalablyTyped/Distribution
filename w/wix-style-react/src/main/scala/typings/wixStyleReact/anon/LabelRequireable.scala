package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelRequireable extends StObject {
  
  var label: Requireable[js.Date]
  
  var value: Requireable[Double]
}
object LabelRequireable {
  
  inline def apply(label: Requireable[js.Date], value: Requireable[Double]): LabelRequireable = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelRequireable]
  }
  
  extension [Self <: LabelRequireable](x: Self) {
    
    inline def setLabel(value: Requireable[js.Date]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
