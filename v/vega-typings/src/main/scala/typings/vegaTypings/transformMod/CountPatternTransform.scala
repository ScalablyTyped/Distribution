package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.countpattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountPatternTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  
  var `case`: js.UndefOr[String | SignalRef] = js.native
  
  var field: FieldRef = js.native
  
  var pattern: js.UndefOr[String | SignalRef] = js.native
  
  var stopwords: js.UndefOr[String | SignalRef] = js.native
  
  var `type`: countpattern = js.native
}
object CountPatternTransform {
  
  @scala.inline
  def apply(field: FieldRef, `type`: countpattern): CountPatternTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPatternTransform]
  }
  
  @scala.inline
  implicit class CountPatternTransformOps[Self <: CountPatternTransform] (val x: Self) extends AnyVal {
    
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
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: countpattern): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setCase(value: String | SignalRef): Self = this.set("case", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCase: Self = this.set("case", js.undefined)
    
    @scala.inline
    def setPattern(value: String | SignalRef): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setStopwords(value: String | SignalRef): Self = this.set("stopwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopwords: Self = this.set("stopwords", js.undefined)
  }
}
