package typings.victory.mod

import typings.react.mod.ReactElement
import typings.victory.anon.`0`
import typings.victory.victoryStrings.bottom
import typings.victory.victoryStrings.left
import typings.victory.victoryStrings.right
import typings.victory.victoryStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlyoutProps
  extends StObject
     with VictoryCommonProps {
  
  /**
    * a flag signifying whether the component is active
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the center coordinates of the flyout
    */
  var center: js.UndefOr[`0`] = js.undefined
  
  /**
    * the class name that will be applied to the rendered element
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * the corner radius of the flyout
    */
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * the entire dataset if applicable
    */
  var data: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * the data point corresponding to this flyout if applicable
    */
  var datum: js.UndefOr[js.Object] = js.undefined
  
  /**
    * offset in the x dimension.
    */
  var dx: js.UndefOr[Double] = js.undefined
  
  /**
    * offset in the y dimension.
    */
  var dy: js.UndefOr[Double] = js.undefined
  
  /**
    * events to attach to the rendered element
    */
  var events: js.UndefOr[js.Object] = js.undefined
  
  /**
    * an id to apply to the rendered component
    */
  var id: js.UndefOr[String | Double] = js.undefined
  
  /**
    * the index of this flyout within the dataset
    */
  var index: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[top | bottom | left | right] = js.undefined
  
  /**
    * the svg coordinates of the center point of a polar chart
    */
  var origin: js.UndefOr[js.Object] = js.undefined
  
  /**
    * the rendered path element
    * @default pathComponent={<Path/>}
    */
  var pathComponent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * the length of the triangular pointer
    */
  var pointerLength: js.UndefOr[Double] = js.undefined
  
  /**
    * the width of the base of the triangular pointer
    */
  var pointerWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * a flag specifying whether the component is part of a polar chart
    */
  var polar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the aria role to assign to the element
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * the shape rendering attribute to apply to the rendered elements
    */
  var shapeRendering: js.UndefOr[String] = js.undefined
  
  /**
    * the styles to apply to the rendered element
    */
  var style: js.UndefOr[VictoryStyleObject] = js.undefined
  
  /**
    * a transform that will be supplied to elements this component renders
    */
  var transform: js.UndefOr[String] = js.undefined
  
  /**
    * the x coordinate of data point associated with this flyout
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * the y coordinate of data point associated with this flyout
    */
  var y: js.UndefOr[Double] = js.undefined
}
object FlyoutProps {
  
  inline def apply(): FlyoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyoutProps]
  }
  
  extension [Self <: FlyoutProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCenter(value: `0`): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    inline def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setOrientation(value: top | bottom | left | right): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOrigin(value: js.Object): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
    
    inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
    
    inline def setPointerLength(value: Double): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
    
    inline def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
    
    inline def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
    
    inline def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
    
    inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    inline def setStyle(value: VictoryStyleObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
