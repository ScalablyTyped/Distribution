package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`20`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheExpression
  extends JSChildNode
     with Node2 {
  
  var index: Double = js.native
  
  var isVNode: Boolean = js.native
  
  @JSName("type")
  var type_CacheExpression: `20` = js.native
  
  var value: JSChildNode = js.native
}
object CacheExpression {
  
  @scala.inline
  def apply(index: Double, isVNode: Boolean, loc: SourceLocation, `type`: `20`, value: JSChildNode): CacheExpression = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isVNode = isVNode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheExpression]
  }
  
  @scala.inline
  implicit class CacheExpressionOps[Self <: CacheExpression] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVNode(value: Boolean): Self = this.set("isVNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `20`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: JSChildNode): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
