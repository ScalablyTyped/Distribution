package typings
package superclusterLib.superclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * (Tiles) Tile extent. Radius is calculated relative to this value.
    */
  var extent: js.UndefOr[scala.Double] = js.undefined
  /**
    * initial properties of a cluster (before running the reducer)
    *
    * @example
    * function () { return {sum: 0}; }
    */
  var initial: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Whether timing info should be logged.
    */
  var log: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * properties to use for individual points when running the reducer
    *
    * @example
    * function (props) { return {sum: props.my_value}; }
    */
  var map: js.UndefOr[js.Function1[/* props */ js.Any, _]] = js.undefined
  /**
    * Maximum zoom level at which clusters are generated.
    */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum zoom level at which clusters are generated.
    */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of the KD-tree leaf node. Affects performance.
    */
  var nodeSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Cluster radius, in pixels.
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
    * a reduce function for calculating custom cluster properties
    *
    * @example
    * function (accumulated, props) { accumulated.sum += props.sum; }
    */
  var reduce: js.UndefOr[js.Function2[/* accumulated */ js.Any, /* props */ js.Any, scala.Unit]] = js.undefined
}

