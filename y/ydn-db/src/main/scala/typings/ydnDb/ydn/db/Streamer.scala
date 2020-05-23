package typings.ydnDb.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Streamer extends js.Object {
  def collect(callback: js.Function1[/* values */ js.Array[_], Unit]): js.Any = js.native
  def push(key: js.Any): js.Any = js.native
  def push(key: js.Any, value: js.Any): js.Any = js.native
  def setSink(
    callback: js.Function3[/* key */ js.Any, /* value */ js.Any, /* toWait */ js.Function0[Boolean], Unit]
  ): js.Any = js.native
}

