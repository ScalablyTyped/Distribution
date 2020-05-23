package typings.wordpressComponents.tabPanelMod.TabPanel

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab
  extends /**
  * Other fields may be added to the object and accessed from the child
  * function if desired.
  */
/* k */ StringDictionary[js.Any] {
  /**
    * Defines the class to put on the tab.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Defines the key for the tab.
    */
  var name: String
  /**
    * Defines the translated text for the tab.
    */
  var title: String
}

object Tab {
  @scala.inline
  def apply(
    name: String,
    title: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null
  ): Tab = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

