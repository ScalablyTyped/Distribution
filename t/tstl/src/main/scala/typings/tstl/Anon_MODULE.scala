package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MODULE extends js.Object {
  var __MODULE: js.UndefOr[String] = js.undefined
  var name: String
}

object Anon_MODULE {
  @scala.inline
  def apply(name: String, __MODULE: String = null): Anon_MODULE = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (__MODULE != null) __obj.updateDynamic("__MODULE")(__MODULE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MODULE]
  }
}

