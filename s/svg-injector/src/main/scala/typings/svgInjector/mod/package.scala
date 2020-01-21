package typings.svgInjector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SVGInjector = js.Function3[
    /* elements */ typings.std.Node | typings.std.NodeList | js.Array[typings.std.Node], 
    /* options */ js.UndefOr[typings.svgInjector.mod.SVGInjectorOptions], 
    /* done */ js.UndefOr[js.Function1[/* elementCount */ scala.Double, scala.Unit]], 
    scala.Unit
  ]
}
