package typings.wordpressEditPost.pluginBlockSettingsMenuItemMod.PluginBlockSettingsMenuItem

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * An array containing a list of block names for which the item should be shown. If not present,
    * it'll be rendered for any block. If multiple blocks are selected, it'll be shown if and only if
    * all of them are in the whitelist.
    */
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A dashicon slug, or a custom JSX element.
    * @defaultValue `"admin-plugins"`
    */
  var icon: js.UndefOr[Element | Icon] = js.native
  
  /**
    * The menu item text.
    */
  var label: String = js.native
  
  /**
    * Callback function to be executed when the user click the menu item.
    */
  var onClick: MouseEventHandler[HTMLButtonElement] = js.native
  
  /**
    * If it should be rendered smaller. (This is undocumented).
    */
  var small: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply(label: String, onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Props = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllowedBlocksVarargs(value: String*): Self = this.set("allowedBlocks", js.Array(value :_*))
    
    @scala.inline
    def setAllowedBlocks(value: js.Array[String]): Self = this.set("allowedBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedBlocks: Self = this.set("allowedBlocks", js.undefined)
    
    @scala.inline
    def setIcon(value: Element | Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
  }
}
