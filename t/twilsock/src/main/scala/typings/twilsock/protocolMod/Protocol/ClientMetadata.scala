package typings.twilsock.protocolMod.Protocol

import typings.twilsock.AnonName
import typings.twilsock.AnonOs
import typings.twilsock.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMetadata extends js.Object {
  var application: AnonName
  var runtime: AnonOs
  var sdk: AnonType
}

object ClientMetadata {
  @scala.inline
  def apply(application: AnonName, runtime: AnonOs, sdk: AnonType): ClientMetadata = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sdk = sdk.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
}

