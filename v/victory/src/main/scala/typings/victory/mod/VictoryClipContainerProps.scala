package typings.victory.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactElement
import typings.victory.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryClipContainerProps extends js.Object {
  
  /**
    * `VictoryClipContainer` renders a single child, or an array of children in group element.
    */
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
  
  /**
    * The `circleComponent` specifies the element to use when a `VictoryClipContainer` renders
    * a circular clip path. By default, `VictoryClipContainer` uses the `Circle` component.
    * @default circleComponent={<Circle/>}
    */
  var circleComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The `className` prop specifies a class name that will be applied to the rendered element.
    * @example: className="myClipPath"
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * The `clipHeight` prop determines the base height of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the height and padding
    * of the parent chart.
    */
  var clipHeight: js.UndefOr[Double] = js.native
  
  /**
    * The `clipId` prop may be used to set a deterministic id for the container.
    * When a `clipId` is not manually set, a unique id will be generated.
    * It is usually necessary to set deterministic ids for automated testing.
    */
  var clipId: js.UndefOr[Double | String] = js.native
  
  /**
    * The `clipPadding` prop is used when the clipped area should be larger than the range of a chart.
    * This prop should be given as an object with `top`, `bottom`, `left`, and `right` properties. Set
    * the `clipPadding` prop is useful for extending the visible area of a chart in some dimension so
    * that data or labels are not cut off.
    */
  var clipPadding: js.UndefOr[BlockProps] = js.native
  
  /**
    * The `clipPathComponent` prop specifies the clip path to apply to the rendered group when appropriate.
    * By default, `VictoryClipContainer` uses the `ClipPath` component.
    * @default clipPathComponent={<ClipPath/>}
    */
  var clipPathComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The `clipWidth` prop determines the base width of the rectangular clip path. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the width and padding
    * of the parent chart.
    */
  var clipWidth: js.UndefOr[Double] = js.native
  
  /**
    * The `events` prop attaches arbitrary event handlers to the group element.
    * This prop should be given as an object of event names and corresponding event handlers.
    * When events are provided via Victory's event system, event handlers will be called with
    * the event, the props of the component it is attached to, and an `eventKey` when applicable.
    * @example events={{onClick: (evt) => alert("x: " + evt.clientX)}}
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.native
  
  /**
    * `VictoryClipContainer` uses the standard `groupComponent` prop.
    * @default groupComponent={<g/>}
    */
  var groupComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * Victory components will pass an `origin` prop is to define the center point in svg coordinates for polar charts.
    * **This prop should not be set manually.**
    */
  var origin: js.UndefOr[`0`] = js.native
  
  /**
    * Victory components can pass a boolean `polar` prop to specify whether a label is part of a polar chart.
    * **This prop should not be set manually.**
    */
  var polar: js.UndefOr[Boolean] = js.native
  
  /**
    * The `radius` prop determines the radius of the circular clip path used for polar charts. This prop should be
    * given as a number. If this prop is not given, it will be calculated based on the dimensions and padding
    * of the parent chart.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * The `rectComponent` specifies the element to use when a `VictoryClipContainer` renders a rectangular clip path.
    * By default, `VictoryClipContainer` uses the `Rect` component.
    * @default rectComponent={<Rect/>}
    */
  var rectComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * The `translateX` prop determines the offset of the clip path from the base x coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateX: js.UndefOr[Double] = js.native
  
  /**
    * The `translateY` prop determines the offset of the clip path from the base y coordinate. This prop
    * should be given as a number. If this prop is not given, it will be calculated based on the padding
    * of the parent chart.
    */
  var translateY: js.UndefOr[Double] = js.native
}
object VictoryClipContainerProps {
  
  @scala.inline
  def apply(): VictoryClipContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryClipContainerProps]
  }
  
  @scala.inline
  implicit class VictoryClipContainerPropsOps[Self <: VictoryClipContainerProps] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: ReactElement | js.Array[ReactElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCircleComponent(value: ReactElement): Self = this.set("circleComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircleComponent: Self = this.set("circleComponent", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClipHeight(value: Double): Self = this.set("clipHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipHeight: Self = this.set("clipHeight", js.undefined)
    
    @scala.inline
    def setClipId(value: Double | String): Self = this.set("clipId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipId: Self = this.set("clipId", js.undefined)
    
    @scala.inline
    def setClipPadding(value: BlockProps): Self = this.set("clipPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPadding: Self = this.set("clipPadding", js.undefined)
    
    @scala.inline
    def setClipPathComponent(value: ReactElement): Self = this.set("clipPathComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipPathComponent: Self = this.set("clipPathComponent", js.undefined)
    
    @scala.inline
    def setClipWidth(value: Double): Self = this.set("clipWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipWidth: Self = this.set("clipWidth", js.undefined)
    
    @scala.inline
    def setEvents(value: DOMAttributes[_]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setGroupComponent(value: ReactElement): Self = this.set("groupComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupComponent: Self = this.set("groupComponent", js.undefined)
    
    @scala.inline
    def setOrigin(value: `0`): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPolar(value: Boolean): Self = this.set("polar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolar: Self = this.set("polar", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRectComponent(value: ReactElement): Self = this.set("rectComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRectComponent: Self = this.set("rectComponent", js.undefined)
    
    @scala.inline
    def setTranslateX(value: Double): Self = this.set("translateX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateX: Self = this.set("translateX", js.undefined)
    
    @scala.inline
    def setTranslateY(value: Double): Self = this.set("translateY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateY: Self = this.set("translateY", js.undefined)
  }
}
