package typings.transducersDashJs.transducersDashJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers-js", "reduce")
@js.native
object reduce extends js.Object {
  def apply[TResult, TInput](xf: Reducer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  def apply[TResult, TInput](xf: Reducer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = js.native
  def apply[TResult, TInput](xf: Transformer[TResult, js.Tuple2[String, TInput]], init: TResult, coll: StringDictionary[TInput]): TResult = js.native
  def apply[TResult, TInput](xf: Transformer[TResult, TInput], init: TResult, coll: Iterable[TInput]): TResult = js.native
}

