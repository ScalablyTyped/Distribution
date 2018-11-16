package typings
package unistLib.unistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Position extends js.Object {
  var end: Point
  /** >= 1 */
  var indent: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var start: Point
}

