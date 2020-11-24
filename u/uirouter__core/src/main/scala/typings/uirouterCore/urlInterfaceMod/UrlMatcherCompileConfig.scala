package typings.uirouterCore.urlInterfaceMod

import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMatcherCompileConfig extends js.Object {
  
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  
  var decodeParams: js.UndefOr[Boolean] = js.native
  
  var state: js.UndefOr[StateDeclaration] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object UrlMatcherCompileConfig {
  
  @scala.inline
  def apply(): UrlMatcherCompileConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMatcherCompileConfig]
  }
  
  @scala.inline
  implicit class UrlMatcherCompileConfigOps[Self <: UrlMatcherCompileConfig] (val x: Self) extends AnyVal {
    
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
    def setCaseInsensitive(value: Boolean): Self = this.set("caseInsensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseInsensitive: Self = this.set("caseInsensitive", js.undefined)
    
    @scala.inline
    def setDecodeParams(value: Boolean): Self = this.set("decodeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeParams: Self = this.set("decodeParams", js.undefined)
    
    @scala.inline
    def setState(value: StateDeclaration): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
