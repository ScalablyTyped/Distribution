package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeCallbackResult extends StObject {
  
  /** 节点对应的 Node 实例 */
  var node: IAnyObject = js.native
}
object NodeCallbackResult {
  
  @scala.inline
  def apply(node: IAnyObject): NodeCallbackResult = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCallbackResult]
  }
  
  @scala.inline
  implicit class NodeCallbackResultMutableBuilder[Self <: NodeCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: IAnyObject): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
