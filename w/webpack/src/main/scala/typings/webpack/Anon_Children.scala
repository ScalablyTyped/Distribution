package typings.webpack

import typings.std.Record
import typings.webpack.webpackMod.Stats.FnModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Array[Double]
  var childrenByOrder: Record[String, js.Array[Double]]
  var entry: Boolean
  var files: js.Array[String]
  var filteredModules: js.UndefOr[Double] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var id: Double | String
  var initial: Boolean
  var modules: js.UndefOr[js.Array[FnModules]] = js.undefined
  var names: js.Array[String]
  var origins: js.UndefOr[js.Array[Anon_Loc]] = js.undefined
  var parents: js.Array[Double]
  var reason: js.UndefOr[String] = js.undefined
  var recorded: js.UndefOr[Boolean] = js.undefined
  var rendered: Boolean
  var siblings: js.Array[Double]
  var size: Double
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[Double],
    childrenByOrder: Record[String, js.Array[Double]],
    entry: Boolean,
    files: js.Array[String],
    id: Double | String,
    initial: Boolean,
    names: js.Array[String],
    parents: js.Array[Double],
    rendered: Boolean,
    siblings: js.Array[Double],
    size: Double,
    filteredModules: Int | Double = null,
    hash: String = null,
    modules: js.Array[FnModules] = null,
    origins: js.Array[Anon_Loc] = null,
    reason: String = null,
    recorded: js.UndefOr[Boolean] = js.undefined
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, childrenByOrder = childrenByOrder, entry = entry, files = files, id = id.asInstanceOf[js.Any], initial = initial, names = names, parents = parents, rendered = rendered, siblings = siblings, size = size)
    if (filteredModules != null) __obj.updateDynamic("filteredModules")(filteredModules.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (origins != null) __obj.updateDynamic("origins")(origins)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (!js.isUndefined(recorded)) __obj.updateDynamic("recorded")(recorded)
    __obj.asInstanceOf[Anon_Children]
  }
}

