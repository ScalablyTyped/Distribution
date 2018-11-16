package typings
package vimeoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoPlayerAPI extends js.Object {
  def apply(method: java.lang.String): js.Any = js.native
  def apply(
    method: java.lang.String,
    callback: js.Function2[/* value */ js.Any, /* player_id */ js.Any, scala.Unit]
  ): js.Any = js.native
  def apply(method: java.lang.String, value: js.Any): js.Any = js.native
  def apply(method: java.lang.String, value: js.Array[VimeoParams]): js.Any = js.native
}

