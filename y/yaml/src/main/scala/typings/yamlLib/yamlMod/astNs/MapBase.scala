package typings
package yamlLib.yamlMod.astNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapBase extends Node {
  var items: js.Array[Pair | Merge]
  var `type`: js.UndefOr[yamlLib.yamlLibStrings.FLOW_MAP | yamlLib.yamlLibStrings.MAP]
}

