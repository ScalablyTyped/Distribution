package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.victory.victoryStrings.all
import typings.victory.victoryStrings.disable
import typings.victory.victoryStrings.none
import typings.victory.victoryStrings.x
import typings.victory.victoryStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryZoomContainerProps
  extends StObject
     with VictoryContainerProps {
  
  /**
    * The optional allowPan prop accepts a boolean that enables the panning
    * functionality. Zooming will still be enabled when the allowPan prop is set to false.
    * @default true
    */
  var allowPan: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The optional allowZoom prop accepts a boolean that enables the zoom
    * functionality. Panning will still be enabled when the allowZoom prop is set to false.
    * @default true
    */
  var allowZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The brushStyle adds custom styles to the brushComponent. This prop
    * should be given as an object of SVG style attributes.
    * @default "brushStyle={{ stroke: 'transparent', fill: 'black', fillOpacity: 0.1 }}"
    */
  var brushStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * VictoryZoomContainer works by clipping data outside of a given domain.
    * VictoryZoomContainer uses VictoryClipContainer by default.
    * This prop should not be replaced with a custom component, but you may want to set
    * props on VictoryClipContainer, such as clipPadding.
    * @example clipContainerComponent={<VictoryClipContainer clipPadding={{top: 10, right: 10}}}/>}
    */
  var clipContainerComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The defaultBrushArea prop specifies how the container will behave when a
    * region outside the active brush is clicked without selecting a new area. When the
    * prop is set to "all", the entire domain will be selected. When the prop is set to "none",
    * no new region will be selected, and any existing active brush will be cleared. When
    * the prop is set to "disable" the new selected region will default to the current active brush.
    */
  var defaultBrushArea: js.UndefOr[all | none | disable] = js.undefined
  
  /**
    * When the disable prop is set to true, VictoryBrushContainer events will not fire.
    */
  var disable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When the disable prop is set to true, VictoryZoomContainer events will not fire.
    */
  var downsample: js.UndefOr[Double | Boolean] = js.undefined
  
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
  var onZoomDomainChange: js.UndefOr[js.Function2[/* domain */ DomainPropType, /* props */ this.type, Unit]] = js.undefined
  
  /**
    * When the zoomDimension prop is set, panning and zooming will be restricted to
    * the given dimension (either x or y), and the domain of the other dimension will
    * remain static. When this prop is not specified, both x and y dimensions will pan and zoom.
    * @example zoomDimension="x"
    */
  var zoomDimension: js.UndefOr[x | y] = js.undefined
  
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
  
  inline def apply(): VictoryZoomContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryZoomContainerProps]
  }
  
  extension [Self <: VictoryZoomContainerProps](x: Self) {
    
    inline def setAllowPan(value: Boolean): Self = StObject.set(x, "allowPan", value.asInstanceOf[js.Any])
    
    inline def setAllowPanUndefined: Self = StObject.set(x, "allowPan", js.undefined)
    
    inline def setAllowZoom(value: Boolean): Self = StObject.set(x, "allowZoom", value.asInstanceOf[js.Any])
    
    inline def setAllowZoomUndefined: Self = StObject.set(x, "allowZoom", js.undefined)
    
    inline def setBrushStyle(value: CSSProperties): Self = StObject.set(x, "brushStyle", value.asInstanceOf[js.Any])
    
    inline def setBrushStyleUndefined: Self = StObject.set(x, "brushStyle", js.undefined)
    
    inline def setClipContainerComponent(value: ReactElement): Self = StObject.set(x, "clipContainerComponent", value.asInstanceOf[js.Any])
    
    inline def setClipContainerComponentUndefined: Self = StObject.set(x, "clipContainerComponent", js.undefined)
    
    inline def setDefaultBrushArea(value: all | none | disable): Self = StObject.set(x, "defaultBrushArea", value.asInstanceOf[js.Any])
    
    inline def setDefaultBrushAreaUndefined: Self = StObject.set(x, "defaultBrushArea", js.undefined)
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDownsample(value: Double | Boolean): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
    
    inline def setDownsampleUndefined: Self = StObject.set(x, "downsample", js.undefined)
    
    inline def setMinimumZoom(value: CursorData): Self = StObject.set(x, "minimumZoom", value.asInstanceOf[js.Any])
    
    inline def setMinimumZoomUndefined: Self = StObject.set(x, "minimumZoom", js.undefined)
    
    inline def setOnZoomDomainChange(value: (/* domain */ DomainPropType, VictoryZoomContainerProps) => Unit): Self = StObject.set(x, "onZoomDomainChange", js.Any.fromFunction2(value))
    
    inline def setOnZoomDomainChangeUndefined: Self = StObject.set(x, "onZoomDomainChange", js.undefined)
    
    inline def setZoomDimension(value: typings.victory.victoryStrings.x | y): Self = StObject.set(x, "zoomDimension", value.asInstanceOf[js.Any])
    
    inline def setZoomDimensionUndefined: Self = StObject.set(x, "zoomDimension", js.undefined)
    
    inline def setZoomDomain(value: DomainPropType): Self = StObject.set(x, "zoomDomain", value.asInstanceOf[js.Any])
    
    inline def setZoomDomainUndefined: Self = StObject.set(x, "zoomDomain", js.undefined)
  }
}
