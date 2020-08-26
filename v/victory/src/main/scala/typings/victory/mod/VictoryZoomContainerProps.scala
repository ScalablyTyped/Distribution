package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.victory.victoryStrings.all
import typings.victory.victoryStrings.disable
import typings.victory.victoryStrings.none
import typings.victory.victoryStrings.x
import typings.victory.victoryStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VictoryZoomContainerProps extends VictoryContainerProps {
  /**
    * The optional allowPan prop accepts a boolean that enables the panning
    * functionality. Zooming will still be enabled when the allowPan prop is set to false.
    * @default true
    */
  var allowPan: js.UndefOr[Boolean] = js.native
  /**
    * The optional allowZoom prop accepts a boolean that enables the zoom
    * functionality. Panning will still be enabled when the allowZoom prop is set to false.
    * @default true
    */
  var allowZoom: js.UndefOr[Boolean] = js.native
  /**
    * The brushStyle adds custom styles to the brushComponent. This prop
    * should be given as an object of SVG style attributes.
    * @default "brushStyle={{ stroke: 'transparent', fill: 'black', fillOpacity: 0.1 }}"
    */
  var brushStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * VictoryZoomContainer works by clipping data outside of a given domain.
    * VictoryZoomContainer uses VictoryClipContainer by default.
    * This prop should not be replaced with a custom component, but you may want to set
    * props on VictoryClipContainer, such as clipPadding.
    * @example clipContainerComponent={<VictoryClipContainer clipPadding={{top: 10, right: 10}}}/>}
    */
  var clipContainerComponent: js.UndefOr[ReactElement] = js.native
  /**
    * The defaultBrushArea prop specifies how the container will behave when a
    * region outside the active brush is clicked without selecting a new area. When the
    * prop is set to "all", the entire domain will be selected. When the prop is set to "none",
    * no new region will be selected, and any existing active brush will be cleared. When
    * the prop is set to "disable" the new selected region will default to the current active brush.
    */
  var defaultBrushArea: js.UndefOr[all | none | disable] = js.native
  /**
    * When the disable prop is set to true, VictoryBrushContainer events will not fire.
    */
  var disable: js.UndefOr[Boolean] = js.native
  /**
    * When the disable prop is set to true, VictoryZoomContainer events will not fire.
    */
  var downsample: js.UndefOr[Double | Boolean] = js.native
  /**
    * The minimumZoom prop sets a minimum domain extent for the zoomed chart.
    * When the difference between the maximum and minimum of a zoomed domain is equal to the minimumZoom
    * in either dimension, the component will stop responding to events that would normally trigger zooming in.
    * Zooming out and panning will still be enabled. When this prop is not specified, the default minimum
    * zoom will cover 1 / 1000th of the original domain. This prop should be given as an object
    * with numeric values for x and y.
    * @example minimumZoom={{x: 1, y: 0.01}}
    */
  var minimumZoom: js.UndefOr[CursorData] = js.native
  /**
    * The optional onZoomDomainChange prop accepts an function to be called on each update to the visible domain.
    * The function accepts the parameters domain (the updated domain) and props (the props used by VictoryZoomContainer).
    * @example onZoomDomainChange={(domain, props) => handleDomainChange(domain, props)}
    */
  var onZoomDomainChange: js.UndefOr[js.Function2[/* domain */ DomainPropType, /* props */ this.type, Unit]] = js.native
  /**
    * When the zoomDimension prop is set, panning and zooming will be restricted to
    * the given dimension (either x or y), and the domain of the other dimension will
    * remain static. When this prop is not specified, both x and y dimensions will pan and zoom.
    * @example zoomDimension="x"
    */
  var zoomDimension: js.UndefOr[x | y] = js.native
  /**
    * The zoomDomain prop describes the zoomed state. This prop is an object that
    * specifies separate arrays for x and y. Each array is a tuple that describes the
    * minimum and maximum values to render. If this prop is not provided initially, the
    * chart will render without an initial zoom, displaying the entire dataset. Updates to
    * zoomDomain will trigger a re-render of the chart with the new domain.
    * @example zoomDomain={{x: [0, 100]}}
    */
  var zoomDomain: js.UndefOr[DomainPropType] = js.native
}

object VictoryZoomContainerProps {
  @scala.inline
  def apply(): VictoryZoomContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryZoomContainerProps]
  }
  @scala.inline
  implicit class VictoryZoomContainerPropsOps[Self <: VictoryZoomContainerProps] (val x: Self) extends AnyVal {
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
    def setAllowPan(value: Boolean): Self = this.set("allowPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPan: Self = this.set("allowPan", js.undefined)
    @scala.inline
    def setAllowZoom(value: Boolean): Self = this.set("allowZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowZoom: Self = this.set("allowZoom", js.undefined)
    @scala.inline
    def setBrushStyle(value: CSSProperties): Self = this.set("brushStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrushStyle: Self = this.set("brushStyle", js.undefined)
    @scala.inline
    def setClipContainerComponent(value: ReactElement): Self = this.set("clipContainerComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipContainerComponent: Self = this.set("clipContainerComponent", js.undefined)
    @scala.inline
    def setDefaultBrushArea(value: all | none | disable): Self = this.set("defaultBrushArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultBrushArea: Self = this.set("defaultBrushArea", js.undefined)
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setDownsample(value: Double | Boolean): Self = this.set("downsample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownsample: Self = this.set("downsample", js.undefined)
    @scala.inline
    def setMinimumZoom(value: CursorData): Self = this.set("minimumZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumZoom: Self = this.set("minimumZoom", js.undefined)
    @scala.inline
    def setOnZoomDomainChange(value: (/* domain */ DomainPropType, VictoryZoomContainerProps) => Unit): Self = this.set("onZoomDomainChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnZoomDomainChange: Self = this.set("onZoomDomainChange", js.undefined)
    @scala.inline
    def setZoomDimension(value: typings.victory.victoryStrings.x | y): Self = this.set("zoomDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomDimension: Self = this.set("zoomDimension", js.undefined)
    @scala.inline
    def setZoomDomain(value: DomainPropType): Self = this.set("zoomDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomDomain: Self = this.set("zoomDomain", js.undefined)
  }
  
}

