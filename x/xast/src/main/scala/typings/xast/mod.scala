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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Attributes = StringDictionary[js.UndefOr[String | Null]]
  
  @js.native
  trait Cdata extends Literal {
    
    @JSName("type")
    var type_Cdata: cdata = js.native
  }
  object Cdata {
    
    @scala.inline
    def apply(`type`: cdata, value: js.Any): Cdata = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cdata]
    }
    
    @scala.inline
    implicit class CdataMutableBuilder[Self <: Cdata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: cdata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Comment extends Literal {
    
    @JSName("type")
    var type_Comment: comment = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(`type`: comment, value: js.Any): Comment = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Doctype extends Node {
    
    var name: String = js.native
    
    /**
      * The document’s public identifier.
      */
    var public: js.UndefOr[String] = js.native
    
    /**
      * The document’s system identifier.
      */
    var system: js.UndefOr[String] = js.native
    
    @JSName("type")
    var type_Doctype: doctype = js.native
  }
  object Doctype {
    
    @scala.inline
    def apply(name: String, `type`: doctype): Doctype = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Doctype]
    }
    
    @scala.inline
    implicit class DoctypeMutableBuilder[Self <: Doctype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      @scala.inline
      def setType(value: doctype): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element extends Parent {
    
    /**
      * Information associated with the element.
      */
    var attributes: js.UndefOr[Attributes] = js.native
    
    @JSName("children")
    var children_Element: js.Array[Element | Text | Comment | Instruction | Cdata] = js.native
    
    /**
      * The element's qualified name.
      */
    var name: String = js.native
    
    @JSName("type")
    var type_Element: element = js.native
  }
  object Element {
    
    @scala.inline
    def apply(children: js.Array[Element | Text | Comment | Instruction | Cdata], name: String, `type`: element): Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[Element | Text | Comment | Instruction | Cdata]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: (Element | Text | Comment | Instruction | Cdata)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instruction extends Literal {
    
    var name: String = js.native
    
    @JSName("type")
    var type_Instruction: instruction = js.native
  }
  object Instruction {
    
    @scala.inline
    def apply(name: String, `type`: instruction, value: js.Any): Instruction = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instruction]
    }
    
    @scala.inline
    implicit class InstructionMutableBuilder[Self <: Instruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: instruction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Literal
    extends typings.unist.mod.Literal
  object Literal {
    
    @scala.inline
    def apply(`type`: String, value: js.Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
  }
  
  @js.native
  trait Parent
    extends typings.unist.mod.Parent
  object Parent {
    
    @scala.inline
    def apply(children: js.Array[Node], `type`: String): Parent = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
  }
  
  @js.native
  trait Root extends Parent {
    
    @JSName("type")
    var type_Root: root = js.native
  }
  object Root {
    
    @scala.inline
    def apply(children: js.Array[Node], `type`: root): Root = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends Literal {
    
    @JSName("type")
    var type_Text: text = js.native
  }
  object Text {
    
    @scala.inline
    def apply(`type`: text, value: js.Any): Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
