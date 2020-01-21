package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMODULE extends js.Object {
  var __MODULE: js.UndefOr[String] = js.undefined
  var name: String
}

object AnonMODULE {
  @scala.inline
  def apply(name: String, __MODULE: String = null): AnonMODULE = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (__MODULE != null) __obj.updateDynamic("__MODULE")(__MODULE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMODULE]
  }
}

