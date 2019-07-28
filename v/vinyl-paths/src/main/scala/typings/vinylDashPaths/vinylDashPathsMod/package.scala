package typings.vinylDashPaths

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vinylDashPathsMod {
  type Callback = js.Function1[/* path */ String, js.Any]
  type PathsStatic = js.Function1[/* callback */ js.UndefOr[Callback], Paths]
}
