package typings.wegameApi.wx.types

import typings.wegameApi.anon.LineHeight
import typings.wegameApi.wegameApiStrings.bold
import typings.wegameApi.wegameApiStrings.italic
import typings.wegameApi.wegameApiStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineHeightParams extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fontFamily: String = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[normal | italic] = js.native
  
  var fontWeight: js.UndefOr[normal | bold] = js.native
  
  var success: js.UndefOr[js.Function1[/* res */ LineHeight, Unit]] = js.native
  
  var text: String = js.native
}
object LineHeightParams {
  
  @scala.inline
  def apply(fontFamily: String, text: String): LineHeightParams = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeightParams]
  }
  
  @scala.inline
  implicit class LineHeightParamsMutableBuilder[Self <: LineHeightParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: normal | bold): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ LineHeight => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
