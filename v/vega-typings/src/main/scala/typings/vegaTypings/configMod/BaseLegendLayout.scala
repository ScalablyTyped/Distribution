package typings.vegaTypings.configMod

import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.layoutMod.LayoutBounds
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLegendLayout extends js.Object {
  /**
    * The anchor point for legend orient group layout.
    */
  var anchor: js.UndefOr[TitleAnchor | SignalRef] = js.undefined
  /**
    * The bounds calculation to use for legend orient group layout.
    */
  var bounds: js.UndefOr[LayoutBounds] = js.undefined
  /**
    * A flag to center legends within a shared orient group.
    */
  var center: js.UndefOr[Boolean | SignalRef] = js.undefined
  /**
    * The layout direction for legend orient group layout.
    */
  var direction: js.UndefOr[Orientation | SignalRef] = js.undefined
  /**
    * The pixel margin between legends within a orient group.
    */
  var margin: js.UndefOr[Double | SignalRef] = js.undefined
  /**
    * The pixel offset from the chart body for a legend orient group.
    */
  var offset: js.UndefOr[Double | SignalRef] = js.undefined
}

object BaseLegendLayout {
  @scala.inline
  def apply(
    anchor: TitleAnchor | SignalRef = null,
    bounds: LayoutBounds = null,
    center: Boolean | SignalRef = null,
    direction: Orientation | SignalRef = null,
    margin: Double | SignalRef = null,
    offset: Double | SignalRef = null
  ): BaseLegendLayout = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLegendLayout]
  }
}

