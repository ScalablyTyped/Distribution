package typings.supercluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[P, C] extends js.Object {
  /**
    * (Tiles) Tile extent. Radius is calculated relative to this value.
    *
    * @default 512
    */
  var extent: js.UndefOr[Double] = js.native
  /**
    * Whether timing info should be logged.
    *
    * @default false
    */
  var log: js.UndefOr[Boolean] = js.native
  /**
    * A function that returns cluster properties corresponding to a single point.
    *
    * @example
    * (props) => ({sum: props.myValue})
    */
  var map: js.UndefOr[js.Function1[/* props */ P, C]] = js.native
  /**
    * Maximum zoom level at which clusters are generated.
    *
    * @default 16
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * Minimum zoom level at which clusters are generated.
    *
    * @default 0
    */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * Size of the KD-tree leaf node. Affects performance.
    *
    * @default 64
    */
  var nodeSize: js.UndefOr[Double] = js.native
  /**
    * Cluster radius, in pixels.
    *
    * @default 40
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * A reduce function that merges properties of two clusters into one.
    *
    * @example
    * (accumulated, props) => { accumulated.sum += props.sum; }
    */
  var reduce: js.UndefOr[js.Function2[/* accumulated */ C, /* props */ C, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply[P, C](): Options[P, C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[P, C]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], P, C] (val x: Self with (Options[P, C])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtent(value: Double): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setLog(value: Boolean): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMap(value: /* props */ P => C): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setNodeSize(value: Double): Self = this.set("nodeSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeSize: Self = this.set("nodeSize", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setReduce(value: (/* accumulated */ C, /* props */ C) => Unit): Self = this.set("reduce", js.Any.fromFunction2(value))
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
  }
  
}

