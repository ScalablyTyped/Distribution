package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scalar extends Node {
  /**
    * By default (undefined), numbers use decimal notation.
    * The YAML 1.2 core schema only supports 'HEX' and 'OCT'.
    */
  var format: js.UndefOr[
    yamlLib.yamlLibStrings.BIN | yamlLib.yamlLibStrings.HEX | yamlLib.yamlLibStrings.OCT | yamlLib.yamlLibStrings.TIME
  ]
  var `type`: js.UndefOr[
    yamlLib.yamlLibStrings.BLOCK_FOLDED | yamlLib.yamlLibStrings.BLOCK_LITERAL | yamlLib.yamlLibStrings.PLAIN | yamlLib.yamlLibStrings.QUOTE_DOUBLE | yamlLib.yamlLibStrings.QUOTE_SINGLE
  ]
  var value: scala.Null | scala.Boolean | scala.Double | java.lang.String
}

