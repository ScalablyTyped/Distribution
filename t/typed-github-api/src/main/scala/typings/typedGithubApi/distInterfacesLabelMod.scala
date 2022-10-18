package typings.typedGithubApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesLabelMod {
  
  trait Label extends StObject {
    
    var default: Boolean
    
    var color: String
    
    var id: Double
    
    var name: String
  }
  object Label {
    
    inline def apply(color: String, default: Boolean, id: Double, name: String): Label = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
