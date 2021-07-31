package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.victory.anon.XNumber
import typings.victory.victoryStrings.parallel
import typings.victory.victoryStrings.perpendicular
import typings.victory.victoryStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryLabelProps extends StObject {
  
  /**
    * Specifies the angle to rotate the text by.
    */
  var angle: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The capHeight prop defines a text metric for the font being used: the expected height of capital letters.
    * This is necessary because of SVG, which (a) positions the *bottom* of the text at `y`, and (b) has no notion of line height.
    * The value should ideally use the same units as `lineHeight` and `dy`, preferably ems. If given a unitless number, it is assumed to be ems.
    * @default "0.71em"
    */
  var capHeight: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  
  /**
    * The children of this component define the content of the label.
    * This makes using the component similar to normal HTML spans or labels. strings, numbers, and functions of data / value are supported.
    */
  var children: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  
  /**
    * The className prop specifies a class name that will be applied to the rendered text element.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Labels that apply to an entire data series will recieve the entire series as `data` instead of an individual datum prop.
    */
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Victory components can pass a datum prop to their label component. This can be used to calculate functional styles, and determine child text
    */
  var datum: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The dx prop defines a horizontal shift from the `x` coordinate.
    */
  var dx: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  
  /**
    * The dy prop defines a vertical shift from the `y` coordinate.
    * Since this component already accounts for `capHeight`, `lineHeight`, and `verticalAnchor`, this will usually not be necessary.
    */
  var dy: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  
  /**
    * The events prop attaches arbitrary event handlers to the label component.
    * Event handlers are currently only called with their corresponding events.
    */
  var events: js.UndefOr[DOMAttributes[js.Any]] = js.undefined
  
  /**
    * The labelPlacement prop is used to specify the placement of labels relative to the data point they represent.
    * This prop may be given as “vertical”, “parallel” or “perpendicular”. This props is particularly useful in polar
    * charts, where it may be desireable to position a label either parallel or perpendicular to its corresponding angle.
    * When this prop is not set, perpendicular label placement will be used for polar charts, and vertical label
    * placement will be used for cartesian charts.
    */
  var labelPlacement: js.UndefOr[parallel | perpendicular | vertical] = js.undefined
  
  /**
    * The lineHeight prop defines how much space a single line of text should take up.
    * Note that SVG has no notion of line-height, so the positioning may differ slightly from what you would expect with CSS,
    * but the result is similar: a roughly equal amount of extra space is distributed above and below the line of text.
    * The value should ideally use the same units as `capHeight` and `dy`, preferably ems.
    * If given a unitless number, it is assumed to be ems.
    * @default 1
    */
  var lineHeight: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  
  /**
    * Victory components will pass an origin prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[XNumber] = js.undefined
  
  /**
    * Victory components can pass a boolean polar prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The renderInPortal prop specifies whether VictoryLabel should render text in place or within a VictoryPortal.
    * Setting renderInPortal to true is equivalent to wrapping VictoryLabel in a VictoryPortal. This prop is false by default.
    */
  var renderInPortal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.undefined
  
  /**
    * The text prop defines the text VictoryLabel will render. The text prop may be given as a string, number, a function of datum,
    * or an array of any of these. Strings may include newline characters, which VictoryLabel will split into separate
    * <tspan/> elements. When text is given as an array, separate <tspan/> elements will be created for each element in the array.
    */
  var text: js.UndefOr[js.Array[String] | StringOrNumberOrCallback] = js.undefined
  
  /**
    * The textAnchor prop defines how the text is horizontally positioned relative to the given `x` and `y` coordinates.
    */
  var textAnchor: js.UndefOr[TextAnchorType | js.Function0[TextAnchorType]] = js.undefined
  
  /**
    * The transform prop applies a transform to the rendered `<text>` element.
    * In addition to being a string, it can be an object containing transform definitions for easier authoring.
    */
  var transform: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.undefined
  
  /**
    * The verticalAnchor prop defines how the text is vertically positioned relative to the given `x` and `y` coordinates.
    */
  var verticalAnchor: js.UndefOr[VerticalAnchorType | js.Function0[VerticalAnchorType]] = js.undefined
  
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object VictoryLabelProps {
  
  @scala.inline
  def apply(): VictoryLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryLabelProps]
  }
  
  @scala.inline
  implicit class VictoryLabelPropsMutableBuilder[Self <: VictoryLabelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: String | Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setCapHeight(value: StringOrNumberOrCallback): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "capHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
    
    @scala.inline
    def setChildren(value: StringOrNumberOrCallback): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    @scala.inline
    def setDx(value: StringOrNumberOrCallback): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "dx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(value: StringOrNumberOrCallback): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "dy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setEvents(value: DOMAttributes[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setLabelPlacement(value: parallel | perpendicular | vertical): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    @scala.inline
    def setLineHeight(value: StringOrNumberOrCallback): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "lineHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setOrigin(value: XNumber): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    @scala.inline
    def setRenderInPortal(value: Boolean): Self = StObject.set(x, "renderInPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderInPortalUndefined: Self = StObject.set(x, "renderInPortal", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "style", js.Array(value :_*))
    
    @scala.inline
    def setText(value: js.Array[String] | StringOrNumberOrCallback): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchor(value: TextAnchorType | js.Function0[TextAnchorType]): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorFunction0(value: () => TextAnchorType): Self = StObject.set(x, "textAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setTextFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: String | js.Object | (js.Function0[String | js.Object])): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformFunction0(value: () => String | js.Object): Self = StObject.set(x, "transform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setVerticalAnchor(value: VerticalAnchorType | js.Function0[VerticalAnchorType]): Self = StObject.set(x, "verticalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAnchorFunction0(value: () => VerticalAnchorType): Self = StObject.set(x, "verticalAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerticalAnchorUndefined: Self = StObject.set(x, "verticalAnchor", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
