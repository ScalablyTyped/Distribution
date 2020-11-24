package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleExpressionNode
  extends ExpressionNode
     with Node2 {
  
  var content: String = js.native
  
  /**
    * Indicates this is an identifier for a hoist vnode call and points to the
    * hoisted node.
    */
  var hoisted: js.UndefOr[JSChildNode] = js.native
  
  /**
    * an expression parsed as the params of a function will track
    * the identifiers declared inside the function body.
    */
  var identifiers: js.UndefOr[js.Array[String]] = js.native
  
  var isConstant: Boolean = js.native
  
  /**
    * some expressions (e.g. transformAssetUrls import identifiers) are constant,
    * but cannot be stringified because they must be first evaluated at runtime.
    */
  var isRuntimeConstant: js.UndefOr[Boolean] = js.native
  
  var isStatic: Boolean = js.native
  
  @JSName("type")
  var type_SimpleExpressionNode: `4` = js.native
}
object SimpleExpressionNode {
  
  @scala.inline
  def apply(content: String, isConstant: Boolean, isStatic: Boolean, loc: SourceLocation, `type`: `4`): SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isConstant = isConstant.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleExpressionNode]
  }
  
  @scala.inline
  implicit class SimpleExpressionNodeOps[Self <: SimpleExpressionNode] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConstant(value: Boolean): Self = this.set("isConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `4`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoisted(value: JSChildNode): Self = this.set("hoisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoisted: Self = this.set("hoisted", js.undefined)
    
    @scala.inline
    def setIdentifiersVarargs(value: String*): Self = this.set("identifiers", js.Array(value :_*))
    
    @scala.inline
    def setIdentifiers(value: js.Array[String]): Self = this.set("identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifiers: Self = this.set("identifiers", js.undefined)
    
    @scala.inline
    def setIsRuntimeConstant(value: Boolean): Self = this.set("isRuntimeConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRuntimeConstant: Self = this.set("isRuntimeConstant", js.undefined)
  }
}
