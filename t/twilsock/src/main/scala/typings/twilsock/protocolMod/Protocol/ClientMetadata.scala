package typings.twilsock.protocolMod.Protocol

import typings.twilsock.anon.Name
import typings.twilsock.anon.Os
import typings.twilsock.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMetadata extends js.Object {
  var application: Name = js.native
  var runtime: Os = js.native
  var sdk: Type = js.native
}

object ClientMetadata {
  @scala.inline
  def apply(application: Name, runtime: Os, sdk: Type): ClientMetadata = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sdk = sdk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  @scala.inline
  implicit class ClientMetadataOps[Self <: ClientMetadata] (val x: Self) extends AnyVal {
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
    def setApplication(value: Name): Self = this.set("application", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Os): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSdk(value: Type): Self = this.set("sdk", value.asInstanceOf[js.Any])
  }
  
}

