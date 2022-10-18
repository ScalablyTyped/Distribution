package typings.vis.mod

import typings.vis.anon.Angle
import typings.vis.anon.Enabled
import typings.vis.anon.From
import typings.vis.anon.Maximum
import typings.vis.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeOptions extends StObject {
  
  var arrowStrikethrough: js.UndefOr[Boolean] = js.undefined
  
  var arrows: js.UndefOr[String | From] = js.undefined
  
  var chosen: js.UndefOr[Boolean | typings.vis.anon.Edge] = js.undefined
  
  var color: js.UndefOr[String | typings.vis.anon.Color] = js.undefined
  
  var dashes: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  
  var endPointOffset: js.UndefOr[To] = js.undefined
  
  var font: js.UndefOr[String | Font] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var hoverWidth: js.UndefOr[Double] = js.undefined
  
  // please note, hoverWidth could be also a function. This case is not represented here
  var label: js.UndefOr[String] = js.undefined
  
  var labelHighlightBold: js.UndefOr[Boolean] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var physics: js.UndefOr[Boolean] = js.undefined
  
  var scaling: js.UndefOr[OptionsScaling] = js.undefined
  
  var selectionWidth: js.UndefOr[Double] = js.undefined
  
  var selfReference: js.UndefOr[Angle] = js.undefined
  
  // please note, selectionWidth could be also a function. This case is not represented here
  var selfReferenceSize: js.UndefOr[Double] = js.undefined
  
  var shadow: js.UndefOr[Boolean | OptionsShadow] = js.undefined
  
  var smooth: js.UndefOr[Boolean | Enabled] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var widthConstraint: js.UndefOr[Double | Boolean | Maximum] = js.undefined
}
object EdgeOptions {
  
  inline def apply(): EdgeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeOptions]
  }
  
  extension [Self <: EdgeOptions](x: Self) {
    
    inline def setArrowStrikethrough(value: Boolean): Self = StObject.set(x, "arrowStrikethrough", value.asInstanceOf[js.Any])
    
    inline def setArrowStrikethroughUndefined: Self = StObject.set(x, "arrowStrikethrough", js.undefined)
    
    inline def setArrows(value: String | From): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    inline def setChosen(value: Boolean | typings.vis.anon.Edge): Self = StObject.set(x, "chosen", value.asInstanceOf[js.Any])
    
    inline def setChosenUndefined: Self = StObject.set(x, "chosen", js.undefined)
    
    inline def setColor(value: String | typings.vis.anon.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashes(value: Boolean | js.Array[Double]): Self = StObject.set(x, "dashes", value.asInstanceOf[js.Any])
    
    inline def setDashesUndefined: Self = StObject.set(x, "dashes", js.undefined)
    
    inline def setDashesVarargs(value: Double*): Self = StObject.set(x, "dashes", js.Array(value*))
    
    inline def setEndPointOffset(value: To): Self = StObject.set(x, "endPointOffset", value.asInstanceOf[js.Any])
    
    inline def setEndPointOffsetUndefined: Self = StObject.set(x, "endPointOffset", js.undefined)
    
    inline def setFont(value: String | Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHoverWidth(value: Double): Self = StObject.set(x, "hoverWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverWidthUndefined: Self = StObject.set(x, "hoverWidth", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelHighlightBold(value: Boolean): Self = StObject.set(x, "labelHighlightBold", value.asInstanceOf[js.Any])
    
    inline def setLabelHighlightBoldUndefined: Self = StObject.set(x, "labelHighlightBold", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPhysics(value: Boolean): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    inline def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    inline def setScaling(value: OptionsScaling): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def setSelectionWidth(value: Double): Self = StObject.set(x, "selectionWidth", value.asInstanceOf[js.Any])
    
    inline def setSelectionWidthUndefined: Self = StObject.set(x, "selectionWidth", js.undefined)
    
    inline def setSelfReference(value: Angle): Self = StObject.set(x, "selfReference", value.asInstanceOf[js.Any])
    
    inline def setSelfReferenceSize(value: Double): Self = StObject.set(x, "selfReferenceSize", value.asInstanceOf[js.Any])
    
    inline def setSelfReferenceSizeUndefined: Self = StObject.set(x, "selfReferenceSize", js.undefined)
    
    inline def setSelfReferenceUndefined: Self = StObject.set(x, "selfReference", js.undefined)
    
    inline def setShadow(value: Boolean | OptionsShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setSmooth(value: Boolean | Enabled): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    
    inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthConstraint(value: Double | Boolean | Maximum): Self = StObject.set(x, "widthConstraint", value.asInstanceOf[js.Any])
    
    inline def setWidthConstraintUndefined: Self = StObject.set(x, "widthConstraint", js.undefined)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
