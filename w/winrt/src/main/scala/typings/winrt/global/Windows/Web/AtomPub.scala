package typings.winrt.global.Windows.Web

import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.AtomPub")
@js.native
object AtomPub extends js.Object {
  @js.native
  class AtomPubClient ()
    extends typings.winrt.Windows.Web.AtomPub.AtomPubClient {
    def this(serverCredential: PasswordCredential) = this()
  }
  
  @js.native
  class ResourceCollection ()
    extends typings.winrt.Windows.Web.AtomPub.ResourceCollection
  
  @js.native
  class ServiceDocument ()
    extends typings.winrt.Windows.Web.AtomPub.ServiceDocument
  
  @js.native
  class Workspace ()
    extends typings.winrt.Windows.Web.AtomPub.Workspace
  
}

