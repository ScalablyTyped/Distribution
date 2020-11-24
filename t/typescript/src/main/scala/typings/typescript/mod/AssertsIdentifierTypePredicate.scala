package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsIdentifier
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
  implicit class AssertsIdentifierTypePredicateOps[Self <: AssertsIdentifierTypePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: AssertsIdentifier): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterIndex(value: Double): Self = this.set("parameterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: java.lang.String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
  }
}
