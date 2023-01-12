package typings.xast

import org.scalablytyped.runtime.StringDictionary
import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.NodeData
import typings.unist.mod.Parent
import typings.xast.xastStrings.cdata
import typings.xast.xastStrings.comment
import typings.xast.xastStrings.doctype
import typings.xast.xastStrings.element
import typings.xast.xastStrings.instruction
import typings.xast.xastStrings.root
import typings.xast.xastStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Attributes = StringDictionary[js.UndefOr[String | Null]]
  
  trait Cdata
    extends StObject
       with Literal {
    
    @JSName("type")
    var type_Cdata: cdata
  }
  object Cdata {
    
    inline def apply(value: Any): Cdata = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cdata")
      __obj.asInstanceOf[Cdata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cdata] (val x: Self) extends AnyVal {
      
      inline def setType(value: cdata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Comment
    extends StObject
       with Literal {
    
    @JSName("type")
    var type_Comment: comment
  }
  object Comment {
    
    inline def apply(value: Any): Comment = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Doctype
    extends StObject
       with Node[Data] {
    
    var name: String
    
    /**
      * The document’s public identifier.
      */
    var public: js.UndefOr[String] = js.undefined
    
    /**
      * The document’s system identifier.
      */
    var system: js.UndefOr[String] = js.undefined
    
    @JSName("type")
    var type_Doctype: doctype
  }
  object Doctype {
    
    inline def apply(name: String): Doctype = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("doctype")
      __obj.asInstanceOf[Doctype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Doctype] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      inline def setType(value: doctype): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element
    extends StObject
       with Parent[Node[Data], NodeData[Node[Data]]] {
    
    /**
      * Information associated with the element.
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    @JSName("children")
    var children_Element: js.Array[Comment | Cdata | Element | Text | Instruction]
    
    /**
      * The element's qualified name.
      */
    var name: String
    
    @JSName("type")
    var type_Element: element
  }
  object Element {
    
    inline def apply(children: js.Array[Comment | Cdata | Element | Text | Instruction], name: String): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setChildren(value: js.Array[Comment | Cdata | Element | Text | Instruction]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Comment | Cdata | Element | Text | Instruction)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementChildMap extends StObject {
    
    var cdata: Cdata
    
    var comment: Comment
    
    var element: Element
    
    var instruction: Instruction
    
    var text: Text
  }
  object ElementChildMap {
    
    inline def apply(cdata: Cdata, comment: Comment, element: Element, instruction: Instruction, text: Text): ElementChildMap = {
      val __obj = js.Dynamic.literal(cdata = cdata.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementChildMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementChildMap] (val x: Self) extends AnyVal {
      
      inline def setCdata(value: Cdata): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInstruction(value: Instruction): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Instruction
    extends StObject
       with Literal {
    
    var name: String
    
    @JSName("type")
    var type_Instruction: instruction
  }
  object Instruction {
    
    inline def apply(name: String, value: Any): Instruction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("instruction")
      __obj.asInstanceOf[Instruction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Instruction] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: instruction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Literal
    extends StObject
       with typings.unist.mod.Literal[Any, Data]
  object Literal {
    
    inline def apply(`type`: String, value: Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
  }
  
  trait Root
    extends StObject
       with Parent[Node[Data], NodeData[Node[Data]]] {
    
    @JSName("children")
    var children_Root: js.Array[Comment | Cdata | Element | Doctype | Text | Instruction]
    
    @JSName("type")
    var type_Root: root
  }
  object Root {
    
    inline def apply(children: js.Array[Comment | Cdata | Element | Doctype | Text | Instruction]): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Comment | Cdata | Element | Doctype | Text | Instruction]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Comment | Cdata | Element | Doctype | Text | Instruction)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RootChildMap extends StObject {
    
    var cdata: Cdata
    
    var comment: Comment
    
    var doctype: Doctype
    
    var element: Element
    
    var instruction: Instruction
    
    var text: Text
  }
  object RootChildMap {
    
    inline def apply(
      cdata: Cdata,
      comment: Comment,
      doctype: Doctype,
      element: Element,
      instruction: Instruction,
      text: Text
    ): RootChildMap = {
      val __obj = js.Dynamic.literal(cdata = cdata.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], doctype = doctype.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootChildMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootChildMap] (val x: Self) extends AnyVal {
      
      inline def setCdata(value: Cdata): Self = StObject.set(x, "cdata", value.asInstanceOf[js.Any])
      
      inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setDoctype(value: Doctype): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInstruction(value: Instruction): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
      
      inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with Literal {
    
    @JSName("type")
    var type_Text: text
  }
  object Text {
    
    inline def apply(value: Any): Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
