package typings.stylefire.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var transform: js.UndefOr[String] = js.undefined
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object Transform {
  @scala.inline
  def apply(transform: String = null, transformOrigin: String = null): Transform = {
    val __obj = js.Dynamic.literal()
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

