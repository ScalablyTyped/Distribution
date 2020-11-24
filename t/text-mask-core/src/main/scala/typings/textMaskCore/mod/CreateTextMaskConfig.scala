package typings.textMaskCore.mod

import typings.std.HTMLInputElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTextMaskConfig extends js.Object {
  
  var guide: js.UndefOr[String] = js.native
  
  var inputElement: HTMLInputElement = js.native
  
  var keepCharPositions: js.UndefOr[Boolean] = js.native
  
  var mask: Mask = js.native
  
  var pipe: js.UndefOr[Pipe] = js.native
  
  var placeholderChar: js.UndefOr[String] = js.native
  
  var showMask: js.UndefOr[Boolean] = js.native
}
object CreateTextMaskConfig {
  
  @scala.inline
  def apply(inputElement: HTMLInputElement, mask: Mask): CreateTextMaskConfig = {
    val __obj = js.Dynamic.literal(inputElement = inputElement.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTextMaskConfig]
  }
  
  @scala.inline
  implicit class CreateTextMaskConfigOps[Self <: CreateTextMaskConfig] (val x: Self) extends AnyVal {
    
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
    def setInputElement(value: HTMLInputElement): Self = this.set("inputElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskVarargs(value: (String | RegExp)*): Self = this.set("mask", js.Array(value :_*))
    
    @scala.inline
    def setMask(value: Mask): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuide(value: String): Self = this.set("guide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuide: Self = this.set("guide", js.undefined)
    
    @scala.inline
    def setKeepCharPositions(value: Boolean): Self = this.set("keepCharPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepCharPositions: Self = this.set("keepCharPositions", js.undefined)
    
    @scala.inline
    def setPipe(value: (/* conformedValue */ String, /* config */ js.Any) => PipeResult): Self = this.set("pipe", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePipe: Self = this.set("pipe", js.undefined)
    
    @scala.inline
    def setPlaceholderChar(value: String): Self = this.set("placeholderChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholderChar: Self = this.set("placeholderChar", js.undefined)
    
    @scala.inline
    def setShowMask(value: Boolean): Self = this.set("showMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMask: Self = this.set("showMask", js.undefined)
  }
}
