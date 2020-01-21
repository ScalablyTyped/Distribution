package typings.tgfancy.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatIdResolutionOptions extends js.Object {
  def resolve(
    token: String,
    chatId: String,
    callback: js.Function2[/* error */ Error | Null, /* target */ js.Any, Unit]
  ): Unit = js.native
  def resolve(
    token: String,
    chatId: Double,
    callback: js.Function2[/* error */ Error | Null, /* target */ js.Any, Unit]
  ): Unit = js.native
}

