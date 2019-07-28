package typings.tabtab.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabtabEnv extends js.Object {
  /**
    * A Boolean indicating whether we act in "plumbing mode" or not
    */
  var complete: Boolean
  /**
    * The last String word of the line
    */
  var last: String
  /**
    * The last word String of partial
    */
  var lastPartial: String
  /**
    * The String input line
    */
  var line: String
  /**
    * The String part of line preceding cursor position
    */
  var partial: String
  /**
    * A Number indicating cursor position
    */
  var point: Double
  /**
    * The String word preceding last
    */
  var prev: String
  /**
    * The Number of words in the completed line
    */
  var words: Double
}

object TabtabEnv {
  @scala.inline
  def apply(
    complete: Boolean,
    last: String,
    lastPartial: String,
    line: String,
    partial: String,
    point: Double,
    prev: String,
    words: Double
  ): TabtabEnv = {
    val __obj = js.Dynamic.literal(complete = complete, last = last, lastPartial = lastPartial, line = line, partial = partial, point = point, prev = prev, words = words)
  
    __obj.asInstanceOf[TabtabEnv]
  }
}

