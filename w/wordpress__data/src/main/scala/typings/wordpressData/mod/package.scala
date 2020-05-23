package typings.wordpressData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DispatcherMap = typings.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit]]
  type Plugin[T /* <: typings.std.Record[java.lang.String, _] */] = js.Function2[
    /* registry */ typings.wordpressData.mod.DataRegistry, 
    /* options */ T, 
    typings.wordpressData.anon.PartialDataRegistry
  ]
  type SelectorMap = typings.std.Record[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  type Subscriber = js.Function1[/* callback */ js.Function0[scala.Unit], js.Function0[scala.Unit]]
}
