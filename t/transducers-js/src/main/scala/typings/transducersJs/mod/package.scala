package typings.transducersJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  type Transformer[TResult, TInput] = typings.transducersJs.mod.CompletingTransformer[TResult, TResult, TInput]
}
