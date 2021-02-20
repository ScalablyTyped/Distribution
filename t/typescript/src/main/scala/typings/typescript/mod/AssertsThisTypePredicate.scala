package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsThis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssertsThisTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_AssertsThisTypePredicate: AssertsThis = js.native
  
  var parameterIndex: js.UndefOr[scala.Nothing] = js.native
  
  var parameterName: js.UndefOr[scala.Nothing] = js.native
}
object AssertsThisTypePredicate {
  
  @scala.inline
  def apply(kind: AssertsThis): AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertsThisTypePredicate]
  }
  
  @scala.inline
  implicit class AssertsThisTypePredicateMutableBuilder[Self <: AssertsThisTypePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: AssertsThis): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
