package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertsIdentifierTypePredicate
  extends StObject
     with TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_AssertsIdentifierTypePredicate: AssertsIdentifier
  
  var parameterIndex: Double
  
  var parameterName: java.lang.String
}
object AssertsIdentifierTypePredicate {
  
  inline def apply(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertsIdentifierTypePredicate]
  }
  
  extension [Self <: AssertsIdentifierTypePredicate](x: Self) {
    
    inline def setKind(value: AssertsIdentifier): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParameterIndex(value: Double): Self = StObject.set(x, "parameterIndex", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: java.lang.String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
  }
}
