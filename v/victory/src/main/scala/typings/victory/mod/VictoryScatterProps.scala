package typings.victory.mod

import typings.victory.victoryStrings.data
import typings.victory.victoryStrings.labels
import typings.victory.victoryStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryScatterProps
  extends StObject
     with VictoryCommonProps
     with VictoryDatableProps
     with VictoryMultiLabeableProps {
  
  /**
    * The bubbleProperty prop indicates which property of the data object should be used
    * to scale data points in a bubble chart
    */
  var bubbleProperty: js.UndefOr[String] = js.undefined
  
  /**
    * Similar to data accessor props `x` and `y`, this prop may be used to functionally
    * assign eventKeys to data
    */
  var eventKey: js.UndefOr[StringOrNumberOrCallback] = js.undefined
  
  /**
    * The event prop take an array of event objects. Event objects are composed of
    * a target, an eventKey, and eventHandlers. Targets may be any valid style namespace
    * for a given component, so "data" and "labels" are all valid targets for VictoryScatter
    * events. The eventKey may optionally be used to select a single element by index rather than
    * an entire set. The eventHandlers object should be given as an object whose keys are standard
    * event names (i.e. onClick) and whose values are event callbacks. The return value
    * of an event handler is used to modify elemnts. The return value should be given
    * as an object or an array of objects with optional target and eventKey keys,
    * and a mutation key whose value is a function. The target and eventKey keys
    * will default to those corresponding to the element the event handler was attached to.
    * The mutation function will be called with the calculated props for the individual selected
    * element (i.e. a single bar), and the object returned from the mutation function
    * will override the props of the selected element via object assignment.
    * @examples
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
  var events: js.UndefOr[
    js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]
  ] = js.undefined
  
  /**
    * The maxBubbleSize prop sets an upper limit for scaling data points in a bubble chart
    */
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The samples prop specifies how many individual points to plot when plotting
    * y as a function of x. Samples is ignored if x props are provided instead.
    */
  var samples: js.UndefOr[Double] = js.undefined
  
  /**
    * The size prop determines how to scale each data point
    */
  var size: js.UndefOr[Double | (js.Function1[/* data */ js.Any, Double])] = js.undefined
  
  /**
    * The style prop specifies styles for your VictoryScatter. Any valid inline style properties
    * will be applied. Height, width, and padding should be specified via the height,
    * width, and padding props, as they are used to calculate the alignment of
    * components within chart. In addition to normal style properties, angle and verticalAnchor
    * may also be specified via the labels object, and they will be passed as props to
    * VictoryLabel, or any custom labelComponent.
    * @example {data: {fill: "red"}, labels: {fontSize: 12}}
    */
  var style: js.UndefOr[VictoryStyleInterface] = js.undefined
  
  /**
    * The symbol prop determines which symbol should be drawn to represent data points.
    */
  var symbol: js.UndefOr[ScatterSymbolType | (js.Function1[/* data */ js.Any, ScatterSymbolType])] = js.undefined
}
object VictoryScatterProps {
  
  inline def apply(): VictoryScatterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryScatterProps]
  }
  
  extension [Self <: VictoryScatterProps](x: Self) {
    
    inline def setBubbleProperty(value: String): Self = StObject.set(x, "bubbleProperty", value.asInstanceOf[js.Any])
    
    inline def setBubblePropertyUndefined: Self = StObject.set(x, "bubbleProperty", js.undefined)
    
    inline def setEventKey(value: StringOrNumberOrCallback): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    inline def setEventKeyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "eventKey", js.Any.fromFunction1(value))
    
    inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    inline def setEvents(value: js.Array[EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: (EventPropTypeInterface[data | labels | parent, StringOrNumberOrCallback])*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setMaxBubbleSize(value: Double): Self = StObject.set(x, "maxBubbleSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBubbleSizeUndefined: Self = StObject.set(x, "maxBubbleSize", js.undefined)
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSize(value: Double | (js.Function1[/* data */ js.Any, Double])): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeFunction1(value: /* data */ js.Any => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: VictoryStyleInterface): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSymbol(value: ScatterSymbolType | (js.Function1[/* data */ js.Any, ScatterSymbolType])): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolFunction1(value: /* data */ js.Any => ScatterSymbolType): Self = StObject.set(x, "symbol", js.Any.fromFunction1(value))
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
