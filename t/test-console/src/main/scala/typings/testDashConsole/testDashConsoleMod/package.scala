package typings.testDashConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object testDashConsoleMod {
  type NoOutputCallback = js.Function0[Unit]
  type Output = js.Array[String]
  type OutputCallback = js.Function1[/* output */ Output, Unit]
  type Restore = js.Function0[Unit]
}
