package typings.vegaDashTypings.typesSpecConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLegendLayout[NS, BS, OS, LB, AN] extends js.Object {
  /**
    * The anchor point for legend orient group layout.
    */
  var anchor: js.UndefOr[AN] = js.undefined
  /**
    * The bounds calculation to use for legend orient group layout.
    */
  var bounds: js.UndefOr[LB] = js.undefined
  /**
    * A flag to center legends within a shared orient group.
    */
  var center: js.UndefOr[BS] = js.undefined
  /**
    * The layout direction for legend orient group layout.
    */
  var direction: js.UndefOr[OS] = js.undefined
  /**
    * The pixel margin between legends within a orient group.
    */
  var margin: js.UndefOr[NS] = js.undefined
  /**
    * The pixel offset from the chart body for a legend orient group.
    */
  var offset: js.UndefOr[NS] = js.undefined
}

object BaseLegendLayout {
  @scala.inline
  def apply[NS, BS, OS, LB, AN](
    anchor: AN = null,
    bounds: LB = null,
    center: BS = null,
    direction: OS = null,
    margin: NS = null,
    offset: NS = null
  ): BaseLegendLayout[NS, BS, OS, LB, AN] = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLegendLayout[NS, BS, OS, LB, AN]]
  }
}

