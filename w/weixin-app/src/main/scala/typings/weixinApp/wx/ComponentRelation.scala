package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.ancestor
import typings.weixinApp.weixinAppStrings.child
import typings.weixinApp.weixinAppStrings.descendant
import typings.weixinApp.weixinAppStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRelation[D, P] extends StObject {
  
  /** 关系生命周期函数，当关系在页面节点树中发生改变时触发，触发时机在组件moved生命周期之后 */
  var linkChanged: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[Any]], Unit]] = js.undefined
  
  /** 关系生命周期函数，当关系被建立在页面节点树中时触发，触发时机在组件attached生命周期之后 */
  var linked: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[Any]], Unit]] = js.undefined
  
  /** 如果这一项被设置，则它表示关联的目标节点所应具有的behavior，所有拥有这一behavior的组件节点都会被关联 */
  var target: js.UndefOr[String] = js.undefined
  
  /** 目标组件的相对关系，可选的值为 parent 、 child 、 ancestor 、 descendant */
  var `type`: parent | child | ancestor | descendant
  
  /** 关系生命周期函数，当关系脱离页面节点树时触发，触发时机在组件detached生命周期之后 */
  var unlinked: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[Any]], Unit]] = js.undefined
}
object ComponentRelation {
  
  inline def apply[D, P](`type`: parent | child | ancestor | descendant): ComponentRelation[D, P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRelation[D, P]]
  }
  
  extension [Self <: ComponentRelation[?, ?], D, P](x: Self & (ComponentRelation[D, P])) {
    
    inline def setLinkChanged(value: /* target */ Component[D, P, js.Array[Any]] => Unit): Self = StObject.set(x, "linkChanged", js.Any.fromFunction1(value))
    
    inline def setLinkChangedUndefined: Self = StObject.set(x, "linkChanged", js.undefined)
    
    inline def setLinked(value: /* target */ Component[D, P, js.Array[Any]] => Unit): Self = StObject.set(x, "linked", js.Any.fromFunction1(value))
    
    inline def setLinkedUndefined: Self = StObject.set(x, "linked", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: parent | child | ancestor | descendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnlinked(value: /* target */ Component[D, P, js.Array[Any]] => Unit): Self = StObject.set(x, "unlinked", js.Any.fromFunction1(value))
    
    inline def setUnlinkedUndefined: Self = StObject.set(x, "unlinked", js.undefined)
  }
}
