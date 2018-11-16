package typings
package testDashConsoleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object testDashConsoleMod {
  type NoOutputCallback = js.Function0[scala.Unit]
  type Output = js.Array[java.lang.String]
  type OutputCallback = js.Function1[/* output */ Output, scala.Unit]
  type Restore = js.Function0[scala.Unit]
}
