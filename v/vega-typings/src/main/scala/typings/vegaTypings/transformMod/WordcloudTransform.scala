package typings.vegaTypings.transformMod

import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import typings.vegaTypings.vegaTypingsStrings.wordcloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordcloudTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector7[String | SignalRef]) | SignalRef] = js.native
  
  var font: js.UndefOr[String | TransformField] = js.native
  
  var fontSize: js.UndefOr[Double | TransformField] = js.native
  
  var fontSizeRange: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var fontStyle: js.UndefOr[FontStyle | TransformField] = js.native
  
  var fontWeight: js.UndefOr[FontWeight | TransformField] = js.native
  
  var padding: js.UndefOr[Double | TransformField] = js.native
  
  var rotate: js.UndefOr[Double | TransformField] = js.native
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var spiral: js.UndefOr[WordcloudSpiral | SignalRef] = js.native
  
  var text: js.UndefOr[String | TransformField] = js.native
  
  var `type`: wordcloud = js.native
}
object WordcloudTransform {
  
  @scala.inline
  def apply(`type`: wordcloud): WordcloudTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordcloudTransform]
  }
  
  @scala.inline
  implicit class WordcloudTransformMutableBuilder[Self <: WordcloudTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector7[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setFont(value: String | TransformField): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double | TransformField): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeRange(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "fontSizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeRangeUndefined: Self = StObject.set(x, "fontSizeRange", js.undefined)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle | TransformField): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight | TransformField): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | TransformField): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRotate(value: Double | TransformField): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpiral(value: WordcloudSpiral | SignalRef): Self = StObject.set(x, "spiral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpiralUndefined: Self = StObject.set(x, "spiral", js.undefined)
    
    @scala.inline
    def setText(value: String | TransformField): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: wordcloud): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
