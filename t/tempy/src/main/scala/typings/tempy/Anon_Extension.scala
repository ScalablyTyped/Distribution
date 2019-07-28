package typings.tempy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extension extends js.Object {
  /**
  			_You usually won't need this option. Specify it only when actually needed._
  			File extension. Mutually exclusive with the `name` option.
  			*/
  val extension: js.UndefOr[String] = js.undefined
}

object Anon_Extension {
  @scala.inline
  def apply(extension: String = null): Anon_Extension = {
    val __obj = js.Dynamic.literal()
    if (extension != null) __obj.updateDynamic("extension")(extension)
    __obj.asInstanceOf[Anon_Extension]
  }
}

