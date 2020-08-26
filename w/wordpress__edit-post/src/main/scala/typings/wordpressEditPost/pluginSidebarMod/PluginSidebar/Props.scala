package typings.wordpressEditPost.pluginSidebarMod.PluginSidebar

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: ReactNode = js.native
  /**
    * An optional class name added to the sidebar body.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * A Dashicon slug or a custom JSX element to be rendered when the sidebar is pinned to
    * toolbar.
    */
  var icon: js.UndefOr[Icon | Element] = js.native
  /**
    * Whether to allow to pin sidebar to toolbar.
    * @defaultValue `true`
    */
  var isPinnable: js.UndefOr[Boolean] = js.native
  /**
    * A string identifying the sidebar. Must be unique for every sidebar registered within the
    * scope of your plugin.
    */
  var name: String = js.native
  /**
    * Title displayed at the top of the sidebar.
    */
  var title: String = js.native
}

object Props {
  @scala.inline
  def apply(name: String, title: String): Props = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIcon(value: Icon | Element): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIsPinnable(value: Boolean): Self = this.set("isPinnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPinnable: Self = this.set("isPinnable", js.undefined)
  }
  
}

