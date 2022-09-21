package typings.vis.mod

import typings.vis.anon.BorderDashes
import typings.vis.anon.Bottom
import typings.vis.anon.Code
import typings.vis.anon.Maximum
import typings.vis.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeOptions extends StObject {
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var borderWidthSelected: js.UndefOr[Double] = js.undefined
  
  var brokenImage: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String | Color] = js.undefined
  
  var fixed: js.UndefOr[Boolean | X] = js.undefined
  
  var font: js.UndefOr[String | Font] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Code] = js.undefined
  
  var image: js.UndefOr[String | Image] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelHighlightBold: js.UndefOr[Boolean] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Bottom] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var physics: js.UndefOr[Boolean] = js.undefined
  
  var scaling: js.UndefOr[OptionsScaling] = js.undefined
  
  var shadow: js.UndefOr[Boolean | OptionsShadow] = js.undefined
  
  var shape: js.UndefOr[String] = js.undefined
  
  var shapeProperties: js.UndefOr[BorderDashes] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * If false, no widthConstraint is applied. If a number is specified, the minimum and maximum widths of the node are set to the value.
    * The node's label's lines will be broken on spaces to stay below the maximum and the node's width
    * will be set to the minimum if less than the value.
    */
  var widthConstraint: js.UndefOr[Double | Boolean | Maximum] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object NodeOptions {
  
  inline def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  
  extension [Self <: NodeOptions](x: Self) {
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthSelected(value: Double): Self = StObject.set(x, "borderWidthSelected", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthSelectedUndefined: Self = StObject.set(x, "borderWidthSelected", js.undefined)
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBrokenImage(value: String): Self = StObject.set(x, "brokenImage", value.asInstanceOf[js.Any])
    
    inline def setBrokenImageUndefined: Self = StObject.set(x, "brokenImage", js.undefined)
    
    inline def setColor(value: String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFixed(value: Boolean | X): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setFont(value: String | Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIcon(value: Code): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImage(value: String | Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelHighlightBold(value: Boolean): Self = StObject.set(x, "labelHighlightBold", value.asInstanceOf[js.Any])
    
    inline def setLabelHighlightBoldUndefined: Self = StObject.set(x, "labelHighlightBold", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPhysics(value: Boolean): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    inline def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    inline def setScaling(value: OptionsScaling): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def setShadow(value: Boolean | OptionsShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeProperties(value: BorderDashes): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
    
    inline def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidthConstraint(value: Double | Boolean | Maximum): Self = StObject.set(x, "widthConstraint", value.asInstanceOf[js.Any])
    
    inline def setWidthConstraintUndefined: Self = StObject.set(x, "widthConstraint", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
