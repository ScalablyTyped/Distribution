package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.ancestor
import typings.weixinApp.weixinAppStrings.child
import typings.weixinApp.weixinAppStrings.descendant
import typings.weixinApp.weixinAppStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentRelation[D, P] extends StObject {
  
  /** 关系生命周期函数，当关系在页面节点树中发生改变时触发，触发时机在组件moved生命周期之后 */
  var linkChanged: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[js.Any]], Unit]] = js.native
  
  /** 关系生命周期函数，当关系被建立在页面节点树中时触发，触发时机在组件attached生命周期之后 */
  var linked: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[js.Any]], Unit]] = js.native
  
  /** 如果这一项被设置，则它表示关联的目标节点所应具有的behavior，所有拥有这一behavior的组件节点都会被关联 */
  var target: js.UndefOr[String] = js.native
  
  /** 目标组件的相对关系，可选的值为 parent 、 child 、 ancestor 、 descendant */
  var `type`: parent | child | ancestor | descendant = js.native
  
  /** 关系生命周期函数，当关系脱离页面节点树时触发，触发时机在组件detached生命周期之后 */
  var unlinked: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[js.Any]], Unit]] = js.native
}
object ComponentRelation {
  
  @scala.inline
  def apply[D, P](`type`: parent | child | ancestor | descendant): ComponentRelation[D, P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentRelation[D, P]]
  }
  
  @scala.inline
  implicit class ComponentRelationMutableBuilder[Self <: ComponentRelation[_, _], D, P] (val x: Self with (ComponentRelation[D, P])) extends AnyVal {
    
    @scala.inline
    def setLinkChanged(value: /* target */ Component[D, P, js.Array[js.Any]] => Unit): Self = StObject.set(x, "linkChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinkChangedUndefined: Self = StObject.set(x, "linkChanged", js.undefined)
    
    @scala.inline
    def setLinked(value: /* target */ Component[D, P, js.Array[js.Any]] => Unit): Self = StObject.set(x, "linked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinkedUndefined: Self = StObject.set(x, "linked", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: parent | child | ancestor | descendant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlinked(value: /* target */ Component[D, P, js.Array[js.Any]] => Unit): Self = StObject.set(x, "unlinked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnlinkedUndefined: Self = StObject.set(x, "unlinked", js.undefined)
  }
}
