package typings
package unistLib.unistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * Column in a source file (1-indexed integer).
    */
  var column: scala.Double
  /**
    * Line in a source file (1-indexed integer).
    */
  var line: scala.Double
  /**
    * Character in a source file (0-indexed integer).
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
}

