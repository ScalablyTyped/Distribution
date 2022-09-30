package typings.xmppXml

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.ltx.srcElementMod.default
import typings.ltx.srcParserMod.ParserOptions
import typings.std.Error
import typings.std.Parameters
import typings.std.ReturnType
import typings.xmppXml.anon.TypeofcreateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof ltx.createElement> is not an array type */ args: Parameters[TypeofcreateElement]
  ): ReturnType[TypeofcreateElement] = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[TypeofcreateElement]]
  
  @JSImport("@xmpp/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@xmpp/xml", "Element")
  @js.native
  val Element: Instantiable1[/* name */ String, typings.ltx.mod.Element] = js.native
  type Element = typings.ltx.mod.Element
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@xmpp/xml", "Element")
  @js.native
  open class ElementCls protected ()
    extends typings.ltx.mod.Element {
    def this(name: String) = this()
  }
  
  @JSImport("@xmpp/xml", "Parser")
  @js.native
  open class Parser ()
    extends typings.ltx.mod.Parser {
    def this(options: ParserOptions) = this()
    
    var cursor: typings.xmppXml.mod.Element | Null = js.native
    
    def onEndElement(name: String): Unit = js.native
    
    def onStartElement(name: String): Unit = js.native
    def onStartElement(name: String, attrs: String): Unit = js.native
    def onStartElement(name: String, attrs: StringDictionary[Any]): Unit = js.native
    
    def onText(str: String): Unit = js.native
    
    val parser: typings.ltx.parsersLtxMod.^ = js.native
    
    var root: typings.xmppXml.mod.Element | Null = js.native
  }
  object Parser {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@xmpp/xml", "Parser.XMLError")
    @js.native
    open class XMLError ()
      extends typings.xmppXml.mod.XMLError
    /* static member */
    /* was `typeof XMLError` */
    @JSImport("@xmpp/xml", "Parser.XMLError")
    @js.native
    val XMLError: Instantiable0[typings.xmppXml.mod.XMLError] = js.native
  }
  
  @JSImport("@xmpp/xml", "XMLError")
  @js.native
  open class XMLError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_XMLError: typings.xmppXml.xmppXmlStrings.XMLError = js.native
  }
  
  inline def createElement(name: String, attrs: String, children: typings.ltx.srcElementMod.Node*): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  inline def createElement(name: String, attrs: StringDictionary[Any], children: typings.ltx.srcElementMod.Node*): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  inline def createElement(name: String, attrs: Unit, children: typings.ltx.srcElementMod.Node*): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[default]
  
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
  
  type Node = typings.ltx.srcElementMod.Node
  
  object global {
    
    object JSX {
      
      type Element = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Element */ Any
      
      type IntrinsicElements = StringDictionary[Any]
    }
  }
}
