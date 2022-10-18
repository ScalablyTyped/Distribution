package typings.stropheJs.stropheMod.global.Strophe

import typings.std.Document
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Text
import typings.stropheJs.anon.Tree
import typings.stropheJs.stropheMod.global.Strophe.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Constants: SASL mechanisms
  *  Available authentication mechanisms
  *
  *  Strophe.SASLAnonymous - SASL Anonymous authentication.
  *  Strophe.SASLPlain - SASL Plain authentication.
  *  Strophe.SASLMD5 - SASL Digest-MD5 authentication
  *  Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
  */
inline def SASLAnonymous: SASLMechanism = ^.asInstanceOf[js.Dynamic].selectDynamic("SASLAnonymous").asInstanceOf[SASLMechanism]

inline def SASLMD5: SASLMechanism = ^.asInstanceOf[js.Dynamic].selectDynamic("SASLMD5").asInstanceOf[SASLMechanism]

inline def SASLPlain: SASLMechanism = ^.asInstanceOf[js.Dynamic].selectDynamic("SASLPlain").asInstanceOf[SASLMechanism]

inline def SASLSHA1: SASLMechanism = ^.asInstanceOf[js.Dynamic].selectDynamic("SASLSHA1").asInstanceOf[SASLMechanism]

inline def SECONDARY_TIMEOUT: /* 0.1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("SECONDARY_TIMEOUT").asInstanceOf[/* 0.1 */ Double]

/** PrivateConstants: Timeout Values
  *  Timeout values for error states.  These values are in seconds.
  *  These should not be changed unless you know exactly what you are
  *  doing.
  *
  *  TIMEOUT - Timeout multiplier. A waiting request will be considered
  *      failed after Math.floor(TIMEOUT * wait) seconds have elapsed.
  *      This defaults to 1.1, and with default wait, 66 seconds.
  *  SECONDARY_TIMEOUT - Secondary timeout multiplier. In cases where
  *      Strophe can detect early failure, it will consider the request
  *      failed if it doesn't return after
  *      Math.floor(SECONDARY_TIMEOUT * wait) seconds have elapsed.
  *      This defaults to 0.1, and with default wait, 6 seconds.
  */
inline def TIMEOUT: /* 1.1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("TIMEOUT").asInstanceOf[/* 1.1 */ Double]

/** Constant: VERSION
  *  The version of the Strophe library. Unreleased builds will have
  *  a version of head-HASH where HASH is a partial revision.
  */
inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

/** Function: addConnectionPlugin
  *  Extends the Strophe.Connection object with the given plugin.
  *
  *  Parameters:
  *    @param name - The name of the extension.
  *    @param prototypeObject - The plugin's prototype.
  */
inline def addConnectionPlugin(name: String, prototypeObject: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addConnectionPlugin")(name.asInstanceOf[js.Any], prototypeObject.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** Function: addNamespace
  *  This function is used to extend the current namespaces in
  *  Strophe.NS.  It takes a key and a value with the key being the
  *  name of the new namespace, with its actual value.
  *  For example:
  *  Strophe.addNamespace('PUBSUB', "http://jabber.org/protocol/pubsub");
  *
  *  Parameters:
  *    @param name - The name under which the namespace will be
  *      referenced under Strophe.NS
  *    @param value - The actual namespace.
  */
inline def addNamespace(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** Function: copyElement
  *  Copy an XML DOM element.
  *
  *  This function copies a DOM element and all its descendants and returns
  *  the new copy.
  *
  *  Parameters:
  *    @param elem - A XMLElement as a DOM element.
  *
  *  Returns:
  *    @returns A new, copied DOM element tree.
  */
inline def copyElement(elem: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("copyElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]

/** Function: createHtml
  *  Copy an HTML DOM element into an XML DOM.
  *
  *  This function copies a DOM element and all its descendants and returns
  *  the new copy. If all elements and attributes satisfy the XHTML specification
  *
  *  Parameters:
  *    @param elem - A HTMLElement.
  *
  *  Returns:
  *    @returns A new, copied DOM element tree.
  */
inline def createHtml(elem: HTMLElement): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtml")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]

/** Functions: debug
  *  Log a message at the Strophe.LogLevel.DEBUG level.
  *
  *  Parameters:
  *    @param msg - The log message.
  */
inline def debug(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Functions: error
  *  Log a message at the Strophe.LogLevel.ERROR level.
  *
  *  Parameters:
  *    @param msg - The log message.
  */
inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Function: escapeNode
  *  Escape the node part (also called local part) of a JID.
  *
  *  Parameters:
  *    @param node - A node (or local part).
  *
  *  Returns:
  *    @returns An escaped node (or local part).
  */
inline def escapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]

/** Functions: fatal
  *  Log a message at the Strophe.LogLevel.FATAL level.
  *
  *  Parameters:
  *    @param msg - The log message.
  */
inline def fatal(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Function: forEachChild
  *  Map a function over some or all child elements of a given element.
  *
  *  This is a small convenience function for mapping a function over
  *  some or all of the children of an element.  If elemName is null, all
  *  children will be passed to the function, otherwise only children
  *  whose tag names match elemName will be passed.
  *
  *  Parameters:
  *    @param elem - The xml element to operate on in an Element object.
  *    @param elemName - The child element tag name filter.
  *    @param func - The function to apply to each child.  This
  *      function should take a single argument, a DOM element. A return value will be ignored.
  */
inline def forEachChild(elem: Element, elemName: String, func: js.Function1[/* child */ Element, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(elem.asInstanceOf[js.Any], elemName.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** Function: getBareJidFromJid
  *  Get the bare JID from a JID String.
  *
  *  Parameters:
  *    @param jid - A JID.
  *
  *  Returns:
  *    @returns A String containing the bare JID.
  */
inline def getBareJidFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBareJidFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]

/** Function: getDomainFromJid
  *  Get the domain portion of a JID String.
  *
  *  Parameters:
  *    @param jid - A JID.
  *
  *  Returns:
  *    @returns A String containing the domain.
  */
inline def getDomainFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]

/** Function: getNodeFromJid
  *  Get the node portion of a JID String.
  *
  *  Parameters:
  *    @param jid - A JID.
  *
  *  Returns:
  *   @returns A String containing the node.
  */
inline def getNodeFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]

/** Function: getResourceFromJid
  *  Get the resource portion of a JID String.
  *
  *  Parameters:
  *    @param jid - A JID.
  *
  *  Returns:
  *    @returns A String containing the resource.
  */
inline def getResourceFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]

/** Function: getText
  *  Get the concatenation of all text children of an element.
  *
  *  Parameters:
  *    @param elem - A XMLElement as DOM element.
  *
  *  Returns:
  *    @returns A String with the concatenated text of all text element children.
  */
inline def getText(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(elem.asInstanceOf[js.Any]).asInstanceOf[String]

/** Functions: info
  *  Log a message at the Strophe.LogLevel.INFO level.
  *
  *  Parameters:
  *    @param msg - The log message.
  */
inline def info(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Function: isTagEqual
  *  Compare an element's tag name with a string.
  *
  *  This function is case sensitive.
  *
  *  Parameters:
  *   @param el - A XMLElement in a DOM element.
  *   @param name - The element name.
  *
  *  Returns:
  *    @returns true if the element's tag name matches _el_, and false
  *    otherwise.
  */
inline def isTagEqual(el: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTagEqual")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]

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
  *    @param level - The log level of the log message.  This will
  *      be one of the values in Strophe.LogLevel.
  *    @param msg - The log message.
  */
inline def log(level: LogLevel, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** Function: serialize
  *  Render a DOM element and all descendants to a String.
  *
  *  Parameters:
  *    @param elem - A XMLElement as DOM element or a Strophe.Builder or an object
  *    with a tree function returning a DOMElement.
  *
  *  Returns:
  *    @returns The serialized element tree as a String.
  */
inline def serialize(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
inline def serialize(elem: Tree): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
inline def serialize(elem: Builder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]

/** Function: unescapeNode
  *  Unescape a node part (also called local part) of a JID.
  *
  *  Parameters:
  *    @param node - A node (or local part).
  *
  *  Returns:
  *   @returns An unescaped node (or local part).
  */
inline def unescapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]

/** Functions: warn
  *  Log a message at the Strophe.LogLevel.WARN level.
  *
  *  Parameters:
  *    @param msg - The log message.
  */
inline def warn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Function: xmlElement
  *  Create an XML DOM element.
  *
  *  This function creates an XML DOM element correctly across all
  *  implementations. Note that these are not HTML DOM elements, which
  *  aren't appropriate for XMPP stanzas.
  *
  *  Parameters:
  *    @param name - The name for the element.
  *    @param attrs - An optional array or object containing
  *      key/value pairs to use as element attributes. The object should
  *      be in the format {'key': 'value'} or {key: 'value'}. The array
  *      should have the format [['key1', 'value1'], ['key2', 'value2']].
  *    @param text - The text child data for the element.
  *
  *  Returns:
  *    @returns A new XML DOM element.
  */
inline def xmlElement(name: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any]).asInstanceOf[Element]
inline def xmlElement(name: String, attrs: js.Array[js.Tuple2[String, String]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, attrs: js.Array[js.Tuple2[String, String]], text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, attrs: Unit, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, attrs: Record[String, String]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, attrs: Record[String, String], text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, text: String, attrs: js.Array[js.Tuple2[String, String]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, text: String, attrs: Record[String, String]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, text: Unit, attrs: js.Array[js.Tuple2[String, String]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def xmlElement(name: String, text: Unit, attrs: Record[String, String]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]

/** Function: xmlGenerator
  *  Get the DOM document to generate elements.
  *
  *  Returns:
  *    @returns The currently used DOM document.
  */
inline def xmlGenerator(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlGenerator")().asInstanceOf[Document]

/** Function: xmlHtmlNode
  *  Creates an XML DOM html node.
  *
  *  Parameters:
  *    @param html - The content of the html node.
  *
  *  Returns:
  *   @returns A new XML DOM text node.
  */
inline def xmlHtmlNode(html: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlHtmlNode")(html.asInstanceOf[js.Any]).asInstanceOf[Document]

/** Function: xmlTextNode
  *  Creates an XML DOM text node.
  *
  *  Provides a cross implementation version of document.createTextNode.
  *
  *  Parameters:
  *    @param text - The content of the text node.
  *
  *  Returns:
  *   @returns A new XML DOM text node.
  */
inline def xmlTextNode(text: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlTextNode")(text.asInstanceOf[js.Any]).asInstanceOf[Text]

/**  Function: xmlescape
  *  Escapes invalid xml characters.
  *
  *  Parameters:
  *     @param text - text to escape.
  *
  *  Returns:
  *     @returns Escaped text.
  */
inline def xmlescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]

/**  Function: xmlunescape
  *  Unescapes invalid xml characters.
  *
  *  Parameters:
  *     @param text - text to unescape.
  *
  *  Returns:
  *     @returns Unescaped text.
  */
inline def xmlunescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlunescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
