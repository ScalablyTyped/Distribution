package typings.strongholdPayJs.mod.global.Stronghold

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var environment: ENVIRONMENT = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var publishableKey: String = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(environment: ENVIRONMENT, publishableKey: String): ClientOptions = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], publishableKey = publishableKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setEnvironment(value: ENVIRONMENT): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishableKey(value: String): Self = this.set("publishableKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
  }
}
