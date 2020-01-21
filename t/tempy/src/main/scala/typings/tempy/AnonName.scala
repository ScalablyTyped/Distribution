package typings.tempy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /**
  			_You usually won't need this option. Specify it only when actually needed._
  			Filename. Mutually exclusive with the `extension` option.
  			*/
  val name: js.UndefOr[String] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(name: String = null): AnonName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

