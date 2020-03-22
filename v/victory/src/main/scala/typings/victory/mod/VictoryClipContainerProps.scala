package typings.victory.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactElement
import typings.victory.AnonY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryClipContainerProps extends js.Object {
  /**
    * `VictoryClipContainer` renders a single child, or an array of children in group element.
    */
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  /**
    * The `circleComponent` specifies the element to use when a `VictoryClipContainer` renders
    * a circular clip path. By default, `VictoryClipContainer` uses the `Circle` component.
    * @default circleComponent={<Circle/>}
    */
  var circleComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The `className` prop specifies a class name that will be applied to the rendered element.
    * @example: className="myClipPath"
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The `clipHeight` prop determines the base height of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the height and padding
    * of the parent chart.
    */
  var clipHeight: js.UndefOr[Double] = js.undefined
  /**
    * The `clipId` prop may be used to set a deterministic id for the container.
    * When a `clipId` is not manually set, a unique id will be generated.
    * It is usually necessary to set deterministic ids for automated testing.
    */
  var clipId: js.UndefOr[Double | String] = js.undefined
  /**
    * The `clipPadding` prop is used when the clipped area should be larger than the range of a chart.
    * This prop should be given as an object with `top`, `bottom`, `left`, and `right` properties. Set
    * the `clipPadding` prop is useful for extending the visible area of a chart in some dimension so
    * that data or labels are not cut off.
    */
  var clipPadding: js.UndefOr[BlockProps] = js.undefined
  /**
    * The `clipPathComponent` prop specifies the clip path to apply to the rendered group when appropriate.
    * By default, `VictoryClipContainer` uses the `ClipPath` component.
    * @default clipPathComponent={<ClipPath/>}
    */
  var clipPathComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The `clipWidth` prop determines the base width of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the width and padding
    * of the parent chart.
    */
  var clipWidth: js.UndefOr[Double] = js.undefined
  /**
    * The `events` prop attaches arbitrary event handlers to the group element.
    * This prop should be given as an object of event names and corresponding event handlers.
    * When events are provided via Victory's event system, event handlers will be called with
    * the event, the props of the component it is attached to, and an `eventKey` when applicable.
    * @example events={{onClick: (evt) => alert("x: " + evt.clientX)}}
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.undefined
  /**
    * `VictoryClipContainer` uses the standard `groupComponent` prop.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * Victory components will pass an `origin` prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[AnonY] = js.undefined
  /**
    * Victory components can pass a boolean `polar` prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.undefined
  /**
    * The `radius` prop determines the radius of the circular clip path used for polar charts. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the dimensions and padding
    * of the parent chart.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * The `rectComponent` specifies the element to use when a `VictoryClipContainer` renders a rectangular clip path.
    * By default, `VictoryClipContainer` uses the `Rect` component.
    * @default rectComponent={<Rect/>}
    */
  var rectComponent: js.UndefOr[ReactElement] = js.undefined
  /**
    * The `translateX` prop determines the offset of the clip path from the base x coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateX: js.UndefOr[Double] = js.undefined
  /**
    * The `translateY` prop determines the offset of the clip path from the base y coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateY: js.UndefOr[Double] = js.undefined
}

object VictoryClipContainerProps {
  @scala.inline
  def apply(
    children: ReactElement | js.Array[ReactElement] = null,
    circleComponent: ReactElement = null,
    className: String = null,
    clipHeight: Int | Double = null,
    clipId: Double | String = null,
    clipPadding: BlockProps = null,
    clipPathComponent: ReactElement = null,
    clipWidth: Int | Double = null,
    events: DOMAttributes[_] = null,
    groupComponent: ReactElement = null,
    origin: AnonY = null,
    polar: js.UndefOr[Boolean] = js.undefined,
    radius: Int | Double = null,
    rectComponent: ReactElement = null,
    translateX: Int | Double = null,
    translateY: Int | Double = null
  ): VictoryClipContainerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (circleComponent != null) __obj.updateDynamic("circleComponent")(circleComponent.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clipHeight != null) __obj.updateDynamic("clipHeight")(clipHeight.asInstanceOf[js.Any])
    if (clipId != null) __obj.updateDynamic("clipId")(clipId.asInstanceOf[js.Any])
    if (clipPadding != null) __obj.updateDynamic("clipPadding")(clipPadding.asInstanceOf[js.Any])
    if (clipPathComponent != null) __obj.updateDynamic("clipPathComponent")(clipPathComponent.asInstanceOf[js.Any])
    if (clipWidth != null) __obj.updateDynamic("clipWidth")(clipWidth.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (groupComponent != null) __obj.updateDynamic("groupComponent")(groupComponent.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(polar)) __obj.updateDynamic("polar")(polar.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rectComponent != null) __obj.updateDynamic("rectComponent")(rectComponent.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryClipContainerProps]
  }
}

