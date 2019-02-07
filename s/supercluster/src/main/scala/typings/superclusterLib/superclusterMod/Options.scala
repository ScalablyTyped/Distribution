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

