package typings.terraButton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Types extends StObject {
    
    var Types: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonTypes */ Any
    
    var Variants: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonVariants */ Any
  }
  object Types {
    
    inline def apply(
      Types: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonTypes */ Any,
      Variants: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonVariants */ Any
    ): Types = {
      val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any], Variants = Variants.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      inline def setTypes(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonTypes */ Any): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
      
      inline def setVariants(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ButtonVariants */ Any): Self = StObject.set(x, "Variants", value.asInstanceOf[js.Any])
    }
  }
}
