package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypePredicateBase extends StObject {
  
  var kind: TypePredicateKind = js.native
  
  var `type`: js.UndefOr[Type] = js.native
}
object TypePredicateBase {
  
  @scala.inline
  def apply(kind: TypePredicateKind): TypePredicateBase = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePredicateBase]
  }
  
  @scala.inline
  implicit class TypePredicateBaseMutableBuilder[Self <: TypePredicateBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: TypePredicateKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
