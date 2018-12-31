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

