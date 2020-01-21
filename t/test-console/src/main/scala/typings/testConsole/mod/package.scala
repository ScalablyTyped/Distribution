package typings.testConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NoOutputCallback = js.Function0[scala.Unit]
  type Output = js.Array[java.lang.String]
  type OutputCallback = js.Function1[/* output */ typings.testConsole.mod.Output, scala.Unit]
  type Restore = js.Function0[scala.Unit]
}
