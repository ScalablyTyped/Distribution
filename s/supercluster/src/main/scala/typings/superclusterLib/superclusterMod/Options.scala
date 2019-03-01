package typings
package superclusterLib.superclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[P, C] extends js.Object {
  /**
    * (Tiles) Tile extent. Radius is calculated relative to this value.
    *
    * @default 512
    */
  var extent: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether timing info should be logged.
    *
    * @default false
    */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that returns cluster properties corresponding to a single point.
    *
    * @example
    * (props) => ({sum: props.myValue})
    */
  var map: js.UndefOr[js.Function1[/* props */ P, C]] = js.undefined
  /**
    * Maximum zoom level at which clusters are generated.
    *
    * @default 16
    */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum zoom level at which clusters are generated.
    *
    * @default 0
    */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of the KD-tree leaf node. Affects performance.
    *
    * @default 64
    */
  var nodeSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Cluster radius, in pixels.
    *
    * @default 40
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
    * A reduce function that merges properties of two clusters into one.
    *
    * @example
    * (accumulated, props) => { accumulated.sum += props.sum; }
    */
  var reduce: js.UndefOr[js.Function2[/* accumulated */ C, /* props */ stdLib.Readonly[C], scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply[P, C](
    extent: scala.Int | scala.Double = null,
    log: js.UndefOr[scala.Boolean] = js.undefined,
    map: js.Function1[/* props */ P, C] = null,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    nodeSize: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    reduce: js.Function2[/* accumulated */ C, /* props */ stdLib.Readonly[C], scala.Unit] = null
  ): Options[P, C] = {
    val __obj = js.Dynamic.literal()
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (nodeSize != null) __obj.updateDynamic("nodeSize")(nodeSize.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (reduce != null) __obj.updateDynamic("reduce")(reduce)
    __obj.asInstanceOf[Options[P, C]]
  }
}

