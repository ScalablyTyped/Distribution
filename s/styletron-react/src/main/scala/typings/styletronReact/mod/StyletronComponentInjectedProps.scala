package typings.styletronReact.mod

import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyletronComponentInjectedProps[P /* <: js.Object */] extends js.Object {
  
  @JSName("$as")
  var $as: js.UndefOr[StyletronBase] = js.native
  
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[P]] = js.native
}
object StyletronComponentInjectedProps {
  
  @scala.inline
  def apply[P /* <: js.Object */](): StyletronComponentInjectedProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyletronComponentInjectedProps[P]]
  }
  
  @scala.inline
  implicit class StyletronComponentInjectedPropsOps[Self <: StyletronComponentInjectedProps[_], P /* <: js.Object */] (val x: Self with StyletronComponentInjectedProps[P]) extends AnyVal {
    
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
    def set$as(value: StyletronBase): Self = this.set("$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$as: Self = this.set("$as", js.undefined)
    
    @scala.inline
    def set$styleFunction1(value: P => StyleObject): Self = this.set("$style", js.Any.fromFunction1(value))
    
    @scala.inline
    def set$style(value: StyleProp[P]): Self = this.set("$style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$style: Self = this.set("$style", js.undefined)
  }
}
