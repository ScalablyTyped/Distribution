package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalRoot extends js.Object {
  
  var aliasSymbol: js.UndefOr[Symbol] = js.native
  
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.native
  
  var checkType: Type = js.native
  
  var extendsType: Type = js.native
  
  var inferTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
  
  var instantiations: js.UndefOr[Map[Type]] = js.native
  
  var isDistributive: Boolean = js.native
  
  var node: ConditionalTypeNode = js.native
  
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.native
}
object ConditionalRoot {
  
  @scala.inline
  def apply(checkType: Type, extendsType: Type, isDistributive: Boolean, node: ConditionalTypeNode): ConditionalRoot = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], isDistributive = isDistributive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRoot]
  }
  
  @scala.inline
  implicit class ConditionalRootOps[Self <: ConditionalRoot] (val x: Self) extends AnyVal {
    
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
    def setCheckType(value: Type): Self = this.set("checkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsType(value: Type): Self = this.set("extendsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDistributive(value: Boolean): Self = this.set("isDistributive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: ConditionalTypeNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasSymbol(value: Symbol): Self = this.set("aliasSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasSymbol: Self = this.set("aliasSymbol", js.undefined)
    
    @scala.inline
    def setAliasTypeArgumentsVarargs(value: Type*): Self = this.set("aliasTypeArguments", js.Array(value :_*))
    
    @scala.inline
    def setAliasTypeArguments(value: js.Array[Type]): Self = this.set("aliasTypeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasTypeArguments: Self = this.set("aliasTypeArguments", js.undefined)
    
    @scala.inline
    def setInferTypeParametersVarargs(value: TypeParameter*): Self = this.set("inferTypeParameters", js.Array(value :_*))
    
    @scala.inline
    def setInferTypeParameters(value: js.Array[TypeParameter]): Self = this.set("inferTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferTypeParameters: Self = this.set("inferTypeParameters", js.undefined)
    
    @scala.inline
    def setInstantiations(value: Map[Type]): Self = this.set("instantiations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstantiations: Self = this.set("instantiations", js.undefined)
    
    @scala.inline
    def setOuterTypeParametersVarargs(value: TypeParameter*): Self = this.set("outerTypeParameters", js.Array(value :_*))
    
    @scala.inline
    def setOuterTypeParameters(value: js.Array[TypeParameter]): Self = this.set("outerTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterTypeParameters: Self = this.set("outerTypeParameters", js.undefined)
  }
}
