package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertsIdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_AssertsIdentifierTypePredicate: AssertsIdentifier = js.native
  
  var parameterIndex: Double = js.native
  
  var parameterName: java.lang.String = js.native
}
object AssertsIdentifierTypePredicate {
  
  @scala.inline
  def apply(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertsIdentifierTypePredicate]
  }
  
  @scala.inline
  implicit class AssertsIdentifierTypePredicateMutableBuilder[Self <: AssertsIdentifierTypePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: AssertsIdentifier): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterIndex(value: Double): Self = StObject.set(x, "parameterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: java.lang.String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
  }
}
