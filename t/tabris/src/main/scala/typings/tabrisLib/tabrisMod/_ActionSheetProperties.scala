package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ActionSheet
trait _ActionSheetProperties extends _NativeObjectProperties {
  /**
    * An array of objects describing the actions to be displayed. Each action must have a title and it can
    * also have an image. Actions with the style `cancel` or `destructive` are displayed in a special way.
    */
  var actions: js.Array[tabrisLib.Anon_Cancel]
  /**
    * A descriptive message for the available actions.
    */
  var message: java.lang.String
  /**
    * The title of the action sheet.
    */
  var title: java.lang.String
}

object _ActionSheetProperties {
  @scala.inline
  def apply(actions: js.Array[tabrisLib.Anon_Cancel], message: java.lang.String, title: java.lang.String): _ActionSheetProperties = {
    val __obj = js.Dynamic.literal(actions = actions, message = message, title = title)
  
    __obj.asInstanceOf[_ActionSheetProperties]
  }
}

