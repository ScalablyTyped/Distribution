package typings.tempy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtension extends js.Object {
  /**
  			_You usually won't need this option. Specify it only when actually needed._
  			File extension. Mutually exclusive with the `name` option.
  			*/
  val extension: js.UndefOr[String] = js.undefined
}

object AnonExtension {
  @scala.inline
  def apply(extension: String = null): AnonExtension = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtension]
  }
}

