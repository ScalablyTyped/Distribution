package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Map extends Node {
  /** implicit keys are not wrapped */
  var items: js.Array[Comment | Alias | Scalar | MapItem]
  @JSName("type")
  var type_Map: yamlLib.yamlLibStrings.MAP
}

