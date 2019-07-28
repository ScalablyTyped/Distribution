package typings.svgDashInjector

import typings.std.Node
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDashInjectorMod {
  type SVGInjector = js.Function3[
    /* elements */ Node | NodeList | js.Array[Node], 
    /* options */ js.UndefOr[SVGInjectorOptions], 
    /* done */ js.UndefOr[js.Function1[/* elementCount */ Double, Unit]], 
    Unit
  ]
}
