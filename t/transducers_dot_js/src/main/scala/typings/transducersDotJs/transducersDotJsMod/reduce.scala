package typings.transducersDotJs.transducersDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "reduce")
@js.native
object reduce extends js.Object {
  def apply[TResult, TInput](coll: StringDictionary[TInput], xf: Transformer[TResult, js.Tuple2[String, TInput]], init: TResult): TResult = js.native
  def apply[TResult, TInput](coll: Iterable[TInput], xf: Transformer[TResult, TInput], init: TResult): TResult = js.native
}

