package typings.webappsecCredentialManagement

import typings.std.HTMLFormElement
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def fetch(input: String): js.Promise[Response] = js.native
  def fetch(input: String, init: RequestInit): js.Promise[Response] = js.native
  def fetch(input: String, init: CMRequestInit): js.Promise[Response] = js.native
  def fetch(input: Request): js.Promise[Response] = js.native
  def fetch(input: Request, init: RequestInit): js.Promise[Response] = js.native
  def fetch(input: Request, init: CMRequestInit): js.Promise[Response] = js.native
  
  @js.native
  class FederatedCredential protected ()
    extends typings.webappsecCredentialManagement.FederatedCredential {
    def this(data: FederatedCredentialData) = this()
  }
  
  /**
    * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
    */
  @js.native
  class PasswordCredential protected ()
    extends typings.webappsecCredentialManagement.PasswordCredential {
    def this(data: HTMLFormElement) = this()
    /**
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordcredential-data}
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordcredential}
      */
    def this(data: PasswordCredentialData) = this()
  }
  
  /**
    * Defines the specific attributes shared by any Credential persisted in user
    * agent’s credential
    * store.
    */
  // tslint:disable-next-line no-empty-interface
  @js.native
  abstract class SiteBoundCredential ()
    extends typings.webappsecCredentialManagement.SiteBoundCredential
}
