package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DidChangeConfigurationParams extends js.Object {
  
  /**
    * The actual changed settings
    */
  var settings: js.Any = js.native
}
object DidChangeConfigurationParams {
  
  @scala.inline
  def apply(settings: js.Any): DidChangeConfigurationParams = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeConfigurationParams]
  }
  
  @scala.inline
  implicit class DidChangeConfigurationParamsOps[Self <: DidChangeConfigurationParams] (val x: Self) extends AnyVal {
    
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
    def setSettings(value: js.Any): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
}
