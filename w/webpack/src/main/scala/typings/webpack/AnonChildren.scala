package typings.webpack

import typings.std.Record
import typings.webpack.mod.Stats.FnModules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
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
  var origins: js.UndefOr[js.Array[AnonLoc]] = js.undefined
  var parents: js.Array[Double]
  var reason: js.UndefOr[String] = js.undefined
  var recorded: js.UndefOr[Boolean] = js.undefined
  var rendered: Boolean
  var siblings: js.Array[Double]
  var size: Double
}

object AnonChildren {
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
    origins: js.Array[AnonLoc] = null,
    reason: String = null,
    recorded: js.UndefOr[Boolean] = js.undefined
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], childrenByOrder = childrenByOrder.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], siblings = siblings.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (filteredModules != null) __obj.updateDynamic("filteredModules")(filteredModules.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(recorded)) __obj.updateDynamic("recorded")(recorded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

