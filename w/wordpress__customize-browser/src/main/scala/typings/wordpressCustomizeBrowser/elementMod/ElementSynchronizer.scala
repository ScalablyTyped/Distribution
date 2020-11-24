package typings.wordpressCustomizeBrowser.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementSynchronizer extends js.Object {
  
  var checkbox: ElementSynchronizerMethod[Boolean] = js.native
  
  var html: ElementSynchronizerMethod[String] = js.native
  
  var radio: ElementSynchronizerMethod[Boolean] = js.native
  
  var `val`: ElementSynchronizerMethod[String] = js.native
}
object ElementSynchronizer {
  
  @scala.inline
  def apply(
    checkbox: ElementSynchronizerMethod[Boolean],
    html: ElementSynchronizerMethod[String],
    radio: ElementSynchronizerMethod[Boolean],
    `val`: ElementSynchronizerMethod[String]
  ): ElementSynchronizer = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementSynchronizer]
  }
  
  @scala.inline
  implicit class ElementSynchronizerOps[Self <: ElementSynchronizer] (val x: Self) extends AnyVal {
    
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
    def setCheckbox(value: ElementSynchronizerMethod[Boolean]): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: ElementSynchronizerMethod[String]): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadio(value: ElementSynchronizerMethod[Boolean]): Self = this.set("radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: ElementSynchronizerMethod[String]): Self = this.set("val", value.asInstanceOf[js.Any])
  }
}
