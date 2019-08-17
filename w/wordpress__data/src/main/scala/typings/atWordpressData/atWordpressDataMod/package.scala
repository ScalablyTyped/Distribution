package typings.atWordpressData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWordpressDataMod {
  import typings.std.Partial
  import typings.std.Record

  type DispatcherMap = Record[String, js.Function1[/* repeated */ js.Any, js.Any]]
  type Plugin[T /* <: Record[String, _] */] = js.Function2[/* registry */ DataRegistry, /* options */ T, Partial[DataRegistry]]
  type SelectorMap = Record[String, js.Function1[/* repeated */ js.Any, js.Any]]
  type Subscriber = js.Function1[/* callback */ js.Function0[Unit], Unit]
}
