package typings.stropheJs.stropheMod.global.Strophe

import typings.std.Element
import typings.stropheJs.anon.IgnoreNamespaceFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PrivateClass: Strophe.Handler
  *  _Private_ helper class for managing stanza handlers.
  *
  *  A Strophe.Handler encapsulates a user provided callback function to be
  *  executed when matching stanzas are received by the connection.
  *  Handlers can be either one-off or persistent depending on their
  *  return value. Returning true will cause a Handler to remain active, and
  *  returning false will remove the Handler.
  *
  *  Users will not use Strophe.Handler objects directly, but instead they
  *  will use Strophe.Connection.addHandler() and
  *  Strophe.Connection.deleteHandler().
  */
@JSGlobal("Strophe.Handler")
@js.native
open class Handler protected () extends StObject {
  /**
    * PrivateConstructor: Strophe.Handler
    *  Create and initialize a new Strophe.Handler
    *
    * Parameters:
    * @param handler handler function to run if the configured attributes for it match against the stanza
    * @param ns namespace to match the incoming stanza against to find the right handler
    * @param name tagName to match the incoming stanza against to find the right handler
    * @param type type to match the incoming stanza against to find the right handler
    * @param id id to match the incoming stanza against to find the right handler
    * @param from from jid to match the incoming stanza against to find the right handler
    * @param options matchBareFromJid match only the local and domain of the jid, ignoreNamespaceFragment ignores '#' in namespace
    */
  /* private */ def this(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String,
    from: String
  ) = this()
  /* private */ def this(
    handler: js.Function1[/* stanza */ Element, Boolean],
    ns: String,
    name: String,
    `type`: String,
    id: String,
    from: String,
    options: IgnoreNamespaceFragment
  ) = this()
  
  /** PrivateFunction: getNamespace
    *  Returns the XML namespace attribute on an element.
    *  If `ignoreNamespaceFragment` was passed in for this handler, then the
    *  URL fragment will be stripped.
    *
    *  Parameters:
    *    (XMLElement) elem - The XML element with the namespace.
    *
    *  Returns:
    *    The namespace, with optionally the fragment stripped.
    */
  /* private */ def getNamespace(elem: Any): Any = js.native
  
  /** PrivateFunction: isMatch
    *  Tests if a stanza matches the Strophe.Handler.
    *
    *  Parameters:
    *    @param elem - The XML element to test.
    *
    *  Returns:
    *    @returns true if the stanza matches and false otherwise.
    */
  def isMatch(elem: Element): Boolean = js.native
  
  /** PrivateFunction: namespaceMatch
    *  Tests if a stanza matches the namespace set for this Strophe.Handler.
    *
    *  Parameters:
    *    (XMLElement) elem - The XML element to test.
    *
    *  Returns:
    *    true if the stanza matches and false otherwise.
    */
  /* private */ def namespaceMatch(elem: Any): Any = js.native
  
  /** PrivateFunction: run
    *  Run the callback on a matching stanza.
    *
    *  Parameters:
    *    @param elem - The DOM element that triggered the
    *      Strophe.Handler.
    *
    *  Returns:
    *    @returns A boolean indicating if the handler should remain active.
    */
  def run(elem: Element): Boolean = js.native
}
