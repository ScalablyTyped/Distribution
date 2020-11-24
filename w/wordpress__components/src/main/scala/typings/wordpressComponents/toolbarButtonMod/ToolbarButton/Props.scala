package typings.wordpressComponents.toolbarButtonMod.ToolbarButton

import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.PartialProps
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @wordpress/components.@wordpress/components/dropdown-menu.default.Control */
/* Inlined parent std.Pick<@wordpress/components.@wordpress/components/icon-button.default.Props, 'shortcut'> */
@js.native
trait Props extends js.Object {
  
  /**
    * Anything to add into the containing element after the button.
    */
  var children: js.UndefOr[ReactNode] = js.native
  
  /**
    * `className` for the button element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * `className` for the container.
    */
  var containerClassName: js.UndefOr[String] = js.native
  
  /**
    * Any additional props to pass down to `IconButton`.
    */
  var extraProps: js.UndefOr[PartialProps] = js.native
  
  /**
    * Dashicon icon slug.
    */
  var icon: Icon = js.native
  
  /**
    * Describes whether or not the button is active.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  
  /**
    * Describes whether or not the control is disabled.
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to invoke when the option is selected.
    */
  def onClick(): Unit = js.native
  
  var shortcut: js.UndefOr[ShortcutType] = js.native
  
  /**
    * Subscript text to add to the button.
    */
  var subscript: js.UndefOr[String] = js.native
  
  /**
    * Human-readable title for the control.
    */
  var title: String = js.native
}
object Props {
  
  @scala.inline
  def apply(icon: Icon, onClick: () => Unit, title: String): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
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
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
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
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setExtraProps(value: PartialProps): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraProps: Self = this.set("extraProps", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setShortcut(value: ShortcutType): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
    
    @scala.inline
    def setSubscript(value: String): Self = this.set("subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscript: Self = this.set("subscript", js.undefined)
  }
}
