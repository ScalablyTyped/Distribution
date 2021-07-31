package typings.xmppXml

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(name: String, attrs: String, children: ElementChild*): Element = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def apply(name: String, attrs: StringDictionary[js.Any], children: ElementChild*): Element = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def apply(name: String, attrs: Unit, children: ElementChild*): Element = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @JSImport("@xmpp/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def x(name: String, attrs: String, children: ElementChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def x(name: String, attrs: StringDictionary[js.Any], children: ElementChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def x(name: String, attrs: Unit, children: ElementChild*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("x")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type ElementChild = Element | js.Array[Element] | String | Double | Boolean
  
  trait XMLError
    extends StObject
       with Error {
    
    @JSName("name")
    val name_XMLError: typings.xmppXml.xmppXmlStrings.XMLError
  }
  object XMLError {
    
    @scala.inline
    def apply(message: String): XMLError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "XMLError")
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
      
      type Element = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Element */ js.Any
      
      type IntrinsicElements = StringDictionary[js.Any]
    }
  }
}
