package typings.wordpressComponents.tabPanelMod.TabPanel

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.wordpressComponentsStrings.horizontal
import typings.wordpressComponents.wordpressComponentsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * The class to add to the active tab.
    * @defaultValue "is-active"
    */
  var activeClass: js.UndefOr[String] = js.native
  
  /**
    * A function which renders the tabviews given the selected tab. The
    * function is passed the active tab object as an argument as defined
    * the the tabs prop. The element to which the tooltip should anchor.
    */
  def children(tab: Tab): Element = js.native
  
  /**
    * The class to give to the outer container for the `TabPanel`.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Optionally provide a tab name for a tab to be selected upon mounting
    * of component. If this prop is not set, the first tab will be
    * selected by default.
    */
  var initialTabName: js.UndefOr[String] = js.native
  
  /**
    * The function called when a tab has been selected. It is passed the
    * `tabName` as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.native
  
  /**
    * The orientation of the tablist.
    * @defaultValue "horizontal"
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  
  var tabs: js.Array[Tab] = js.native
}
object Props {
  
  @scala.inline
  def apply(children: Tab => Element, tabs: js.Array[Tab]): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), tabs = tabs.asInstanceOf[js.Any])
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
    def setChildren(value: Tab => Element): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setInitialTabName(value: String): Self = this.set("initialTabName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialTabName: Self = this.set("initialTabName", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* tabName */ String => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}
