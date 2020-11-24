package typings.transducersJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("transducers.js", "reduce")
@js.native
object reduce extends js.Object {
  
  def apply[TResult, TInput](
    coll: StringDictionary[TInput],
    xf: Transformer_[TResult, js.Tuple2[String, TInput]],
    init: TResult
  ): TResult = js.native
  def apply[TResult, TInput](coll: Iterable[TInput], xf: Transformer_[TResult, TInput], init: TResult): TResult = js.native
}
