package typings.vimeoPlayer.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoPromise[Result, Reason] extends Promise[Result] {
  def apply(): js.Promise[Result] = js.native
  def apply(successCallback: js.Function1[/* promiseValue */ Result, Unit]): js.Promise[Result] = js.native
  def apply(
    successCallback: js.Function1[/* promiseValue */ Result, Unit],
    rejectCallback: js.Function1[/* reasonValue */ Reason, Unit]
  ): js.Promise[Result] = js.native
}

