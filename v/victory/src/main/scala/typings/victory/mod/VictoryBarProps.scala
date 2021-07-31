package typings.victory.mod

import typings.victory.anon.Bottom
import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.end
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.middle
import typings.victory.victoryStrings.parent
import typings.victory.victoryStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryBarProps
  extends StObject
     with VictoryCommonProps
     with VictoryDatableProps
     with VictoryMultiLabeableProps {
  
  /**
    * The alignment prop specifies how bars should be aligned relative to their data points.
    * This prop may be given as “start”, “middle” or “end”. When this prop is not specified,
    * bars will have “middle” alignment relative to their data points.
    */
  var alignment: js.UndefOr[start | middle | end] = js.undefined
  
  /**
    * The barRatio prop specifies an approximate ratio between bar widths and spaces between bars.
    * When width is not specified via the barWidth prop or in bar styles, the barRatio prop will
    * be used to calculate a default width for each bar given the total number of bars in the data series
    * and the overall width of the chart.
    */
  var barRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * The barWidth prop is used to specify the width of each bar. This prop may be given as
    * a number of pixels or as a function that returns a number. When this prop is given as
    * a function, it will be evaluated with the arguments datum, and active. When this value
    * is not given, a default value will be calculated based on the overall dimensions of
    * the chart, and the number of bars.
    */
  var barWidth: js.UndefOr[NumberOrCallback] = js.undefined
  
  /**
    * The cornerRadius prop specifies a radius to apply to each bar.
    * If this prop is given as a single number, the radius will only be applied to the top of each bar.
    * When this prop is given as a function, it will be evaluated with the arguments datum, and active.
    */
  var cornerRadius: js.UndefOr[NumberOrCallback | Bottom] = js.undefined
  
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryBar events.
    * The eventKey may optionally be used to select a single element by index rather than an entire
    * set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @example
    * events={[
    *   {
    *     target: "data",
    *     eventKey: "thisOne",
    *     eventHandlers: {
    *       onClick: () => {
    *         return [
    *            {
    *              eventKey: "theOtherOne",
    *              mutation: (props) => {
    *                return {style: merge({}, props.style, {fill: "orange"})};
    *              }
    *            }, {
    *              eventKey: "theOtherOne",
    *              target: "labels",
    *              mutation: () => {
    *                return {text: "hey"};
    *              }
    *            }
    *          ];
    *       }
    *     }
    *   }
    * ]}
    */
  var events: js.UndefOr[js.Array[EventPropTypeInterface[data | labels | parent, Double | String]]] = js.undefined
  
  /**
    * The style prop specifies styles for your VictoryBar. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. In addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @example {data: {fill: "red", width: 8}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
}
object VictoryBarProps {
  
  @scala.inline
  def apply(): VictoryBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBarProps]
  }
  
  @scala.inline
  implicit class VictoryBarPropsMutableBuilder[Self <: VictoryBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: start | middle | end): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setBarRatio(value: Double): Self = StObject.set(x, "barRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarRatioUndefined: Self = StObject.set(x, "barRatio", js.undefined)
    
    @scala.inline
    def setBarWidth(value: NumberOrCallback): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarWidthFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "barWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: NumberOrCallback | Bottom): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "cornerRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setEventKey(value: StringOrNumberOrCallback): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "eventKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, Double | String]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, Double | String])*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: VictoryStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
