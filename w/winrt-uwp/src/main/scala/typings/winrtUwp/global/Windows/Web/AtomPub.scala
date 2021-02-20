package typings.winrtUwp.global.Windows.Web

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables HTTP CRUD access to Web resources using the AtomPub protocol. The AtomPub sample demonstrates this implementation. */
object AtomPub {
  
  /** Encapsulates the methods needed to implement the AtomPub protocol which enables HTTP CRUD access to Web resources using the Atom 1.0 wire format. */
  @JSGlobal("Windows.Web.AtomPub.AtomPubClient")
  @js.native
  /** Creates a new AtomPubClient object. */
  class AtomPubClient ()
    extends typings.winrtUwp.Windows.Web.AtomPub.AtomPubClient {
    /**
      * Creates a new AtomPubClient object with the credential to use when making requests to the server. Initially, a 'username/password' tuple. However, for domain credentials, the username must be in 'domain\\user form'.
      * @param serverCredential The specified security credentials.
      */
    def this(serverCredential: PasswordCredential) = this()
  }
  
  /** Encapsulates one or more collections within a workspace. */
  @JSGlobal("Windows.Web.AtomPub.ResourceCollection")
  @js.native
  abstract class ResourceCollection ()
    extends typings.winrtUwp.Windows.Web.AtomPub.ResourceCollection
  
  /** Encapsulates a service document. */
  @JSGlobal("Windows.Web.AtomPub.ServiceDocument")
  @js.native
  abstract class ServiceDocument ()
    extends typings.winrtUwp.Windows.Web.AtomPub.ServiceDocument
  
  /** Encapsulates a workspace in a service document. */
  @JSGlobal("Windows.Web.AtomPub.Workspace")
  @js.native
  abstract class Workspace ()
    extends typings.winrtUwp.Windows.Web.AtomPub.Workspace
}
