package typings.xast

import org.scalablytyped.runtime.StringDictionary
import typings.unist.mod.Node
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
    
    inline def apply(value: js.Any): Cdata = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cdata")
      __obj.asInstanceOf[Cdata]
    }
    
    extension [Self <: Cdata](x: Self) {
      
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
    
    inline def apply(value: js.Any): Comment = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Doctype
    extends StObject
       with Node {
    
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
    
    extension [Self <: Doctype](x: Self) {
      
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
       with Parent {
    
    /**
      * Information associated with the element.
      */
    var attributes: js.UndefOr[Attributes] = js.undefined
    
    @JSName("children")
    var children_Element: js.Array[Element | Text | Comment | Instruction | Cdata]
    
    /**
      * The element's qualified name.
      */
    var name: String
    
    @JSName("type")
    var type_Element: element
  }
  object Element {
    
    inline def apply(children: js.Array[Element | Text | Comment | Instruction | Cdata], name: String): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setChildren(value: js.Array[Element | Text | Comment | Instruction | Cdata]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Element | Text | Comment | Instruction | Cdata)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(name: String, value: js.Any): Instruction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("instruction")
      __obj.asInstanceOf[Instruction]
    }
    
    extension [Self <: Instruction](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: instruction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Literal
    extends StObject
       with typings.unist.mod.Literal
  object Literal {
    
    inline def apply(`type`: String, value: js.Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
  }
  
  trait Parent
    extends StObject
       with typings.unist.mod.Parent
  object Parent {
    
    inline def apply(children: js.Array[Node], `type`: String): Parent = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
  }
  
  trait Root
    extends StObject
       with Parent {
    
    @JSName("type")
    var type_Root: root
  }
  object Root {
    
    inline def apply(children: js.Array[Node]): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text
    extends StObject
       with Literal {
    
    @JSName("type")
    var type_Text: text
  }
  object Text {
    
    inline def apply(value: js.Any): Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
