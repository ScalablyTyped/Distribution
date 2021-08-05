package typings.victory.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactElement
import typings.victory.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryClipContainerProps extends StObject {
  
  /**
    * `VictoryClipContainer` renders a single child, or an array of children in group element.
    */
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  
  /**
    * The `circleComponent` specifies the element to use when a `VictoryClipContainer` renders
    * a circular clip path. By default, `VictoryClipContainer` uses the `Circle` component.
    * @default circleComponent={<Circle/>}
    */
  var circleComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The `className` prop specifies a class name that will be applied to the rendered element.
    * @example: className="myClipPath"
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * The `clipHeight` prop determines the base height of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the height and padding
    * of the parent chart.
    */
  var clipHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The `clipId` prop may be used to set a deterministic id for the container.
    * When a `clipId` is not manually set, a unique id will be generated.
    * It is usually necessary to set deterministic ids for automated testing.
    */
  var clipId: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The `clipPadding` prop is used when the clipped area should be larger than the range of a chart.
    * This prop should be given as an object with `top`, `bottom`, `left`, and `right` properties. Set
    * the `clipPadding` prop is useful for extending the visible area of a chart in some dimension so
    * that data or labels are not cut off.
    */
  var clipPadding: js.UndefOr[BlockProps] = js.undefined
  
  /**
    * The `clipPathComponent` prop specifies the clip path to apply to the rendered group when appropriate.
    * By default, `VictoryClipContainer` uses the `ClipPath` component.
    * @default clipPathComponent={<ClipPath/>}
    */
  var clipPathComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The `clipWidth` prop determines the base width of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the width and padding
    * of the parent chart.
    */
  var clipWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The `events` prop attaches arbitrary event handlers to the group element.
    * This prop should be given as an object of event names and corresponding event handlers.
    * When events are provided via Victory's event system, event handlers will be called with
    * the event, the props of the component it is attached to, and an `eventKey` when applicable.
    * @example events={{onClick: (evt) => alert("x: " + evt.clientX)}}
    */
  var events: js.UndefOr[DOMAttributes[js.Any]] = js.undefined
  
  /**
    * `VictoryClipContainer` uses the standard `groupComponent` prop.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Victory components will pass an `origin` prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[`0`] = js.undefined
  
  /**
    * Victory components can pass a boolean `polar` prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The `radius` prop determines the radius of the circular clip path used for polar charts. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the dimensions and padding
    * of the parent chart.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * The `rectComponent` specifies the element to use when a `VictoryClipContainer` renders a rectangular clip path.
    * By default, `VictoryClipContainer` uses the `Rect` component.
    * @default rectComponent={<Rect/>}
    */
  var rectComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * The `translateX` prop determines the offset of the clip path from the base x coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateX: js.UndefOr[Double] = js.undefined
  
  /**
    * The `translateY` prop determines the offset of the clip path from the base y coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateY: js.UndefOr[Double] = js.undefined
}
object VictoryClipContainerProps {
  
  inline def apply(): VictoryClipContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryClipContainerProps]
  }
  
  extension [Self <: VictoryClipContainerProps](x: Self) {
    
    inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setCircleComponent(value: ReactElement): Self = StObject.set(x, "circleComponent", value.asInstanceOf[js.Any])
    
    inline def setCircleComponentUndefined: Self = StObject.set(x, "circleComponent", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClipHeight(value: Double): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
    
    inline def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
    
    inline def setClipId(value: Double | String): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
    
    inline def setClipIdUndefined: Self = StObject.set(x, "clipId", js.undefined)
    
    inline def setClipPadding(value: BlockProps): Self = StObject.set(x, "clipPadding", value.asInstanceOf[js.Any])
    
    inline def setClipPaddingUndefined: Self = StObject.set(x, "clipPadding", js.undefined)
    
    inline def setClipPathComponent(value: ReactElement): Self = StObject.set(x, "clipPathComponent", value.asInstanceOf[js.Any])
    
    inline def setClipPathComponentUndefined: Self = StObject.set(x, "clipPathComponent", js.undefined)
    
    inline def setClipWidth(value: Double): Self = StObject.set(x, "clipWidth", value.asInstanceOf[js.Any])
    
    inline def setClipWidthUndefined: Self = StObject.set(x, "clipWidth", js.undefined)
    
    inline def setEvents(value: DOMAttributes[js.Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
    
    inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    
    inline def setOrigin(value: `0`): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRectComponent(value: ReactElement): Self = StObject.set(x, "rectComponent", value.asInstanceOf[js.Any])
    
    inline def setRectComponentUndefined: Self = StObject.set(x, "rectComponent", js.undefined)
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
    
    inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
  }
}
