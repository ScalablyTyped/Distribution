package typings.tstl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MODULE extends js.Object {
  var __MODULE: js.UndefOr[String] = js.undefined
  var name: String
}

object MODULE {
  @scala.inline
  def apply(name: String, __MODULE: String = null): MODULE = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (__MODULE != null) __obj.updateDynamic("__MODULE")(__MODULE.asInstanceOf[js.Any])
    __obj.asInstanceOf[MODULE]
  }
}

