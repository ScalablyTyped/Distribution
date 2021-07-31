package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`20`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheExpression
  extends StObject
     with Node2
     with JSChildNode {
  
  var index: Double
  
  var isVNode: Boolean
  
  @JSName("type")
  var type_CacheExpression: `20`
  
  var value: JSChildNode
}
object CacheExpression {
  
  @scala.inline
  def apply(index: Double, isVNode: Boolean, loc: SourceLocation, value: JSChildNode): CacheExpression = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isVNode = isVNode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(20)
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
