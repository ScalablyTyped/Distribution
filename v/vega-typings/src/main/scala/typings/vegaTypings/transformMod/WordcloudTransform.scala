package typings.vegaTypings.transformMod

import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import typings.vegaTypings.vegaTypingsStrings.wordcloud
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
  implicit class WordcloudTransformOps[Self <: WordcloudTransform] (val x: Self) extends AnyVal {
    
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
    def setType(value: wordcloud): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: (Vector7[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setFont(value: String | TransformField): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | TransformField): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSizeRange(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("fontSizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizeRange: Self = this.set("fontSizeRange", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle | TransformField): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight | TransformField): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | TransformField): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setRotate(value: Double | TransformField): Self = this.set("rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpiral(value: WordcloudSpiral | SignalRef): Self = this.set("spiral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpiral: Self = this.set("spiral", js.undefined)
    
    @scala.inline
    def setText(value: String | TransformField): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
