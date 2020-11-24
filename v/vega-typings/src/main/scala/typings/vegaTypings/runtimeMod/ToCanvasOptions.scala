package typings.vegaTypings.runtimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToCanvasOptions extends js.Object {
  
  var context: js.UndefOr[js.Any] = js.native
  
  var externalContext: js.UndefOr[js.Any] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object ToCanvasOptions {
  
  @scala.inline
  def apply(): ToCanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToCanvasOptions]
  }
  
  @scala.inline
  implicit class ToCanvasOptionsOps[Self <: ToCanvasOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setExternalContext(value: js.Any): Self = this.set("externalContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalContext: Self = this.set("externalContext", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
