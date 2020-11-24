package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.victory.anon.XNumber
import typings.victory.victoryStrings.parallel
import typings.victory.victoryStrings.perpendicular
import typings.victory.victoryStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryLabelProps extends js.Object {
  
  /**
    * Specifies the angle to rotate the text by.
    */
  var angle: js.UndefOr[String | Double] = js.native
  
  /**
    * The capHeight prop defines a text metric for the font being used: the expected height of capital letters.
    * This is necessary because of SVG, which (a) positions the *bottom* of the text at `y`, and (b) has no notion of line height.
    * The value should ideally use the same units as `lineHeight` and `dy`, preferably ems. If given a unitless number, it is assumed to be ems.
    * @default "0.71em"
    */
  var capHeight: js.UndefOr[StringOrNumberOrCallback] = js.native
  
  /**
    * The children of this component define the content of the label.
    * This makes using the component similar to normal HTML spans or labels. strings, numbers, and functions of data / value are supported.
    */
  var children: js.UndefOr[StringOrNumberOrCallback] = js.native
  
  /**
    * The className prop specifies a class name that will be applied to the rendered text element.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Labels that apply to an entire data series will recieve the entire series as `data` instead of an individual datum prop.
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Victory components can pass a datum prop to their label component. This can be used to calculate functional styles, and determine child text
    */
  var datum: js.UndefOr[js.Object] = js.native
  
  /**
    * The dx prop defines a horizontal shift from the `x` coordinate.
    */
  var dx: js.UndefOr[StringOrNumberOrCallback] = js.native
  
  /**
    * The dy prop defines a vertical shift from the `y` coordinate.
    * Since this component already accounts for `capHeight`, `lineHeight`, and `verticalAnchor`, this will usually not be necessary.
    */
  var dy: js.UndefOr[StringOrNumberOrCallback] = js.native
  
  /**
    * The events prop attaches arbitrary event handlers to the label component.
    * Event handlers are currently only called with their corresponding events.
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.native
  
  /**
    * The labelPlacement prop is used to specify the placement of labels relative to the data point they represent.
    * This prop may be given as “vertical”, “parallel” or “perpendicular”. This props is particularly useful in polar
    * charts, where it may be desireable to position a label either parallel or perpendicular to its corresponding angle.
    * When this prop is not set, perpendicular label placement will be used for polar charts, and vertical label
    * placement will be used for cartesian charts.
    */
  var labelPlacement: js.UndefOr[parallel | perpendicular | vertical] = js.native
  
  /**
    * The lineHeight prop defines how much space a single line of text should take up.
    * Note that SVG has no notion of line-height, so the positioning may differ slightly from what you would expect with CSS,
    * but the result is similar: a roughly equal amount of extra space is distributed above and below the line of text.
    * The value should ideally use the same units as `capHeight` and `dy`, preferably ems.
    * If given a unitless number, it is assumed to be ems.
    * @default 1
    */
  var lineHeight: js.UndefOr[StringOrNumberOrCallback] = js.native
  
  /**
    * Victory components will pass an origin prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[XNumber] = js.native
  
  /**
    * Victory components can pass a boolean polar prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.native
  
  /**
    * The renderInPortal prop specifies whether VictoryLabel should render text in place or within a VictoryPortal.
    * Setting renderInPortal to true is equivalent to wrapping VictoryLabel in a VictoryPortal. This prop is false by default.
    */
  var renderInPortal: js.UndefOr[Boolean] = js.native
  
  /**
    * The style prop applies CSS properties to the rendered `<text>` element.
    */
  var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
  
  /**
    * The text prop defines the text VictoryLabel will render. The text prop may be given as a string, number, a function of datum,
    * or an array of any of these. Strings may include newline characters, which VictoryLabel will split into separate
    * <tspan/> elements. When text is given as an array, separate <tspan/> elements will be created for each element in the array.
    */
  var text: js.UndefOr[js.Array[String] | StringOrNumberOrCallback] = js.native
  
  /**
    * The textAnchor prop defines how the text is horizontally positioned relative to the given `x` and `y` coordinates.
    */
  var textAnchor: js.UndefOr[TextAnchorType | js.Function0[TextAnchorType]] = js.native
  
  /**
    * The transform prop applies a transform to the rendered `<text>` element.
    * In addition to being a string, it can be an object containing transform definitions for easier authoring.
    */
  var transform: js.UndefOr[String | js.Object | (js.Function0[String | js.Object])] = js.native
  
  /**
    * The verticalAnchor prop defines how the text is vertically positioned relative to the given `x` and `y` coordinates.
    */
  var verticalAnchor: js.UndefOr[VerticalAnchorType | js.Function0[VerticalAnchorType]] = js.native
  
  /**
    * The x prop defines the x coordinate to use as a basis for horizontal positioning.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The y prop defines the y coordinate to use as a basis for vertical positioning.
    */
  var y: js.UndefOr[Double] = js.native
}
object VictoryLabelProps {
  
  @scala.inline
  def apply(): VictoryLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryLabelProps]
  }
  
  @scala.inline
  implicit class VictoryLabelPropsOps[Self <: VictoryLabelProps] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: String | Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setCapHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("capHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCapHeight(value: StringOrNumberOrCallback): Self = this.set("capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapHeight: Self = this.set("capHeight", js.undefined)
    
    @scala.inline
    def setChildrenFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: StringOrNumberOrCallback): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDatum(value: js.Object): Self = this.set("datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatum: Self = this.set("datum", js.undefined)
    
    @scala.inline
    def setDxFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("dx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDx(value: StringOrNumberOrCallback): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDyFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("dy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDy(value: StringOrNumberOrCallback): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setEvents(value: DOMAttributes[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setLabelPlacement(value: parallel | perpendicular | vertical): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    
    @scala.inline
    def setLineHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("lineHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLineHeight(value: StringOrNumberOrCallback): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setOrigin(value: XNumber): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPolar(value: Boolean): Self = this.set("polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar: Self = this.set("polar", js.undefined)
    
    @scala.inline
    def setRenderInPortal(value: Boolean): Self = this.set("renderInPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderInPortal: Self = this.set("renderInPortal", js.undefined)
    
    @scala.inline
    def setStyleVarargs(value: CSSProperties*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: CSSProperties | js.Array[CSSProperties]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setTextFunction1(value: /* args */ CallbackArgs => String | Double): Self = this.set("text", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: js.Array[String] | StringOrNumberOrCallback): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAnchorFunction0(value: () => TextAnchorType): Self = this.set("textAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextAnchor(value: TextAnchorType | js.Function0[TextAnchorType]): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setTransformFunction0(value: () => String | js.Object): Self = this.set("transform", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransform(value: String | js.Object | (js.Function0[String | js.Object])): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setVerticalAnchorFunction0(value: () => VerticalAnchorType): Self = this.set("verticalAnchor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerticalAnchor(value: VerticalAnchorType | js.Function0[VerticalAnchorType]): Self = this.set("verticalAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAnchor: Self = this.set("verticalAnchor", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
