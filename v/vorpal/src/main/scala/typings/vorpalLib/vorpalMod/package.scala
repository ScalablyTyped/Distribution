package typings
package vorpalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vorpalMod {
  type Action = js.Function1[/* args */ Args, js.Promise[scala.Unit]]
  type Cancel = js.Function0[scala.Unit]
}
