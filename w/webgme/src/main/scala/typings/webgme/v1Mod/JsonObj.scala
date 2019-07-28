package typings.webgme.v1Mod

import typings.webgme.Anon_Guid
import typings.webgme.GmeCommonNs.RelId
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
  var relids: js.Array[RelId]
  var root: Anon_Guid
}

object JsonObj {
  @scala.inline
  def apply(
    bases: js.Any,
    containment: JsonContainment,
    metaSheets: js.Any,
    nodes: js.Any,
    relids: js.Array[RelId],
    root: Anon_Guid
  ): JsonObj = {
    val __obj = js.Dynamic.literal(bases = bases, containment = containment, metaSheets = metaSheets, nodes = nodes, relids = relids, root = root)
  
    __obj.asInstanceOf[JsonObj]
  }
}

