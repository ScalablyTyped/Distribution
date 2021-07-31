package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object identifiableMod {
  
  trait Identifiable extends StObject {
    
    /**
      * The id of the object.
      */
    var id: String
  }
  object Identifiable {
    
    @scala.inline
    def apply(id: String): Identifiable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identifiable]
    }
    
    @scala.inline
    implicit class IdentifiableMutableBuilder[Self <: Identifiable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
