package typings.webappsecCredentialManagement

import typings.std.HTMLFormElement
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.federated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("FederatedCredential")
  @js.native
  open class FederatedCredential protected ()
    extends StObject
       with typings.webappsecCredentialManagement.FederatedCredential {
    def this(data: FederatedCredentialData) = this()
    
    /**
      * A URL pointing to an image for the credential. This URL MUST be an
      * {@link
      * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
      * a priori authenticated URL}.
      */
    /* CompleteClass */
    override val iconURL: String | Null = js.native
    
    /**
      * The credential’s identifier. This might be a GUID, username, or email
      * address, for instance.
      */
    /* CompleteClass */
    override val id: String = js.native
    
    /**
      * A name associated with the credential, intended as a human-understandable
      * public name.
      */
    /* CompleteClass */
    override val name: String | Null = js.native
    
    /**
      * The credential’s federated identity provider’s protocol (e.g.
      * "openidconnect"). If this value is null, then the protocol can be
      * inferred from the provider.
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-protocol}
      */
    /* CompleteClass */
    override val protocol: String | Null = js.native
    
    /**
      * The credential’s federated identity provider. Must be a absolute,
      * hierarchical, https URI with no path (e.g. https://www.facebook.com).
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-federatedcredential-provider}
      */
    /* CompleteClass */
    override val provider: String = js.native
    
    /**
      * The credential’s type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /* CompleteClass */
    @JSName("type")
    override val type_FederatedCredential: federated = js.native
  }
  
  /**
    * @see {@link https://www.w3.org/TR/credential-management-1/#passwordcredential}
    */
  @JSGlobal("PasswordCredential")
  @js.native
  open class PasswordCredential protected ()
    extends StObject
       with typings.webappsecCredentialManagement.PasswordCredential {
    def this(data: HTMLFormElement) = this()
    /**
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordcredential-data}
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordcredential}
      */
    def this(data: PasswordCredentialData) = this()
    
    /**
      * If the developer wishes to specify additional data to insert into the
      * request body when submitting the credential information to a remote
      * endpoint, they can do so by assigning a FormData or URLSearchParams
      * object to this attribute. The credential information will be
      * mixed into the object to produce the body. The value is {@code null}
      * unless otherwise specified.
      */
    /* CompleteClass */
    var additionalData: CredentialBodyType | Null = js.native
    
    /**
      * A URL pointing to an image for the credential. This URL MUST be an
      * {@link
      * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
      * a priori authenticated URL}.
      */
    /* CompleteClass */
    override val iconURL: String | Null = js.native
    
    /**
      * The credential’s identifier. This might be a GUID, username, or email
      * address, for instance.
      */
    /* CompleteClass */
    override val id: String = js.native
    
    /**
      * Represents the name which will be used for the ID field when submitting
      * the PasswordCredential to a remote endpoint via {@code fetch()}. It
      * defaults to "username", but can be overridden by a developer to match
      * whatever the backend service expects.
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-idname}
      */
    /* CompleteClass */
    var idName: String = js.native
    
    /**
      * A name associated with the credential, intended as a human-understandable
      * public name.
      */
    /* CompleteClass */
    override val name: String | Null = js.native
    
    /**
      * Represents the name which will be used for the ID field when submitting
      * the PasswordCredential to a remote endpoint via fetch(). It defaults to
      * "password", but can be overridden by a developer to match whatever the
      * backend service expects.
      *
      * @see {@link https://www.w3.org/TR/credential-management-1/#dom-passwordcredential-passwordname}
      */
    /* CompleteClass */
    var passwordName: String = js.native
    
    /**
      * The credential’s type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /* CompleteClass */
    @JSName("type")
    override val type_PasswordCredential: typings.webappsecCredentialManagement.webappsecCredentialManagementStrings.password = js.native
  }
  
  /**
    * Defines the specific attributes shared by any Credential persisted in user
    * agent’s credential
    * store.
    */
  // tslint:disable-next-line no-empty-interface
  /* note: abstract class */ @JSGlobal("SiteBoundCredential")
  @js.native
  open class SiteBoundCredential ()
    extends StObject
       with typings.webappsecCredentialManagement.SiteBoundCredential {
    
    /**
      * A URL pointing to an image for the credential. This URL MUST be an
      * {@link
      * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
      * a priori authenticated URL}.
      */
    /* CompleteClass */
    override val iconURL: String | Null = js.native
    
    /**
      * The credential’s identifier. This might be a GUID, username, or email
      * address, for instance.
      */
    /* CompleteClass */
    override val id: String = js.native
    
    /**
      * A name associated with the credential, intended as a human-understandable
      * public name.
      */
    /* CompleteClass */
    override val name: String | Null = js.native
    
    /**
      * The credential’s type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
  }
  
  inline def fetch(input: String): js.Promise[Response] = js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: String, init: RequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: String, init: CMRequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: Request): js.Promise[Response] = js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: Request, init: RequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: Request, init: CMRequestInit): js.Promise[Response] = (js.Dynamic.global.applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
}
