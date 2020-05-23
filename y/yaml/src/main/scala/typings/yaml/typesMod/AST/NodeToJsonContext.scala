package typings.yaml.typesMod.AST

import org.scalablytyped.runtime.StringDictionary
import typings.yaml.mod.Document
import typings.yaml.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeToJsonContext
  extends /* key */ StringDictionary[js.Any] {
  var anchors: js.UndefOr[js.Array[_]] = js.undefined
  var doc: Document
  var keep: js.UndefOr[Boolean] = js.undefined
  var mapAsMap: js.UndefOr[Boolean] = js.undefined
  var maxAliasCount: js.UndefOr[Double] = js.undefined
  var onCreate: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
}

object NodeToJsonContext {
  @scala.inline
  def apply(
    doc: Document,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    anchors: js.Array[_] = null,
    keep: js.UndefOr[Boolean] = js.undefined,
    mapAsMap: js.UndefOr[Boolean] = js.undefined,
    maxAliasCount: js.UndefOr[Double] = js.undefined,
    onCreate: /* node */ Node => Unit = null
  ): NodeToJsonContext = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (anchors != null) __obj.updateDynamic("anchors")(anchors.asInstanceOf[js.Any])
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mapAsMap)) __obj.updateDynamic("mapAsMap")(mapAsMap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAliasCount)) __obj.updateDynamic("maxAliasCount")(maxAliasCount.get.asInstanceOf[js.Any])
    if (onCreate != null) __obj.updateDynamic("onCreate")(js.Any.fromFunction1(onCreate))
    __obj.asInstanceOf[NodeToJsonContext]
  }
}

