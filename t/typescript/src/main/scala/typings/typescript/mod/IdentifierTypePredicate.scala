package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifierTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_IdentifierTypePredicate: typings.typescript.mod.TypePredicateKind.Identifier = js.native
  
  var parameterIndex: Double = js.native
  
  var parameterName: java.lang.String = js.native
  
  @JSName("type")
  var type_IdentifierTypePredicate: Type = js.native
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
  implicit class IdentifierTypePredicateOps[Self <: IdentifierTypePredicate] (val x: Self) extends AnyVal {
    
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
    def setKind(value: typings.typescript.mod.TypePredicateKind.Identifier): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterIndex(value: Double): Self = this.set("parameterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterName(value: java.lang.String): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
