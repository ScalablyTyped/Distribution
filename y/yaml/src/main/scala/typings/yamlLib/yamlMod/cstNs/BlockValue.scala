package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockValue extends Node {
  var blockIndent: scala.Double | scala.Null
  var chomping: yamlLib.yamlLibStrings.CLIP | yamlLib.yamlLibStrings.KEEP | yamlLib.yamlLibStrings.STRIP
  var header: Range
  val strValue: java.lang.String | scala.Null
  @JSName("type")
  var type_BlockValue: yamlLib.yamlLibStrings.BLOCK_FOLDED | yamlLib.yamlLibStrings.BLOCK_LITERAL
}

