package typings.victoryBrushContainer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAny extends StObject {
  
  var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
  
  var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
}
object XAny {
  
  inline def apply(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any,
    y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
  ): XAny = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAny]
  }
  
  extension [Self <: XAny](x: Self) {
    
    inline def setX(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
    ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
    ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
