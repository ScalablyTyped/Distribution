package typings.weixinDashApp.wx

import typings.weixinDashApp.weixinDashAppStrings.ancestor
import typings.weixinDashApp.weixinDashAppStrings.child
import typings.weixinDashApp.weixinDashAppStrings.descendant
import typings.weixinDashApp.weixinDashAppStrings.parent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentRelation[D, P] extends js.Object {
  /** 关系生命周期函数，当关系在页面节点树中发生改变时触发，触发时机在组件moved生命周期之后 */
  var linkChanged: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[js.Any]], Unit]] = js.undefined
  /** 关系生命周期函数，当关系被建立在页面节点树中时触发，触发时机在组件attached生命周期之后 */
  var linked: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[js.Any]], Unit]] = js.undefined
  /** 如果这一项被设置，则它表示关联的目标节点所应具有的behavior，所有拥有这一behavior的组件节点都会被关联 */
  var target: js.UndefOr[String] = js.undefined
  /** 目标组件的相对关系，可选的值为 parent 、 child 、 ancestor 、 descendant */
  var `type`: parent | child | ancestor | descendant
  /** 关系生命周期函数，当关系脱离页面节点树时触发，触发时机在组件detached生命周期之后 */
  var unlinked: js.UndefOr[js.Function1[/* target */ Component[D, P, js.Array[js.Any]], Unit]] = js.undefined
}

object ComponentRelation {
  @scala.inline
  def apply[D, P](
    `type`: parent | child | ancestor | descendant,
    linkChanged: /* target */ Component[D, P, js.Array[js.Any]] => Unit = null,
    linked: /* target */ Component[D, P, js.Array[js.Any]] => Unit = null,
    target: String = null,
    unlinked: /* target */ Component[D, P, js.Array[js.Any]] => Unit = null
  ): ComponentRelation[D, P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (linkChanged != null) __obj.updateDynamic("linkChanged")(js.Any.fromFunction1(linkChanged))
    if (linked != null) __obj.updateDynamic("linked")(js.Any.fromFunction1(linked))
    if (target != null) __obj.updateDynamic("target")(target)
    if (unlinked != null) __obj.updateDynamic("unlinked")(js.Any.fromFunction1(unlinked))
    __obj.asInstanceOf[ComponentRelation[D, P]]
  }
}

