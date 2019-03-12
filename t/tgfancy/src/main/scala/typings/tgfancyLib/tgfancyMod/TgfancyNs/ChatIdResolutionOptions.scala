package typings
package tgfancyLib.tgfancyMod.TgfancyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatIdResolutionOptions extends js.Object {
  def resolve(
    token: java.lang.String,
    chatId: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* target */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def resolve(
    token: java.lang.String,
    chatId: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* target */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

