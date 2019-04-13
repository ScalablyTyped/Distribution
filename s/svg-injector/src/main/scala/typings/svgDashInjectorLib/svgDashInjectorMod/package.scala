package typings
package svgDashInjectorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object svgDashInjectorMod {
  type SVGInjector = js.Function3[
    /* elements */ stdLib.Node | stdLib.NodeList | js.Array[stdLib.Node], 
    /* options */ js.UndefOr[SVGInjectorOptions], 
    /* done */ js.UndefOr[js.Function1[/* elementCount */ scala.Double, scala.Unit]], 
    scala.Unit
  ]
}
