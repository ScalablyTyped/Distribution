package typings.victory.mod

import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryContainerProps extends StObject {
  
  /**
    * The desc prop specifies the description of the chart/SVG to assist with
    * accessibility for screen readers. The more info about the chart provided in
    * the description, the more usable it will be for people using screen readers.
    * This prop defaults to an empty string.
    * @example "Golden retreivers make up 30%, Labs make up 25%, and other dog breeds are
    * not represented above 5% each."
    * @default ""
    */
  var desc: js.UndefOr[String] = js.native
  
  /**
    * The events prop attaches arbitrary event handlers to the container component.
    * Event handlers passed from other Victory components are called with their
    * corresponding events as well as scale, style, width, height, and data when
    * applicable. Use the invert method to convert event coordinate information to
    * data. `scale.x.invert(evt.offsetX)`.
    * @examples {{ onClick: (evt) => alert(`x: ${evt.clientX}, y: ${evt.clientY}`)}}
    */
  var events: js.UndefOr[DOMAttributes[_]] = js.native
  
  /**
    * The height props specifies the height the svg viewBox of the container.
    * This value should be given as a number of pixels. If no height prop
    * is given, the height prop from the child component passed will be used.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The responsive prop specifies whether the rendered container should be a responsive container
    * with a viewBox attribute, or a static container with absolute width and height.
    * @default true
    */
  var responsive: js.UndefOr[Boolean] = js.native
  
  /**
    * The style prop specifies styles for your VictoryContainer. Any valid inline style properties
    * will be applied. Height and width should be specified via the height
    * and width props, as they are used to calculate the alignment of
    * components within the container. Styles from the child component will
    * also be passed, if any exist.
    * @examples {border: 1px solid red}
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The title prop specifies the title to be applied to the SVG to assist
    * accessibility for screen readers. The more descriptive this title is, the more
    * useful it will be. If no title prop is passed, it will default to Victory Chart.
    * @example "Popularity of Dog Breeds by Percentage"
    * @default "Victory Chart"
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The width props specifies the width of the svg viewBox of the container
    * This value should be given as a number of pixels. If no width prop
    * is given, the width prop from the child component passed will be used.
    */
  var width: js.UndefOr[Double] = js.native
}
object VictoryContainerProps {
  
  @scala.inline
  def apply(): VictoryContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryContainerProps]
  }
  
  @scala.inline
  implicit class VictoryContainerPropsMutableBuilder[Self <: VictoryContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setEvents(value: DOMAttributes[_]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
