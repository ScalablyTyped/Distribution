package typings
package atVimeoPlayerLib.playerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoPromise[Result, Reason]
  extends stdLib.Promise[Result] {
  def apply(): stdLib.Promise[Result] = js.native
  def apply(successCallback: js.Function1[/* promiseValue */ Result, scala.Unit]): stdLib.Promise[Result] = js.native
  def apply(
    successCallback: js.Function1[/* promiseValue */ Result, scala.Unit],
    rejectCallback: js.Function1[/* reasonValue */ Reason, scala.Unit]
  ): stdLib.Promise[Result] = js.native
}

