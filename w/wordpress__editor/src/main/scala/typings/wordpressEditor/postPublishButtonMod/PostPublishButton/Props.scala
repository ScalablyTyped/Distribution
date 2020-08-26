package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import typings.wordpressEditor.wordpressEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressEditor.postPublishButtonMod.PostPublishButton.SubmitProps
  - typings.wordpressEditor.postPublishButtonMod.PostPublishButton.ToggleProps
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def SubmitProps(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def ToggleProps(isToggle: `true`, onToggle: () => Unit): Props = {
    val __obj = js.Dynamic.literal(isToggle = isToggle.asInstanceOf[js.Any], onToggle = js.Any.fromFunction0(onToggle))
    __obj.asInstanceOf[Props]
  }
}

