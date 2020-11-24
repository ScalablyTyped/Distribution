package typings.wixUiIconsCommon.formFieldErrorFilledMod

import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormFieldErrorFilledProps extends SVGAttributes[SVGElement] {
  
  var size: js.UndefOr[String] = js.native
}
object FormFieldErrorFilledProps {
  
  @scala.inline
  def apply(): FormFieldErrorFilledProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormFieldErrorFilledProps]
  }
  
  @scala.inline
  implicit class FormFieldErrorFilledPropsOps[Self <: FormFieldErrorFilledProps] (val x: Self) extends AnyVal {
    
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
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
