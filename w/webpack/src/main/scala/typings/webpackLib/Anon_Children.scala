package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Array[scala.Double]
  var childrenByOrder: stdLib.Record[java.lang.String, js.Array[scala.Double]]
  var entry: scala.Boolean
  var files: js.Array[java.lang.String]
  var filteredModules: js.UndefOr[scala.Boolean] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var id: scala.Double
  var initial: scala.Boolean
  var modules: js.UndefOr[js.Array[webpackLib.webpackMod.StatsNs.FnModules]] = js.undefined
  var names: js.Array[java.lang.String]
  var origins: js.UndefOr[js.Array[Anon_Loc]] = js.undefined
  var parents: js.Array[scala.Double]
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var recorded: js.UndefOr[scala.Nothing] = js.undefined
  var rendered: scala.Boolean
  var siblings: js.Array[scala.Double]
  var size: scala.Double
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[scala.Double],
    childrenByOrder: stdLib.Record[java.lang.String, js.Array[scala.Double]],
    entry: scala.Boolean,
    files: js.Array[java.lang.String],
    id: scala.Double,
    initial: scala.Boolean,
    names: js.Array[java.lang.String],
    parents: js.Array[scala.Double],
    rendered: scala.Boolean,
    siblings: js.Array[scala.Double],
    size: scala.Double,
    filteredModules: js.UndefOr[scala.Boolean] = js.undefined,
    hash: java.lang.String = null,
    modules: js.Array[webpackLib.webpackMod.StatsNs.FnModules] = null,
    origins: js.Array[Anon_Loc] = null,
    reason: java.lang.String = null,
    recorded: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, childrenByOrder = childrenByOrder, entry = entry, files = files, id = id, initial = initial, names = names, parents = parents, rendered = rendered, siblings = siblings, size = size)
    if (!js.isUndefined(filteredModules)) __obj.updateDynamic("filteredModules")(filteredModules)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (!js.isUndefined(recorded)) __obj.updateDynamic("recorded")(recorded)
    __obj.asInstanceOf[Anon_Children]
  }
}

