package typings
package atTanemSvgDashInjectorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type DoneCallback = js.Function1[/* elementsLoaded */ scala.Double, scala.Unit]
  type Errback = js.Function2[
    /* error */ stdLib.Error | scala.Null, 
    /* svg */ js.UndefOr[stdLib.Element], 
    scala.Unit
  ]
}
