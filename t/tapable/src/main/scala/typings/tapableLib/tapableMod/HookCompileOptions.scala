package typings
package tapableLib.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookCompileOptions extends js.Object {
  var `type`: tapableLib.TapType
}

object HookCompileOptions {
  @scala.inline
  def apply(`type`: tapableLib.TapType): HookCompileOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[HookCompileOptions]
  }
}

