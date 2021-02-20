package typings.xmppXml

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@xmpp/xml", JSImport.Namespace)
  @js.native
  def apply(name: String, attrs: js.UndefOr[scala.Nothing], children: ElementChild*): Element = js.native
  @JSImport("@xmpp/xml", JSImport.Namespace)
  @js.native
  def apply(name: String, attrs: String, children: ElementChild*): Element = js.native
  @JSImport("@xmpp/xml", JSImport.Namespace)
  @js.native
  def apply(name: String, attrs: StringDictionary[js.Any], children: ElementChild*): Element = js.native
  
  @JSImport("@xmpp/xml", "Element")
  @js.native
  class Element protected ()
    extends typings.ltx.mod.Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
    
    def append(nodes: ElementChild): Element = js.native
    
    def prepend(nodes: ElementChild): Element = js.native
  }
  
  @JSImport("@xmpp/xml", "Parser")
  @js.native
  class Parser () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    val XMLError: Instantiable0[typings.xmppXml.mod.XMLError] = js.native
    
    var cursor: Element | Null = js.native
    
    def end(data: Buffer): Unit = js.native
    
    def onEndElement(name: String): Unit = js.native
    
    def onStartElement(name: String): Unit = js.native
    def onStartElement(name: String, attrs: String): Unit = js.native
    def onStartElement(name: String, attrs: StringDictionary[js.Any]): Unit = js.native
    
    def onText(str: String): Unit = js.native
    
    val parser: typings.ltx.mod.Parser = js.native
    
    var root: Element | Null = js.native
    
    def write(data: Buffer): Unit = js.native
  }
  
  @JSImport("@xmpp/xml", "escapeXML")
  @js.native
  val escapeXML: js.Function1[/* s */ String, String] = js.native
  
  @JSImport("@xmpp/xml", "escapeXMLText")
  @js.native
  val escapeXMLText: js.Function1[/* s */ String, String] = js.native
  
  @JSImport("@xmpp/xml", "unescapeXML")
  @js.native
  val unescapeXML: js.Function1[/* s */ String, String] = js.native
  
  @JSImport("@xmpp/xml", "unescapeXMLText")
  @js.native
  val unescapeXMLText: js.Function1[/* s */ String, String] = js.native
  
  @JSImport("@xmpp/xml", "x")
  @js.native
  def x(name: String, attrs: js.UndefOr[scala.Nothing], children: ElementChild*): Element = js.native
  @JSImport("@xmpp/xml", "x")
  @js.native
  def x(name: String, attrs: String, children: ElementChild*): Element = js.native
  @JSImport("@xmpp/xml", "x")
  @js.native
  def x(name: String, attrs: StringDictionary[js.Any], children: ElementChild*): Element = js.native
  
  type ElementChild = Element | js.Array[Element] | String | Double | Boolean
  
  @js.native
  trait XMLError extends Error {
    
    @JSName("name")
    val name_XMLError: typings.xmppXml.xmppXmlStrings.XMLError = js.native
  }
  object XMLError {
    
    @scala.inline
    def apply(message: String, name: typings.xmppXml.xmppXmlStrings.XMLError): XMLError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMLError]
    }
    
    @scala.inline
    implicit class XMLErrorMutableBuilder[Self <: XMLError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.xmppXml.xmppXmlStrings.XMLError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object JSX {
      
      type Element = typings.xmppXml.mod.Element
      
      type IntrinsicElements = StringDictionary[js.Any]
    }
  }
}
