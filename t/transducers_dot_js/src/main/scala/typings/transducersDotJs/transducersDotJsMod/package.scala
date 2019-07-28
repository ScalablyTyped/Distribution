package typings.transducersDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transducersDotJsMod {
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  type Transducer[TInput, TOutput] = js.Function1[/* xf */ Transformer[js.Any, TOutput], Transformer[js.Any, TInput]]
  type Transformer[TResult, TInput] = CompletingTransformer[TResult, TResult, TInput]
}
