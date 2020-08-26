package typings.wordpressComponents.tabPanelMod.TabPanel

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab
  extends /**
  * Other fields may be added to the object and accessed from the child
  * function if desired.
  */
/* k */ StringDictionary[js.Any] {
  /**
    * Defines the class to put on the tab.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Defines the key for the tab.
    */
  var name: String = js.native
  /**
    * Defines the translated text for the tab.
    */
  var title: String = js.native
}

object Tab {
  @scala.inline
  def apply(name: String, title: String): Tab = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

