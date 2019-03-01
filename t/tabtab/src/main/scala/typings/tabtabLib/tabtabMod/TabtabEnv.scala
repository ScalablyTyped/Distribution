package typings
package tabtabLib.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabtabEnv extends js.Object {
  /**
    * A Boolean indicating whether we act in "plumbing mode" or not
    */
  var complete: scala.Boolean
  /**
    * The last String word of the line
    */
  var last: java.lang.String
  /**
    * The last word String of partial
    */
  var lastPartial: java.lang.String
  /**
    * The String input line
    */
  var line: java.lang.String
  /**
    * The String part of line preceding cursor position
    */
  var partial: java.lang.String
  /**
    * A Number indicating cursor position
    */
  var point: scala.Double
  /**
    * The String word preceding last
    */
  var prev: java.lang.String
  /**
    * The Number of words in the completed line
    */
  var words: scala.Double
}

object TabtabEnv {
  @scala.inline
  def apply(
    complete: scala.Boolean,
    last: java.lang.String,
    lastPartial: java.lang.String,
    line: java.lang.String,
    partial: java.lang.String,
    point: scala.Double,
    prev: java.lang.String,
    words: scala.Double
  ): TabtabEnv = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("lastPartial")(lastPartial)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("partial")(partial)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("prev")(prev)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[TabtabEnv]
  }
}

