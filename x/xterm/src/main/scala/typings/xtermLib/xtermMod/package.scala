package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xtermMod {
  type IEvent[T] = js.Function1[/* listener */ js.Function1[/* e */ T, js.Any], IDisposable]
}
