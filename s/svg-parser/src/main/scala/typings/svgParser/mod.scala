package typings.svgParser

import typings.std.Record
import typings.svgParser.svgParserStrings.element
import typings.svgParser.svgParserStrings.root
import typings.svgParser.svgParserStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-parser", "parse")
  @js.native
  def parse(source: String): RootNode = js.native
  
  @js.native
  trait ElementNode extends Node {
    
    var children: js.Array[Node | String] = js.native
    
    var metadata: js.UndefOr[String] = js.native
    
    var properties: js.UndefOr[Record[String, String | Double]] = js.native
    
    var tagName: js.UndefOr[String] = js.native
    
    var `type`: element = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object ElementNode {
    
    @scala.inline
    def apply(children: js.Array[Node | String], `type`: element): ElementNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementNode]
    }
    
    @scala.inline
    implicit class ElementNodeMutableBuilder[Self <: ElementNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Node | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: (Node | String)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setProperties(value: Record[String, String | Double]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.svgParser.mod.TextNode
    - typings.svgParser.mod.ElementNode
  */
  trait Node extends StObject
  object Node {
    
    @scala.inline
    def ElementNode(children: js.Array[Node | String], `type`: element): typings.svgParser.mod.ElementNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgParser.mod.ElementNode]
    }
    
    @scala.inline
    def TextNode(`type`: text): typings.svgParser.mod.TextNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.svgParser.mod.TextNode]
    }
  }
  
  @js.native
  trait RootNode extends StObject {
    
    var children: js.Array[Node] = js.native
    
    var `type`: root = js.native
  }
  object RootNode {
    
    @scala.inline
    def apply(children: js.Array[Node], `type`: root): RootNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootNode]
    }
    
    @scala.inline
    implicit class RootNodeMutableBuilder[Self <: RootNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextNode extends Node {
    
    var `type`: text = js.native
    
    var value: js.UndefOr[String | Boolean | Double] = js.native
  }
  object TextNode {
    
    @scala.inline
    def apply(`type`: text): TextNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextNode]
    }
    
    @scala.inline
    implicit class TextNodeMutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | Boolean | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
