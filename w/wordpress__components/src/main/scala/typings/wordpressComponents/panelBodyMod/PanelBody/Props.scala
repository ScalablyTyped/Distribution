package typings.wordpressComponents.panelBodyMod.PanelBody

import typings.react.mod.ReactNode
import typings.wordpressComponents.iconMod.Icon.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: ReactNode = js.native
  
  /**
    * The class that will be added with `components-panel__body`, if the
    * panel is currently open, the `is-opened` class will also be passed
    * to the classes of the wrapper div. If no `className` is passed then
    * only `components-panel__body` and `is-opened` is used.
    */
  var className: js.UndefOr[js.Any] = js.native
  
  /**
    * An icon to be shown next to the `PanelBody` title.
    */
  var icon: js.UndefOr[IconType[js.Object]] = js.native
  
  /**
    * Whether or not the panel will start open.
    * @defaultValue true
    */
  var initialOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that is called when the user clicks on the `PanelBody`
    * title after the open state is changed.
    */
  var onToggle: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * If opened is true then the `Panel` will remain open regardless of
    * the `initialOpen` prop and the panel will be prevented from being
    * closed.
    */
  var opened: js.UndefOr[Boolean] = js.native
  
  /**
    * Title of the `PanelBody`. This shows even when it is closed.
    */
  var title: js.UndefOr[String] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: js.Any): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIcon(value: IconType[js.Object]): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setInitialOpen(value: Boolean): Self = this.set("initialOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialOpen: Self = this.set("initialOpen", js.undefined)
    
    @scala.inline
    def setOnToggle(value: () => Unit): Self = this.set("onToggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setOpened(value: Boolean): Self = this.set("opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpened: Self = this.set("opened", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
