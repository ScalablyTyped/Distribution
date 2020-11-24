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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryBrushContainerProps extends VictoryContainerProps {
  
  /**
    * The optional allowDrag prop accepts a boolean that enables dragging behavior
    * for the highlighted brush area. Resizing will still be enabled when the allowDrag
    * prop is set to false.
    * @default true
    */
  var allowDrag: js.UndefOr[Boolean] = js.native
  
  /**
    * The optional allowResize prop accepts a boolean that enables resizing the
    * highlighted brush area. Dragging will still be enabled when the allowResize
    * prop is set to false, but the dimensions of the brush area will be fixed.
    * @default true
    */
  var allowResize: js.UndefOr[Boolean] = js.native
  
  /**
    * The brushComponent prop specifies the component to be rendered for the
    * highlighted area. This component will be supplied with the following props: x, y,
    * width, height, and style. When this prop is not specified, a <rect/> will be rendered.
    * @default brushComponent={<rect/>}
    */
  var brushComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * When the brushDimension prop is set, brushing will only be specific to the to
    * the given dimension (either "x" or "y"), and the entire domain of the other
    * dimension will be highlighted. When this prop is not specified, highlighting will
    * occur along both dimensions.
    * @example brushDimension="x"
    */
  var brushDimension: js.UndefOr[x | y] = js.native
  
  /**
    * The optional brushDomain prop describes the highlighted state. This prop is an
    * object that specifies separate arrays for x and y. Each array is a tuple that
    * describes the minimum and maximum values to render. If this prop is not provided
    * initially, the chart will render with the entire domain highlighted. When this prop
    * changes, the chart will render with a new highlighted domain.
    * @example brushDomain={{ x: [50, 100], y: [0, 100] }}
    */
  var brushDomain: js.UndefOr[DomainPropType] = js.native
  
  /**
    * The brushStyle adds custom styles to the brushComponent. This prop
    * should be given as an object of SVG style attributes.
    * @default "brushStyle={{ stroke: "transparent", fill: "black", fillOpacity: 0.1 }}"
    */
  var brushStyle: js.UndefOr[CSSProperties] = js.native
  
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
    * The handleComponent prop specifies the component to be rendered for each
    * handle for the highlighted area. This component will be supplied with the following
    * props: x, y, width, height, cursor, and style. When this prop is not
    * specified, a <rect/> will be rendered.
    * @default handleComponent={<rect/>}
    */
  var handleComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The handleStyle adds custom styles to the handleComponents. This prop should be given as an object of SVG style attributes.
    *
    * Handles refer to the region on each highlighted area where the area may be
    * expanded. Only handles relevant to the given dimension will be rendered. For
    * example, when brushDimension="x" only "left" and "right" handles will be
    * rendered. Handles are automatically styled with cursors appropriate to their orientation.
    * @default "handleStyle={{ stroke: 'transparent', fill: 'transparent' }}"
    */
  var handleStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The optional onBrushDomainChange prop accepts an function to be called on
    * each update to the highlighted domain. The function accepts the parameters of
    * domain (the updated domain), and props (the props used by VictoryBrushContainer).
    * @example onBrushDomainChange={(domain, props) => handleDomainChange(domain, props)}
    */
  var onBrushDomainChange: js.UndefOr[js.Function2[/* domain */ DomainPropType, /* props */ this.type, Unit]] = js.native
}
object VictoryBrushContainerProps {
  
  @scala.inline
  def apply(): VictoryBrushContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBrushContainerProps]
  }
  
  @scala.inline
  implicit class VictoryBrushContainerPropsOps[Self <: VictoryBrushContainerProps] (val x: Self) extends AnyVal {
    
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
    def setAllowDrag(value: Boolean): Self = this.set("allowDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDrag: Self = this.set("allowDrag", js.undefined)
    
    @scala.inline
    def setAllowResize(value: Boolean): Self = this.set("allowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResize: Self = this.set("allowResize", js.undefined)
    
    @scala.inline
    def setBrushComponent(value: ReactElement): Self = this.set("brushComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushComponent: Self = this.set("brushComponent", js.undefined)
    
    @scala.inline
    def setBrushDimension(value: typings.victory.victoryStrings.x | y): Self = this.set("brushDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushDimension: Self = this.set("brushDimension", js.undefined)
    
    @scala.inline
    def setBrushDomain(value: DomainPropType): Self = this.set("brushDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushDomain: Self = this.set("brushDomain", js.undefined)
    
    @scala.inline
    def setBrushStyle(value: CSSProperties): Self = this.set("brushStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushStyle: Self = this.set("brushStyle", js.undefined)
    
    @scala.inline
    def setDefaultBrushArea(value: all | none | disable): Self = this.set("defaultBrushArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBrushArea: Self = this.set("defaultBrushArea", js.undefined)
    
    @scala.inline
    def setDisable(value: Boolean): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setHandleComponent(value: ReactElement): Self = this.set("handleComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleComponent: Self = this.set("handleComponent", js.undefined)
    
    @scala.inline
    def setHandleStyle(value: CSSProperties): Self = this.set("handleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleStyle: Self = this.set("handleStyle", js.undefined)
    
    @scala.inline
    def setOnBrushDomainChange(value: (/* domain */ DomainPropType, VictoryBrushContainerProps) => Unit): Self = this.set("onBrushDomainChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnBrushDomainChange: Self = this.set("onBrushDomainChange", js.undefined)
  }
}
