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
  
  @scala.inline
  def apply(): NodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeOptions]
  }
  
  @scala.inline
  implicit class NodeOptionsMutableBuilder[Self <: NodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthSelected(value: Double): Self = StObject.set(x, "borderWidthSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthSelectedUndefined: Self = StObject.set(x, "borderWidthSelected", js.undefined)
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setBrokenImage(value: String): Self = StObject.set(x, "brokenImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrokenImageUndefined: Self = StObject.set(x, "brokenImage", js.undefined)
    
    @scala.inline
    def setColor(value: String | Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean | X): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setFont(value: String | Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIcon(value: Code): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImage(value: String | Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHighlightBold(value: Boolean): Self = StObject.set(x, "labelHighlightBold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHighlightBoldUndefined: Self = StObject.set(x, "labelHighlightBold", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setPhysics(value: Boolean): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    @scala.inline
    def setScaling(value: OptionsScaling): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    @scala.inline
    def setShadow(value: Boolean | OptionsShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeProperties(value: BorderDashes): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidthConstraint(value: Double | Boolean | Maximum): Self = StObject.set(x, "widthConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthConstraintUndefined: Self = StObject.set(x, "widthConstraint", js.undefined)
    
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
