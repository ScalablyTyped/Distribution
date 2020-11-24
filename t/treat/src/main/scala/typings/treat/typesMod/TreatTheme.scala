package typings.treat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreatTheme[Tokens] extends js.Object {
  
  var themeRef: ThemeRef = js.native
  
  var tokens: Tokens = js.native
}
object TreatTheme {
  
  @scala.inline
  def apply[Tokens](themeRef: ThemeRef, tokens: Tokens): TreatTheme[Tokens] = {
    val __obj = js.Dynamic.literal(themeRef = themeRef.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatTheme[Tokens]]
  }
  
  @scala.inline
  implicit class TreatThemeOps[Self <: TreatTheme[_], Tokens] (val x: Self with TreatTheme[Tokens]) extends AnyVal {
    
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
    def setThemeRef(value: ThemeRef): Self = this.set("themeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: Tokens): Self = this.set("tokens", value.asInstanceOf[js.Any])
  }
}
