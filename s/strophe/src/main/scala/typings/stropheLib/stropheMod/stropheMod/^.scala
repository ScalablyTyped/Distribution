package typings
package stropheLib.stropheMod.stropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /** Constants: XMPP Namespace Constants
    *  Common namespace constants from the XMPP RFCs and XEPs.
    *
    *  NS.HTTPBIND - HTTP BIND namespace from XEP 124.
    *  NS.BOSH - BOSH namespace from XEP 206.
    *  NS.CLIENT - Main XMPP client namespace.
    *  NS.AUTH - Legacy authentication namespace.
    *  NS.ROSTER - Roster operations namespace.
    *  NS.PROFILE - Profile namespace.
    *  NS.DISCO_INFO - Service discovery info namespace from XEP 30.
    *  NS.DISCO_ITEMS - Service discovery items namespace from XEP 30.
    *  NS.MUC - Multi-User Chat namespace from XEP 45.
    *  NS.SASL - XMPP SASL namespace from RFC 3920.
    *  NS.STREAM - XMPP Streams namespace from RFC 3920.
    *  NS.BIND - XMPP Binding namespace from RFC 3920.
    *  NS.SESSION - XMPP Session namespace from RFC 3920.
    *  NS.XHTML_IM - XHTML-IM namespace from XEP 71.
    *  NS.XHTML - XHTML body namespace from XEP 71.
    */
  var NS: stropheLib.Anon_AUTH = js.native
  /** Constants: SASL mechanisms
    *  Available authentication mechanisms
    *
    *  Strophe.SASLAnonymous - SASL Anonymous authentication.
    *  Strophe.SASLPlain - SASL Plain authentication.
    *  Strophe.SASLMD5 - SASL Digest-MD5 authentication
    *  Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
    */
  var SASLAnonymous: stropheLib.stropheMod.StropheNs.SASLMechanism = js.native
  var SASLMD5: stropheLib.stropheMod.StropheNs.SASLMechanism = js.native
  var SASLPlain: stropheLib.stropheMod.StropheNs.SASLMechanism = js.native
  var SASLSHA1: stropheLib.stropheMod.StropheNs.SASLMechanism = js.native
  /** Constant: VERSION
    *  The version of the Strophe library. Unreleased builds will have
    *  a version of head-HASH where HASH is a partial revision.
    */
  var VERSION: java.lang.String = js.native
  /** Function: addConnectionPlugin
    *  Extends the Strophe.Connection object with the given plugin.
    *
    *  Parameters:
    *    (String) name - The name of the extension.
    *    (Object) ptype - The plugin's prototype.
    */
  def addConnectionPlugin(name: java.lang.String, ptype: js.Any): scala.Unit = js.native
  /** Function: addNamespace
    *  This function is used to extend the current namespaces in
    *  Strophe.NS.  It takes a key and a value with the key being the
    *  name of the new namespace, with its actual value.
    *  For example:
    *  Strophe.addNamespace('PUBSUB', "http://jabber.org/protocol/pubsub");
    *
    *  Parameters:
    *    (String) name - The name under which the namespace will be
    *      referenced under Strophe.NS
    *    (String) value - The actual namespace.
    */
  def addNamespace(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /** Function: copyElement
    *  Copy an XML DOM element.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    A new, copied DOM element tree.
    */
  def copyElement(elem: stdLib.Element): stdLib.Element = js.native
  /** Function: createHtml
    *  Copy an HTML DOM element into an XML DOM.
    *
    *  This function copies a DOM element and all its descendants and returns
    *  the new copy.
    *
    *  Parameters:
    *    (Element) elem - A DOM element.
    *
    *  Returns:
    *    A new, copied DOM element tree.
    */
  def createHtml(elem: stdLib.Element): stdLib.Element = js.native
  /** Functions: debug, info, warn, error
    *  Log a message at the appropriate Strophe.LogLevel
    *
    *  Parameters:
    *    (String) msg - The log message.
    */
  def debug(msg: java.lang.String): scala.Unit = js.native
  def error(msg: java.lang.String): scala.Unit = js.native
  /** Function: escapeNode
    *  Escape the node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An escaped node (or local part).
    */
  def escapeNode(node: java.lang.String): java.lang.String = js.native
  def fatal(msg: java.lang.String): scala.Unit = js.native
  /** Function: forEachChild
    *  Map a function over some or all child elements of a given element.
    *
    *  This is a small convenience function for mapping a function over
    *  some or all of the children of an element.  If elemName is null, all
    *  children will be passed to the function, otherwise only children
    *  whose tag names match elemName will be passed.
    *
    *  Parameters:
    *    (XMLElement) elem - The element to operate on.
    *    (String) elemName - The child element tag name filter.
    *    (Function) func - The function to apply to each child.  This
    *      function should take a single argument, a DOM element.
    */
  def forEachChild(
    elem: stdLib.Element,
    elemName: java.lang.String,
    func: js.Function1[/* child */ stdLib.Element, _]
  ): scala.Unit = js.native
  /** Function: getBareJidFromJid
    *  Get the bare JID from a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the bare JID.
    */
  def getBareJidFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getDomainFromJid
    *  Get the domain portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the domain.
    */
  def getDomainFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getNodeFromJid
    *  Get the node portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the node.
    */
  def getNodeFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getResourceFromJid
    *  Get the resource portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the resource.
    */
  def getResourceFromJid(jid: java.lang.String): java.lang.String = js.native
  /** Function: getText
    *  Get the concatenation of all text children of an element.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    A String with the concatenated text of all text element children.
    */
  def getText(elem: stdLib.Element): java.lang.String = js.native
  def info(msg: java.lang.String): scala.Unit = js.native
  /** Function: isTagEqual
    *  Compare an element's tag name with a string.
    *
    *  This function is case sensitive.
    *
    *  Parameters:
    *    (XMLElement) el - A DOM element.
    *    (String) name - The element name.
    *
    *  Returns:
    *    true if the element's tag name matches _el_, and false
    *    otherwise.
    */
  def isTagEqual(el: stdLib.Element, name: java.lang.String): scala.Boolean = js.native
  /** Function: log
    *  User overrideable logging function.
    *
    *  This function is called whenever the Strophe library calls any
    *  of the logging functions.  The default implementation of this
    *  function does nothing.  If client code wishes to handle the logging
    *  messages, it should override this with
    *  > Strophe.log = function (level, msg) {
    *  >   (user code here)
    *  > };
    *
    *  Please note that data sent and received over the wire is logged
    *  via Strophe.Connection.rawInput() and Strophe.Connection.rawOutput().
    *
    *  The different levels and their meanings are
    *
    *    DEBUG - Messages useful for debugging purposes.
    *    INFO - Informational messages.  This is mostly information like
    *      'disconnect was called' or 'SASL auth succeeded'.
    *    WARN - Warnings about potential problems.  This is mostly used
    *      to report transient connection errors like request timeouts.
    *    ERROR - Some error occurred.
    *    FATAL - A non-recoverable fatal error occurred.
    *
    *  Parameters:
    *    (Integer) level - The log level of the log message.  This will
    *      be one of the values in Strophe.LogLevel.
    *    (String) msg - The log message.
    */
  def log(level: stropheLib.stropheMod.StropheNs.LogLevel, msg: java.lang.String): scala.Unit = js.native
  /** Function: serialize
    *  Render a DOM element and all descendants to a String.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    The serialized element tree as a String.
    */
  def serialize(elem: stdLib.Element): java.lang.String = js.native
  def serialize(elem: stropheLib.stropheMod.StropheNs.Builder): java.lang.String = js.native
  /** Function: unescapeNode
    *  Unescape a node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An unescaped node (or local part).
    */
  def unescapeNode(node: java.lang.String): java.lang.String = js.native
  def warn(msg: java.lang.String): scala.Unit = js.native
  /** Function: xmlElement
    *  Create an XML DOM element.
    *
    *  This function creates an XML DOM element correctly across all
    *  implementations. Note that these are not HTML DOM elements, which
    *  aren't appropriate for XMPP stanzas.
    *
    *  Parameters:
    *    (String) name - The name for the element.
    *    (Array|Object) attrs - An optional array or object containing
    *      key/value pairs to use as element attributes. The object should
    *      be in the format {'key': 'value'} or {key: 'value'}. The array
    *      should have the format [['key1', 'value1'], ['key2', 'value2']].
    *    (String) text - The text child data for the element.
    *
    *  Returns:
    *    A new XML DOM element.
    */
  def xmlElement(name: java.lang.String): stdLib.Element = js.native
  def xmlElement(name: java.lang.String, attrs: js.Any): stdLib.Element = js.native
  def xmlElement(name: java.lang.String, attrs: js.Any, text: java.lang.String): stdLib.Element = js.native
  def xmlElement(name: java.lang.String, text: java.lang.String): stdLib.Element = js.native
  def xmlElement(name: java.lang.String, text: java.lang.String, attrs: js.Any): stdLib.Element = js.native
  /** Function: xmlGenerator
    *  Get the DOM document to generate elements.
    *
    *  Returns:
    *    The currently used DOM document.
    */
  def xmlGenerator(): stdLib.Document = js.native
  /** Function: xmlHtmlNode
    *  Creates an XML DOM html node.
    *
    *  Parameters:
    *    (String) html - The content of the html node.
    *
    *  Returns:
    *    A new XML DOM text node.
    */
  def xmlHtmlNode(html: java.lang.String): stdLib.Document = js.native
  /** Function: xmlTextNode
    *  Creates an XML DOM text node.
    *
    *  Provides a cross implementation version of document.createTextNode.
    *
    *  Parameters:
    *    (String) text - The content of the text node.
    *
    *  Returns:
    *    A new XML DOM text node.
    */
  def xmlTextNode(text: java.lang.String): stdLib.Text = js.native
  /*  Function: xmlescape
    *  Excapes invalid xml characters.
    *
    *  Parameters:
    *     (String) text - text to escape.
    *
    *  Returns:
    *      Escaped text.
    */
  def xmlescape(text: java.lang.String): java.lang.String = js.native
  /*  Function: xmlunescape
    *  Unexcapes invalid xml characters.
    *
    *  Parameters:
    *     (String) text - text to unescape.
    *
    *  Returns:
    *      Unescaped text.
    */
  def xmlunescape(text: java.lang.String): java.lang.String = js.native
}

