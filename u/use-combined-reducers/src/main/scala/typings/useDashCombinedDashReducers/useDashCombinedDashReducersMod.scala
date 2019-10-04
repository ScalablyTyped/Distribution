package typings.useDashCombinedDashReducers

import typings.react.reactMod.Dispatch
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-combined-reducers", JSImport.Namespace)
@js.native
object useDashCombinedDashReducersMod extends js.Object {
  def default[T, A](
    combinedReducers: Record[
      String, 
      js.Tuple2[
        /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any, 
        Dispatch[A]
      ]
    ]
  ): js.Tuple2[T, js.Function1[/* action */ A, Unit]] = js.native
}

