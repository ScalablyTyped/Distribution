package typings.vegaDashTypings.typesSpecConfigMod

import typings.vegaDashTypings.typesSpecEncodeMod.Orientation
import typings.vegaDashTypings.typesSpecLayoutMod.LayoutBounds
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecTitleMod.TitleAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendLayout extends BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] {
  var bottom: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
  var `bottom-left`: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
  var `bottom-right`: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
  var left: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
  var right: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
  var top: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
  var `top-left`: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
  var `top-right`: js.UndefOr[
    BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ]
  ] = js.undefined
}

object LegendLayout {
  @scala.inline
  def apply(
    anchor: TitleAnchor = null,
    bottom: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null,
    `bottom-left`: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null,
    `bottom-right`: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null,
    bounds: LayoutBounds = null,
    center: Boolean | SignalRef = null,
    direction: Orientation | SignalRef = null,
    left: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null,
    margin: Double | SignalRef = null,
    offset: Double | SignalRef = null,
    right: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null,
    top: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null,
    `top-left`: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null,
    `top-right`: BaseLegendLayout[
      Double | SignalRef, 
      Boolean | SignalRef, 
      Orientation | SignalRef, 
      LayoutBounds, 
      TitleAnchor
    ] = null
  ): LegendLayout = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (`bottom-left` != null) __obj.updateDynamic("bottom-left")(`bottom-left`)
    if (`bottom-right` != null) __obj.updateDynamic("bottom-right")(`bottom-right`)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (`top-left` != null) __obj.updateDynamic("top-left")(`top-left`)
    if (`top-right` != null) __obj.updateDynamic("top-right")(`top-right`)
    __obj.asInstanceOf[LegendLayout]
  }
}

