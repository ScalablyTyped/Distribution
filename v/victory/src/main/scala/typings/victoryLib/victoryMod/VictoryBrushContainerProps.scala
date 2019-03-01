package typings
package victoryLib.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryBrushContainerProps extends VictoryContainerProps {
  /**
    * The optional allowDrag prop accepts a boolean that enables dragging behavior
    * for the highlighted brush area. Resizing will still be enabled when the allowDrag
    * prop is set to false.
    * @default true
    */
  var allowDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The optional allowResize prop accepts a boolean that enables resizing the
    * highlighted brush area. Dragging will still be enabled when the allowResize
    * prop is set to false, but the dimensions of the brush area will be fixed.
    * @default true
    */
  var allowResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The brushComponent prop specifies the component to be rendered for the
    * highlighted area. This component will be supplied with the following props: x, y,
    * width, height, and style. When this prop is not specified, a <rect/> will be rendered.
    * @default brushComponent={<rect/>}
    */
  var brushComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * When the brushDimension prop is set, brushing will only be specific to the to
    * the given dimension (either "x" or "y"), and the entire domain of the other
    * dimension will be highlighted. When this prop is not specified, highlighting will
    * occur along both dimensions.
    * @example brushDimension="x"
    */
  var brushDimension: js.UndefOr[victoryLib.victoryLibStrings.x | victoryLib.victoryLibStrings.y] = js.undefined
  /**
    * The optional brushDomain prop describes the highlighted state. This prop is an
    * object that specifies separate arrays for x and y. Each array is a tuple that
    * describes the minimum and maximum values to render. If this prop is not provided
    * initially, the chart will render with the entire domain highlighted. When this prop
    * changes, the chart will render with a new highlighted domain.
    * @example brushDomain={{ x: [50, 100], y: [0, 100] }}
    */
  var brushDomain: js.UndefOr[DomainPropType] = js.undefined
  /**
    * The brushStyle adds custom styles to the brushComponent. This prop
    * should be given as an object of SVG style attributes.
    * @default "brushStyle={{ stroke: "transparent", fill: "black", fillOpacity: 0.1 }}"
    */
  var brushStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
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
    * The handleComponent prop specifies the component to be rendered for each
    * handle for the highlighted area. This component will be supplied with the following
    * props: x, y, width, height, cursor, and style. When this prop is not
    * specified, a <rect/> will be rendered.
    * @default handleComponent={<rect/>}
    */
  var handleComponent: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * The handleStyle adds custom styles to the handleComponents. This prop should be given as an object of SVG style attributes.
    *
    * Handles refer to the region on each highlighted area where the area may be
    * expanded. Only handles relevant to the given dimension will be rendered. For
    * example, when brushDimension="x" only "left" and "right" handles will be
    * rendered. Handles are automatically styled with cursors appropriate to their orientation.
    * @default "handleStyle={{ stroke: 'transparent', fill: 'transparent' }}"
    */
  var handleStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * The optional onBrushDomainChange prop accepts an function to be called on
    * each update to the highlighted domain. The function accepts the parameters of
    * domain (the updated domain), and props (the props used by VictoryBrushContainer).
    * @example onBrushDomainChange={(domain, props) => handleDomainChange(domain, props)}
    */
  var onBrushDomainChange: js.UndefOr[
    js.Function2[/* domain */ DomainPropType, /* props */ VictoryBrushContainerProps, scala.Unit]
  ] = js.undefined
}

object VictoryBrushContainerProps {
  @scala.inline
  def apply(
    allowDrag: js.UndefOr[scala.Boolean] = js.undefined,
    allowResize: js.UndefOr[scala.Boolean] = js.undefined,
    brushComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    brushDimension: victoryLib.victoryLibStrings.x | victoryLib.victoryLibStrings.y = null,
    brushDomain: DomainPropType = null,
    brushStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    defaultBrushArea: victoryLib.victoryLibStrings.all | victoryLib.victoryLibStrings.none | victoryLib.victoryLibStrings.disable = null,
    desc: java.lang.String = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    events: reactLib.reactMod.ReactNs.DOMAttributes[_] = null,
    handleComponent: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    handleStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    height: scala.Int | scala.Double = null,
    onBrushDomainChange: js.Function2[/* domain */ DomainPropType, /* props */ VictoryBrushContainerProps, scala.Unit] = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    title: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): VictoryBrushContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDrag)) __obj.updateDynamic("allowDrag")(allowDrag)
    if (!js.isUndefined(allowResize)) __obj.updateDynamic("allowResize")(allowResize)
    if (brushComponent != null) __obj.updateDynamic("brushComponent")(brushComponent)
    if (brushDimension != null) __obj.updateDynamic("brushDimension")(brushDimension.asInstanceOf[js.Any])
    if (brushDomain != null) __obj.updateDynamic("brushDomain")(brushDomain.asInstanceOf[js.Any])
    if (brushStyle != null) __obj.updateDynamic("brushStyle")(brushStyle)
    if (defaultBrushArea != null) __obj.updateDynamic("defaultBrushArea")(defaultBrushArea.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (events != null) __obj.updateDynamic("events")(events)
    if (handleComponent != null) __obj.updateDynamic("handleComponent")(handleComponent)
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onBrushDomainChange != null) __obj.updateDynamic("onBrushDomainChange")(onBrushDomainChange)
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryBrushContainerProps]
  }
}

