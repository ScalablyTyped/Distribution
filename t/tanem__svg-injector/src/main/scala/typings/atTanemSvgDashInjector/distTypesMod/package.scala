package typings.atTanemSvgDashInjector

import typings.std.Element
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type AfterAll = js.Function1[/* elementsLoaded */ Double, Unit]
  type BeforeEach = js.Function1[/* svg */ Element, Unit]
  type Errback = js.Function2[/* error */ Error | Null, /* svg */ js.UndefOr[Element], Unit]
}
