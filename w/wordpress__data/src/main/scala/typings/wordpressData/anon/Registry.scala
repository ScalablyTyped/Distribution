package typings.wordpressData.anon

import typings.wordpressData.mod.DataRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Registry extends js.Object {
  
  var registry: DataRegistry = js.native
}
object Registry {
  
  @scala.inline
  def apply(registry: DataRegistry): Registry = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry]
  }
  
  @scala.inline
  implicit class RegistryOps[Self <: Registry] (val x: Self) extends AnyVal {
    
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
    def setRegistry(value: DataRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
  }
}
