package typings.transducersJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  type Transducer[TInput, TOutput] = js.Function1[
    /* xf */ typings.transducersJs.mod.Transformer_[js.Any, TOutput], 
    typings.transducersJs.mod.Transformer_[js.Any, TInput]
  ]
  type Transformer_[TResult, TInput] = typings.transducersJs.mod.CompletingTransformer[TResult, TResult, TInput]
}
