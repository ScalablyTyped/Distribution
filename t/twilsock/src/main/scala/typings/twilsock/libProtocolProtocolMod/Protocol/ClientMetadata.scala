package typings.twilsock.libProtocolProtocolMod.Protocol

import typings.twilsock.Anon_Name
import typings.twilsock.Anon_Os
import typings.twilsock.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMetadata extends js.Object {
  var application: Anon_Name
  var runtime: Anon_Os
  var sdk: Anon_Type
}

object ClientMetadata {
  @scala.inline
  def apply(application: Anon_Name, runtime: Anon_Os, sdk: Anon_Type): ClientMetadata = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sdk = sdk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientMetadata]
  }
}

