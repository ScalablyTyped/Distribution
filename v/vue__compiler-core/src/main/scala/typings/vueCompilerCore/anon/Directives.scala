package typings.vueCompilerCore.anon

import typings.vueCompilerCore.mod.DirectiveNode
import typings.vueCompilerCore.mod.PropsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directives extends js.Object {
  
  var directives: js.Array[DirectiveNode] = js.native
  
  var dynamicPropNames: js.Array[String] = js.native
  
  var patchFlag: Double = js.native
  
  var props: js.UndefOr[PropsExpression] = js.native
}
object Directives {
  
  @scala.inline
  def apply(directives: js.Array[DirectiveNode], dynamicPropNames: js.Array[String], patchFlag: Double): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], dynamicPropNames = dynamicPropNames.asInstanceOf[js.Any], patchFlag = patchFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
  
  @scala.inline
  implicit class DirectivesOps[Self <: Directives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectivesVarargs(value: DirectiveNode*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[DirectiveNode]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicPropNamesVarargs(value: String*): Self = this.set("dynamicPropNames", js.Array(value :_*))
    
    @scala.inline
    def setDynamicPropNames(value: js.Array[String]): Self = this.set("dynamicPropNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchFlag(value: Double): Self = this.set("patchFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: PropsExpression): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
