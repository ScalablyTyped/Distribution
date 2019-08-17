package typings.tarn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPoolMod {
  import typings.std.Error

  type Callback[T] = js.Function2[/* err */ Error | Null, /* resource */ T, js.Any]
  type CallbackOrPromise[T] = js.Function1[/* cb */ Callback[T], js.Any | js.Function0[js.Promise[T]]]
}
