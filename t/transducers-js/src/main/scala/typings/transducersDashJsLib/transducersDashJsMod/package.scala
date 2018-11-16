package typings
package transducersDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transducersDashJsMod {
  type Reducer[TResult, TInput] = js.Function2[/* result */ TResult, /* input */ TInput, TResult]
  type Transformer[TResult, TInput] = CompletingTransformer[TResult, TResult, TInput]
}
