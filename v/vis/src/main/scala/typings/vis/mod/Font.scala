package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends StObject {
  
  var align: js.UndefOr[String] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var bold: js.UndefOr[String | FontStyles] = js.native
  
  var boldital: js.UndefOr[String | FontStyles] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  // px
  var face: js.UndefOr[String] = js.native
  
  var ital: js.UndefOr[String | FontStyles] = js.native
  
  var mono: js.UndefOr[String | FontStyles] = js.native
  
  var multi: js.UndefOr[Boolean | String] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  // px
  var strokeColor: js.UndefOr[String] = js.native
  
  var strokeWidth: js.UndefOr[Double] = js.native
  
  var vadjust: js.UndefOr[Double] = js.native
}
object Font {
  
  @scala.inline
  def apply(): Font = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBold(value: String | FontStyles): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setBoldital(value: String | FontStyles): Self = StObject.set(x, "boldital", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBolditalUndefined: Self = StObject.set(x, "boldital", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    @scala.inline
    def setItal(value: String | FontStyles): Self = StObject.set(x, "ital", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalUndefined: Self = StObject.set(x, "ital", js.undefined)
    
    @scala.inline
    def setMono(value: String | FontStyles): Self = StObject.set(x, "mono", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonoUndefined: Self = StObject.set(x, "mono", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean | String): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setVadjust(value: Double): Self = StObject.set(x, "vadjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVadjustUndefined: Self = StObject.set(x, "vadjust", js.undefined)
  }
}
