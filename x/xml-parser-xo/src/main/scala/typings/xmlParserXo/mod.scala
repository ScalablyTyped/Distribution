package typings.xmlParserXo

import typings.std.Error
import typings.std.Record
import typings.xmlParserXo.xmlParserXoStrings.CDATA
import typings.xmlParserXo.xmlParserXoStrings.Comment
import typings.xmlParserXo.xmlParserXoStrings.DocumentType
import typings.xmlParserXo.xmlParserXoStrings.Element
import typings.xmlParserXo.xmlParserXoStrings.ProcessingInstruction
import typings.xmlParserXo.xmlParserXoStrings.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-parser-xo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse the given XML string into an object.
    */
  inline def default(xml: String): XmlParserResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(xml.asInstanceOf[js.Any]).asInstanceOf[XmlParserResult]
  inline def default(xml: String, options: XmlParserOptions): XmlParserResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[XmlParserResult]
  
  @JSImport("xml-parser-xo", "ParsingError")
  @js.native
  open class ParsingError protected ()
    extends StObject
       with Error {
    def this(message: String, cause: String) = this()
    
    @JSName("cause")
    val cause_ParsingError: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait XmlParserAttribute extends StObject {
    
    var name: String
    
    var value: String
  }
  object XmlParserAttribute {
    
    inline def apply(name: String, value: String): XmlParserAttribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlParserAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserAttribute] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlParserCDATANode
    extends StObject
       with XmlParserElementChildNode {
    
    var content: String
    
    var `type`: CDATA
  }
  object XmlParserCDATANode {
    
    inline def apply(content: String): XmlParserCDATANode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("CDATA")
      __obj.asInstanceOf[XmlParserCDATANode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserCDATANode] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: CDATA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlParserCommentNode
    extends StObject
       with XmlParserElementChildNode {
    
    var content: String
    
    var `type`: Comment
  }
  object XmlParserCommentNode {
    
    inline def apply(content: String): XmlParserCommentNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Comment")
      __obj.asInstanceOf[XmlParserCommentNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserCommentNode] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: Comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xmlParserXo.mod.XmlParserDocumentTypeNode
    - typings.xmlParserXo.mod.XmlParserProcessingInstructionNode
    - typings.xmlParserXo.mod.XmlParserElementChildNode
  */
  trait XmlParserDocumentChildNode extends StObject
  object XmlParserDocumentChildNode {
    
    inline def XmlParserCDATANode(content: String): typings.xmlParserXo.mod.XmlParserCDATANode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("CDATA")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserCDATANode]
    }
    
    inline def XmlParserCommentNode(content: String): typings.xmlParserXo.mod.XmlParserCommentNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Comment")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserCommentNode]
    }
    
    inline def XmlParserDocumentTypeNode(content: String): typings.xmlParserXo.mod.XmlParserDocumentTypeNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("DocumentType")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserDocumentTypeNode]
    }
    
    inline def XmlParserElementNode(attributes: Record[String, String], name: String): typings.xmlParserXo.mod.XmlParserElementNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], children = null)
      __obj.updateDynamic("type")("Element")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserElementNode]
    }
    
    inline def XmlParserProcessingInstructionNode(attributes: Record[String, String], name: String): typings.xmlParserXo.mod.XmlParserProcessingInstructionNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ProcessingInstruction")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserProcessingInstructionNode]
    }
    
    inline def XmlParserTextNode(content: String): typings.xmlParserXo.mod.XmlParserTextNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Text")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserTextNode]
    }
  }
  
  trait XmlParserDocumentTypeNode
    extends StObject
       with XmlParserDocumentChildNode {
    
    var content: String
    
    var `type`: DocumentType
  }
  object XmlParserDocumentTypeNode {
    
    inline def apply(content: String): XmlParserDocumentTypeNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("DocumentType")
      __obj.asInstanceOf[XmlParserDocumentTypeNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserDocumentTypeNode] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: DocumentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xmlParserXo.mod.XmlParserTextNode
    - typings.xmlParserXo.mod.XmlParserElementNode
    - typings.xmlParserXo.mod.XmlParserCDATANode
    - typings.xmlParserXo.mod.XmlParserCommentNode
  */
  trait XmlParserElementChildNode
    extends StObject
       with XmlParserDocumentChildNode
  object XmlParserElementChildNode {
    
    inline def XmlParserCDATANode(content: String): typings.xmlParserXo.mod.XmlParserCDATANode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("CDATA")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserCDATANode]
    }
    
    inline def XmlParserCommentNode(content: String): typings.xmlParserXo.mod.XmlParserCommentNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Comment")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserCommentNode]
    }
    
    inline def XmlParserElementNode(attributes: Record[String, String], name: String): typings.xmlParserXo.mod.XmlParserElementNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], children = null)
      __obj.updateDynamic("type")("Element")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserElementNode]
    }
    
    inline def XmlParserTextNode(content: String): typings.xmlParserXo.mod.XmlParserTextNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Text")
      __obj.asInstanceOf[typings.xmlParserXo.mod.XmlParserTextNode]
    }
  }
  
  trait XmlParserElementNode
    extends StObject
       with XmlParserElementChildNode {
    
    var attributes: Record[String, String]
    
    var children: js.Array[XmlParserElementChildNode] | Null
    
    var name: String
    
    var `type`: Element
  }
  object XmlParserElementNode {
    
    inline def apply(attributes: Record[String, String], name: String): XmlParserElementNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], children = null)
      __obj.updateDynamic("type")("Element")
      __obj.asInstanceOf[XmlParserElementNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserElementNode] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[XmlParserElementChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: XmlParserElementChildNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlParserNode extends StObject {
    
    var `type`: XmlParserNodeType
  }
  object XmlParserNode {
    
    inline def apply(`type`: XmlParserNodeType): XmlParserNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlParserNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserNode] (val x: Self) extends AnyVal {
      
      inline def setType(value: XmlParserNodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xmlParserXo.xmlParserXoStrings.Comment
    - typings.xmlParserXo.xmlParserXoStrings.Text
    - typings.xmlParserXo.xmlParserXoStrings.ProcessingInstruction
    - typings.xmlParserXo.xmlParserXoStrings.Element
    - typings.xmlParserXo.xmlParserXoStrings.DocumentType
    - typings.xmlParserXo.xmlParserXoStrings.CDATA
  */
  trait XmlParserNodeType extends StObject
  object XmlParserNodeType {
    
    inline def CDATA: typings.xmlParserXo.xmlParserXoStrings.CDATA = "CDATA".asInstanceOf[typings.xmlParserXo.xmlParserXoStrings.CDATA]
    
    inline def Comment: typings.xmlParserXo.xmlParserXoStrings.Comment = "Comment".asInstanceOf[typings.xmlParserXo.xmlParserXoStrings.Comment]
    
    inline def DocumentType: typings.xmlParserXo.xmlParserXoStrings.DocumentType = "DocumentType".asInstanceOf[typings.xmlParserXo.xmlParserXoStrings.DocumentType]
    
    inline def Element: typings.xmlParserXo.xmlParserXoStrings.Element = "Element".asInstanceOf[typings.xmlParserXo.xmlParserXoStrings.Element]
    
    inline def ProcessingInstruction: typings.xmlParserXo.xmlParserXoStrings.ProcessingInstruction = "ProcessingInstruction".asInstanceOf[typings.xmlParserXo.xmlParserXoStrings.ProcessingInstruction]
    
    inline def Text: typings.xmlParserXo.xmlParserXoStrings.Text = "Text".asInstanceOf[typings.xmlParserXo.xmlParserXoStrings.Text]
  }
  
  trait XmlParserNodeWrapper[T /* <: XmlParserNode */] extends StObject {
    
    var excluded: Boolean
    
    var node: T
  }
  object XmlParserNodeWrapper {
    
    inline def apply[T /* <: XmlParserNode */](excluded: Boolean, node: T): XmlParserNodeWrapper[T] = {
      val __obj = js.Dynamic.literal(excluded = excluded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlParserNodeWrapper[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserNodeWrapper[?], T /* <: XmlParserNode */] (val x: Self & XmlParserNodeWrapper[T]) extends AnyVal {
      
      inline def setExcluded(value: Boolean): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
      
      inline def setNode(value: T): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlParserOptions extends StObject {
    
    /**
      * Returns false to exclude a node. Default is true.
      */
    var filter: js.UndefOr[js.Function1[/* node */ XmlParserNode, Boolean | Any]] = js.undefined
  }
  object XmlParserOptions {
    
    inline def apply(): XmlParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlParserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: /* node */ XmlParserNode => Boolean | Any): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  trait XmlParserProcessingInstructionNode
    extends StObject
       with XmlParserDocumentChildNode {
    
    var attributes: Record[String, String]
    
    var name: String
    
    var `type`: ProcessingInstruction
  }
  object XmlParserProcessingInstructionNode {
    
    inline def apply(attributes: Record[String, String], name: String): XmlParserProcessingInstructionNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ProcessingInstruction")
      __obj.asInstanceOf[XmlParserProcessingInstructionNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserProcessingInstructionNode] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: ProcessingInstruction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlParserResult extends StObject {
    
    var children: js.Array[XmlParserDocumentChildNode]
    
    var declaration: js.UndefOr[XmlParserProcessingInstructionNode | Null] = js.undefined
    
    var root: XmlParserElementNode
  }
  object XmlParserResult {
    
    inline def apply(children: js.Array[XmlParserDocumentChildNode], root: XmlParserElementNode): XmlParserResult = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlParserResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserResult] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[XmlParserDocumentChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: XmlParserDocumentChildNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDeclaration(value: XmlParserProcessingInstructionNode): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationNull: Self = StObject.set(x, "declaration", null)
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setRoot(value: XmlParserElementNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait XmlParserTextNode
    extends StObject
       with XmlParserElementChildNode {
    
    var content: String
    
    var `type`: Text
  }
  object XmlParserTextNode {
    
    inline def apply(content: String): XmlParserTextNode = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Text")
      __obj.asInstanceOf[XmlParserTextNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlParserTextNode] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: Text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
