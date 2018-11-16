package typings
package tabtabLib.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Holds interesting values to drive the output of the completion.
 */

trait Data extends js.Object {
  /**
       * last word of the line
       */
  var last: java.lang.String
  /**
       * last partial of the line
       */
  var lastPartial: java.lang.String
  /**
       * full command being completed
       */
  var line: java.lang.String
  /**
       * tabing in the middle of a word: foo bar baz bar foobarrrrrrr
       */
  var partial: java.lang.String
  /**
       * cursor position
       */
  var point: scala.Double
  /**
       * the previous word
       */
  var prev: java.lang.String
  /**
       * number of words
       */
  var words: scala.Double
}

