package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`20`
import org.scalablytyped.runtime.StObject
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
  implicit class CacheExpressionMutableBuilder[Self <: CacheExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVNode(value: Boolean): Self = StObject.set(x, "isVNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `20`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: JSChildNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
