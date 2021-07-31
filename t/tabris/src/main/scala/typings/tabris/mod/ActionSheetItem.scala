package typings.tabris.mod

import typings.tabris.anon.Style
import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.destructive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "ActionSheetItem")
@js.native
class ActionSheetItem () extends StObject {
  def this(properties: typings.tabris.anon.Image) = this()
  
  /**
    * An image to be displayed for this item in the `ActionSheet`
    * @constant
    */
  var image: ImageValue = js.native
  
  /**
    * @constant
    */
  val jsxAttributes: Style = js.native
  
  /**
    * The style of presentation for this item in the `ActionSheet`. With the style `cancel` or
    * `destructive` are displayed in a special way.
    * Note: On iPad, an action with style `cancel` will not be shown in the ActionSheet as per [Apple's
    * design
    * approach](https://developer.apple.com/documentation/uikit/windows_and_screens/getting_the_user_s_attention_with_alerts_and_action_sheets).
    * If such button is added tapping outside of ActionSheet is equivalent to pressing the `cancel` action
    * on iPad. In case of tapping outside an appropriate event will be sent by the native side as if such
    * button was pressed
    * @constant
    */
  var style: default | cancel | destructive = js.native
  
  /**
    * The text to be displayed for this item in the `ActionSheet`.
    * @constant
    */
  var title: String = js.native
}
