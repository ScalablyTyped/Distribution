package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifierTypePredicate
  extends StObject
     with TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_IdentifierTypePredicate: typings.typescript.mod.TypePredicateKind.Identifier
  
  var parameterIndex: Double
  
  var parameterName: java.lang.String
  
  @JSName("type")
  var type_IdentifierTypePredicate: Type
}
object IdentifierTypePredicate {
  
  @scala.inline
  def apply(
    kind: typings.typescript.mod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierTypePredicate]
  }
  
  @scala.inline
  implicit class IdentifierTypePredicateMutableBuilder[Self <: IdentifierTypePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: typings.typescript.mod.TypePredicateKind.Identifier): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterIndex(value: Double): Self = StObject.set(x, "parameterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: java.lang.String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
