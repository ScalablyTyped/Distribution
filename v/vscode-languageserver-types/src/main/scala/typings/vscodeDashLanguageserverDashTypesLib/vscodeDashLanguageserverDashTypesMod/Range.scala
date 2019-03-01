package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
    * The range's end position.
    */
  var end: Position
  /**
    * The range's start position
    */
  var start: Position
}

object Range {
  @scala.inline
  def apply(end: Position, start: Position): Range = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Range]
  }
}

