package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemIdentifiableMod {
  
  trait Identifiable extends StObject {
    
    /**
      * The id of the object.
      */
    var id: String
  }
  object Identifiable {
    
    inline def apply(id: String): Identifiable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identifiable]
    }
    
    extension [Self <: Identifiable](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
