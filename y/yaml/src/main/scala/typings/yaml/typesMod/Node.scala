package typings.yaml.typesMod

import typings.yaml.utilMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml/types", "Node")
@js.native
class Node () extends js.Object {
  /** A comment on or immediately after this */
  var comment: js.UndefOr[String | Null] = js.native
  /** A comment before this */
  var commentBefore: js.UndefOr[String | Null] = js.native
  /** Only available when `keepCstNodes` is set to `true` */
  var cstNode: js.UndefOr[typings.yaml.parseCstMod.CST.Node] = js.native
  /**
    * The [start, end] range of characters of the source parsed
    * into this node (undefined for pairs or if not parsed)
    */
  var range: js.UndefOr[(js.Tuple2[Double, Double]) | Null] = js.native
  /** A blank line before this node and its commentBefore */
  var spaceBefore: js.UndefOr[Boolean] = js.native
  /** A fully qualified tag, if required */
  var tag: js.UndefOr[String] = js.native
  /** The type of this node */
  var `type`: js.UndefOr[Type | typings.yaml.typesMod.Pair.Type] = js.native
  /** A plain JS representation of this node */
  def toJSON(): js.Any = js.native
  def toJSON(arg: js.Any): js.Any = js.native
}

