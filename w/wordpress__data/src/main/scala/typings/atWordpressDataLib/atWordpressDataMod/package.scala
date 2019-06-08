package typings
package atWordpressDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWordpressDataMod {
  type DispatcherMap = stdLib.Record[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  type Plugin[T /* <: stdLib.Record[java.lang.String, _] */] = js.Function2[/* registry */ DataRegistry, /* options */ T, stdLib.Partial[DataRegistry]]
  type SelectorMap = stdLib.Record[java.lang.String, js.Function1[/* repeated */ js.Any, js.Any]]
  type Subscriber = js.Function1[/* callback */ js.Function0[scala.Unit], scala.Unit]
}
