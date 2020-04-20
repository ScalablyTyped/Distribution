package typings.webgme.v1Mod

import typings.webgme.AnonGuid
import typings.webgme.GmeCommon.RelId
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
  var root: AnonGuid
}

object JsonObj {
  @scala.inline
  def apply(
    bases: js.Any,
    containment: JsonContainment,
    metaSheets: js.Any,
    nodes: js.Any,
    relids: js.Array[RelId],
    root: AnonGuid
  ): JsonObj = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], containment = containment.asInstanceOf[js.Any], metaSheets = metaSheets.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], relids = relids.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonObj]
  }
}

