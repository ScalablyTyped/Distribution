package typings.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Array of choices.
    */
  var choices: js.Array[Choice] = js.native
  
  /**
    * Callback function to be called with the selected choice when user
    * selects a new choice.
    */
  def onSelect(value: String): Unit = js.native
  
  /**
    * Value of currently selected choice (should match a `value` property
    * from a choice in `choices`).
    */
  var value: String = js.native
}
object Props {
  
  @scala.inline
  def apply(choices: js.Array[Choice], onSelect: String => Unit, value: String): Props = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1(onSelect), value = value.asInstanceOf[js.Any])
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
    def setChoicesVarargs(value: Choice*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[Choice]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelect(value: String => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
