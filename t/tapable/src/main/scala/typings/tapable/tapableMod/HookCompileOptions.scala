package typings.tapable.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookCompileOptions extends js.Object {
  var `type`: TapType
}

object HookCompileOptions {
  @scala.inline
  def apply(`type`: TapType): HookCompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HookCompileOptions]
  }
}

