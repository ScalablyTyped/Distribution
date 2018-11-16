package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCreateRefMod {
  type IRefObject[T] = reactLib.reactMod.ReactNs.RefObject[T] | RefObject[T] | (js.Function1[/* ref */ T | scala.Null, scala.Unit])
}
