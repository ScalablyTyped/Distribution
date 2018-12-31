package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqBase extends Node {
  /**
    * item is always Node or null when parsed, but can be set to anything.
    */
  var items: js.Array[AstNode | Pair | scala.Null]
  var `type`: js.UndefOr[yamlLib.yamlLibStrings.FLOW_SEQ | yamlLib.yamlLibStrings.SEQ]
}

