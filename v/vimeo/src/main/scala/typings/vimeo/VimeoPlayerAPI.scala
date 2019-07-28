package typings.vimeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoPlayerAPI extends js.Object {
  def apply(method: String): js.Any = js.native
  def apply(method: String, callback: js.Function2[/* value */ js.Any, /* player_id */ js.Any, Unit]): js.Any = js.native
  def apply(method: String, value: js.Any): js.Any = js.native
  def apply(method: String, value: js.Array[VimeoParams]): js.Any = js.native
}

