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

trait VictoryBrushContainerProps
  extends StObject
     with VictoryContainerProps {
  
  /**
    * The optional allowDrag prop accepts a boolean that enables dragging behavior
    * for the highlighted brush area. Resizing will still be enabled when the allowDrag
    * prop is set to false.
    * @default true
    */
  var allowDrag: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The optional allowResize prop accepts a boolean that enables resizing the
    * highlighted brush area. Dragging will still be enabled when the allowResize
    * prop is set to false, but the dimensions of the brush area will be fixed.
    * @default true
    */
  var allowResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The brushComponent prop specifies the component to be rendered for the
    * highlighted area. This component will be supplied with the following props: x, y,
    * width, height, and style. When this prop is not specified, a <rect/> will be rendered.
    * @default brushComponent={<rect/>}
    */
  var brushComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * When the brushDimension prop is set, brushing will only be specific to the to
    * the given dimension (either "x" or "y"), and the entire domain of the other
    * dimension will be highlighted. When this prop is not specified, highlighting will
    * occur along both dimensions.
    * @example brushDimension="x"
    */
  var brushDimension: js.UndefOr[x | y] = js.undefined
  
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
  var brushStyle: js.UndefOr[CSSProperties] = js.undefined
  
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
    * The handleComponent prop specifies the component to be rendered for each
    * handle for the highlighted area. This component will be supplied with the following
    * props: x, y, width, height, cursor, and style. When this prop is not
    * specified, a <rect/> will be rendered.
    * @default handleComponent={<rect/>}
    */
  var handleComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The handleStyle adds custom styles to the handleComponents. This prop should be given as an object of SVG style attributes.
    *
    * Handles refer to the region on each highlighted area where the area may be
    * expanded. Only handles relevant to the given dimension will be rendered. For
    * example, when brushDimension="x" only "left" and "right" handles will be
    * rendered. Handles are automatically styled with cursors appropriate to their orientation.
    * @default "handleStyle={{ stroke: 'transparent', fill: 'transparent' }}"
    */
  var handleStyle: js.UndefOr[CSSProperties] = js.undefined
  
  /**
    * The optional onBrushDomainChange prop accepts an function to be called on
    * each update to the highlighted domain. The function accepts the parameters of
    * domain (the updated domain), and props (the props used by VictoryBrushContainer).
    * @example onBrushDomainChange={(domain, props) => handleDomainChange(domain, props)}
    */
  var onBrushDomainChange: js.UndefOr[js.Function2[/* domain */ DomainPropType, /* props */ this.type, Unit]] = js.undefined
}
object VictoryBrushContainerProps {
  
  inline def apply(): VictoryBrushContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBrushContainerProps]
  }
  
  extension [Self <: VictoryBrushContainerProps](x: Self) {
    
    inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
    
    inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
    
    inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
    
    inline def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
    
    inline def setBrushComponent(value: ReactElement): Self = StObject.set(x, "brushComponent", value.asInstanceOf[js.Any])
    
    inline def setBrushComponentUndefined: Self = StObject.set(x, "brushComponent", js.undefined)
    
    inline def setBrushDimension(value: typings.victory.victoryStrings.x | y): Self = StObject.set(x, "brushDimension", value.asInstanceOf[js.Any])
    
    inline def setBrushDimensionUndefined: Self = StObject.set(x, "brushDimension", js.undefined)
    
    inline def setBrushDomain(value: DomainPropType): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setBrushDomainUndefined: Self = StObject.set(x, "brushDomain", js.undefined)
    
    inline def setBrushStyle(value: CSSProperties): Self = StObject.set(x, "brushStyle", value.asInstanceOf[js.Any])
    
    inline def setBrushStyleUndefined: Self = StObject.set(x, "brushStyle", js.undefined)
    
    inline def setDefaultBrushArea(value: all | none | disable): Self = StObject.set(x, "defaultBrushArea", value.asInstanceOf[js.Any])
    
    inline def setDefaultBrushAreaUndefined: Self = StObject.set(x, "defaultBrushArea", js.undefined)
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setHandleComponent(value: ReactElement): Self = StObject.set(x, "handleComponent", value.asInstanceOf[js.Any])
    
    inline def setHandleComponentUndefined: Self = StObject.set(x, "handleComponent", js.undefined)
    
    inline def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
    
    inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
    
    inline def setOnBrushDomainChange(value: (/* domain */ DomainPropType, VictoryBrushContainerProps) => Unit): Self = StObject.set(x, "onBrushDomainChange", js.Any.fromFunction2(value))
    
    inline def setOnBrushDomainChangeUndefined: Self = StObject.set(x, "onBrushDomainChange", js.undefined)
  }
}
