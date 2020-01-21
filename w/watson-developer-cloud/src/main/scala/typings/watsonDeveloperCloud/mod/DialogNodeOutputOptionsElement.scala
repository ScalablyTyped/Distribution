package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DialogNodeOutputOptionsElement. */
trait DialogNodeOutputOptionsElement extends js.Object {
  /** The user-facing label for the option. */
  var label: String
  /** An object defining the message input to be sent to the Watson Assistant service if the user selects the corresponding option. */
  var value: DialogNodeOutputOptionsElementValue
}

object DialogNodeOutputOptionsElement {
  @scala.inline
  def apply(label: String, value: DialogNodeOutputOptionsElementValue): DialogNodeOutputOptionsElement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DialogNodeOutputOptionsElement]
  }
}

