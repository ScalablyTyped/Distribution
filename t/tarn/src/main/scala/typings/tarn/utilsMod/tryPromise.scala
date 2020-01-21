package typings.tarn.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/lib/utils", "tryPromise")
@js.native
object tryPromise extends js.Object {
  def apply[T](cb: js.Function0[T | js.Thenable[T]]): js.Promise[T] = js.native
}

