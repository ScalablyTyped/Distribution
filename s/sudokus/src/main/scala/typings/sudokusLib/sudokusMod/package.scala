package typings
package sudokusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sudokusMod {
  type ProgressFn = js.Function1[/* state */ js.Array[js.Array[Cell]], scala.Unit]
}
