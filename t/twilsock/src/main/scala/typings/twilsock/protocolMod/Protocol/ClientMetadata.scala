package typings.twilsock.protocolMod.Protocol

import typings.twilsock.anon.Name
import typings.twilsock.anon.Os
import typings.twilsock.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMetadata extends js.Object {
  var application: Name
  var runtime: Os
  var sdk: Type
}

object ClientMetadata {
  @scala.inline
  def apply(application: Name, runtime: Os, sdk: Type): ClientMetadata = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sdk = sdk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
}

