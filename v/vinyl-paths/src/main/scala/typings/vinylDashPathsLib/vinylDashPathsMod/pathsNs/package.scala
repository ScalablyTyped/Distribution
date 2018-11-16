package typings
package vinylDashPathsLib.vinylDashPathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathsNs {
  type Callback = js.Function1[/* path */ java.lang.String, js.Any]
  type PathsStatic = js.Function1[/* callback */ js.UndefOr[Callback], Paths]
}
