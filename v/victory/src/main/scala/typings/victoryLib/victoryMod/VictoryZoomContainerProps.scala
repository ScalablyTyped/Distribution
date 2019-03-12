package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryZoomContainerProps extends VictoryContainerProps {
  /**
    * The optional allowPan prop accepts a boolean that enables the panning
    * functionality. Zooming will still be enabled when the allowPan prop is set to false.
    * @default true
    */
  var allowPan: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The optional allowZoom prop accepts a boolean that enables the zoom
    * functionality. Panning will still be enabled when the allowZoom prop is set to false.
    * @default true
    */
  var allowZoom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The brushStyle adds custom styles to the brushComponent. This prop
    * should be given as an object of SVG style attributes.
    * @default "brushStyle={{ stroke: 'transparent', fill: 'black', fillOpacity: 0.1 }}"
    */
  var brushStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * VictoryZoomContainer works by clipping data outside of a given domain.
    * VictoryZoomContainer uses VictoryClipContainer by default.
    * This prop should not be replaced with a custom component, but you may want to set
    * props on VictoryClipContainer, such as clipPadding.
    * @example clipContainerComponent={<VictoryClipContainer clipPadding={{top: 10, right: 10}}}/>}
    */
  var clipContainerComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * The defaultBrushArea prop specifies how the container will behave when a
    * region outside the active brush is clicked without selecting a new area. When the
    * prop is set to "all", the entire domain will be selected. When the prop is set to "none",
    * no new region will be selected, and any existing active brush will be cleared. When
    * the prop is set to "disable" the new selected region will default to the current active brush.
    */
  var defaultBrushArea: js.UndefOr[
    victoryLib.victoryLibStrings.all | victoryLib.victoryLibStrings.none | victoryLib.victoryLibStrings.disable
  ] = js.undefined
  /**
    * When the disable prop is set to true, VictoryBrushContainer events will not fire.
    */
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When the disable prop is set to true, VictoryZoomContainer events will not fire.
    */
  var downsample: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * The minimumZoom prop sets a minimum domain extent for the zoomed chart.
    * When the difference between the maximum and minimum of a zoomed domain is equal to the minimumZoom
    * in either dimension, the component will stop responding to events that would normally trigger zooming in.
    * Zooming out and panning will still be enabled. When this prop is not specified, the default minimum
    * zoom will cover 1 / 1000th of the original domain. This prop should be given as an object
    * with numeric values for x and y.
    * @example minimumZoom={{x: 1, y: 0.01}}
    */
  var minimumZoom: js.UndefOr[CursorData] = js.undefined
  /**
    * The optional onZoomDomainChange prop accepts an function to be called on each update to the visible domain.
    * The function accepts the parameters domain (the updated domain) and props (the props used by VictoryZoomContainer).
    * @example onZoomDomainChange={(domain, props) => handleDomainChange(domain, props)}
    */
  var onZoomDomainChange: js.UndefOr[
    js.Function2[/* domain */ DomainPropType, /* props */ VictoryZoomContainerProps, scala.Unit]
  ] = js.undefined
  /**
    * When the zoomDimension prop is set, panning and zooming will be restricted to
    * the given dimension (either x or y), and the domain of the other dimension will
    * remain static. When this prop is not specified, both x and y dimensions will pan and zoom.
    * @example zoomDimension="x"
    */
  var zoomDimension: js.UndefOr[victoryLib.victoryLibStrings.x | victoryLib.victoryLibStrings.y] = js.undefined
  /**
    * The zoomDomain prop describes the zoomed state. This prop is an object that
    * specifies separate arrays for x and y. Each array is a tuple that describes the
    * minimum and maximum values to render. If this prop is not provided initially, the
    * chart will render without an initial zoom, displaying the entire dataset. Updates to
    * zoomDomain will trigger a re-render of the chart with the new domain.
    * @example zoomDomain={{x: [0, 100]}}
    */
  var zoomDomain: js.UndefOr[DomainPropType] = js.undefined
}

object VictoryZoomContainerProps {
  @scala.inline
  def apply(
    allowPan: js.UndefOr[scala.Boolean] = js.undefined,
    allowZoom: js.UndefOr[scala.Boolean] = js.undefined,
    brushStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    clipContainerComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    defaultBrushArea: victoryLib.victoryLibStrings.all | victoryLib.victoryLibStrings.none | victoryLib.victoryLibStrings.disable = null,
    desc: java.lang.String = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    downsample: scala.Double | scala.Boolean = null,
    events: reactLib.reactMod.ReactNs.DOMAttributes[_] = null,
    height: scala.Int | scala.Double = null,
    minimumZoom: CursorData = null,
    onZoomDomainChange: (/* domain */ DomainPropType, /* props */ VictoryZoomContainerProps) => scala.Unit = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    zoomDimension: victoryLib.victoryLibStrings.x | victoryLib.victoryLibStrings.y = null,
    zoomDomain: DomainPropType = null
  ): VictoryZoomContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPan)) __obj.updateDynamic("allowPan")(allowPan)
    if (!js.isUndefined(allowZoom)) __obj.updateDynamic("allowZoom")(allowZoom)
    if (brushStyle != null) __obj.updateDynamic("brushStyle")(brushStyle)
    if (clipContainerComponent != null) __obj.updateDynamic("clipContainerComponent")(clipContainerComponent)
    if (defaultBrushArea != null) __obj.updateDynamic("defaultBrushArea")(defaultBrushArea.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (downsample != null) __obj.updateDynamic("downsample")(downsample.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (minimumZoom != null) __obj.updateDynamic("minimumZoom")(minimumZoom)
    if (onZoomDomainChange != null) __obj.updateDynamic("onZoomDomainChange")(js.Any.fromFunction2(onZoomDomainChange))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoomDimension != null) __obj.updateDynamic("zoomDimension")(zoomDimension.asInstanceOf[js.Any])
    if (zoomDomain != null) __obj.updateDynamic("zoomDomain")(zoomDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryZoomContainerProps]
  }
}

