package typings
package tarnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libPoolMod {
  type Callback[T] = js.Function2[/* err */ stdLib.Error | scala.Null, /* resource */ T, js.Any]
  type CallbackOrPromise[T] = js.Function1[/* cb */ Callback[T], js.Any | js.Function0[js.Promise[T]]]
}
