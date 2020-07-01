package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestObjectsMod {
  type NumberRequest[T, S] = S | js.Array[S] | (typings.vexdb.requestObjectsMod.NumberRequestValidatorFunction[T, S])
  type NumberRequestValidatorFunction[T, S] = js.Function2[/* itemValue */ S, /* item */ T, js.Promise[scala.Boolean] | scala.Boolean]
  type StringRequest[T, S] = S | js.Array[S] | typings.std.RegExp | (typings.vexdb.requestObjectsMod.StringRequestValidatorFunction[T, S])
  type StringRequestValidatorFunction[T, S] = js.Function2[/* itemValue */ S, /* item */ T, js.Promise[scala.Boolean] | scala.Boolean]
}
