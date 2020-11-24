package typings.trustedTypes.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedTypePolicyOptions extends js.Object {
  
  var createHTML: js.UndefOr[js.Function2[/* input */ String, /* repeated */ js.Any, String]] = js.native
  
  var createScript: js.UndefOr[js.Function2[/* input */ String, /* repeated */ js.Any, String]] = js.native
  
  var createScriptURL: js.UndefOr[js.Function2[/* input */ String, /* repeated */ js.Any, String]] = js.native
}
object TrustedTypePolicyOptions {
  
  @scala.inline
  def apply(): TrustedTypePolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedTypePolicyOptions]
  }
  
  @scala.inline
  implicit class TrustedTypePolicyOptionsOps[Self <: TrustedTypePolicyOptions] (val x: Self) extends AnyVal {
    
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
    def setCreateHTML(value: (/* input */ String, /* repeated */ js.Any) => String): Self = this.set("createHTML", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateHTML: Self = this.set("createHTML", js.undefined)
    
    @scala.inline
    def setCreateScript(value: (/* input */ String, /* repeated */ js.Any) => String): Self = this.set("createScript", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateScript: Self = this.set("createScript", js.undefined)
    
    @scala.inline
    def setCreateScriptURL(value: (/* input */ String, /* repeated */ js.Any) => String): Self = this.set("createScriptURL", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateScriptURL: Self = this.set("createScriptURL", js.undefined)
  }
}
