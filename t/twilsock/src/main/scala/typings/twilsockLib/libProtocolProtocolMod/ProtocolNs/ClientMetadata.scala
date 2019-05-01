package typings
package twilsockLib.libProtocolProtocolMod.ProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMetadata extends js.Object {
  var application: twilsockLib.Anon_Name
  var runtime: twilsockLib.Anon_Os
  var sdk: twilsockLib.Anon_Type
}

object ClientMetadata {
  @scala.inline
  def apply(application: twilsockLib.Anon_Name, runtime: twilsockLib.Anon_Os, sdk: twilsockLib.Anon_Type): ClientMetadata = {
    val __obj = js.Dynamic.literal(application = application, runtime = runtime, sdk = sdk)
  
    __obj.asInstanceOf[ClientMetadata]
  }
}

