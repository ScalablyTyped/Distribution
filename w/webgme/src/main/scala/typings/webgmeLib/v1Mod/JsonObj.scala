package typings
package webgmeLib.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonObj extends js.Object {
   // guid tree of hashes
  var bases: js.Any
  var containment: JsonContainment
  var metaSheets: js.Any
   //
  var nodes: js.Any
  var relids: js.Array[webgmeLib.GmeCommonNs.RelId]
  var root: webgmeLib.Anon_Guid
}

object JsonObj {
  @scala.inline
  def apply(
    bases: js.Any,
    containment: JsonContainment,
    metaSheets: js.Any,
    nodes: js.Any,
    relids: js.Array[webgmeLib.GmeCommonNs.RelId],
    root: webgmeLib.Anon_Guid
  ): JsonObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bases")(bases)
    __obj.updateDynamic("containment")(containment)
    __obj.updateDynamic("metaSheets")(metaSheets)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("relids")(relids)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[JsonObj]
  }
}

