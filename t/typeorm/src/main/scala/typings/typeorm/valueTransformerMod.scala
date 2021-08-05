package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueTransformerMod {
  
  trait ValueTransformer extends StObject {
    
    /**
      * Used to unmarshal data when reading from the database.
      */
    def from(value: js.Any): js.Any
    
    /**
      * Used to marshal data when writing to the database.
      */
    def to(value: js.Any): js.Any
  }
  object ValueTransformer {
    
    inline def apply(from: js.Any => js.Any, to: js.Any => js.Any): ValueTransformer = {
      val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction1(to))
      __obj.asInstanceOf[ValueTransformer]
    }
    
    extension [Self <: ValueTransformer](x: Self) {
      
      inline def setFrom(value: js.Any => js.Any): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      inline def setTo(value: js.Any => js.Any): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    }
  }
}
