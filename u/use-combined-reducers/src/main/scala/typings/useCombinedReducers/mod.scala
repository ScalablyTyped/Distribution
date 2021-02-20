package typings.useCombinedReducers

import typings.react.mod.Dispatch
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-combined-reducers", JSImport.Default)
  @js.native
  def default[T, A](
    combinedReducers: Record[
      /* keyof T */ String, 
      js.Tuple2[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
        Dispatch[A]
      ]
    ]
  ): js.Tuple2[T, js.Function1[/* action */ A, Unit]] = js.native
}
