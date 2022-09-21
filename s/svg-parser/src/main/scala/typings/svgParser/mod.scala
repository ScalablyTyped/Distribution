package typings.svgParser

import typings.std.Record
import typings.svgParser.svgParserStrings.element
import typings.svgParser.svgParserStrings.root
import typings.svgParser.svgParserStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(source: String): RootNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[RootNode]
  
  trait ElementNode
    extends StObject
       with Node {
    
    var children: js.Array[Node | String]
    
    var metadata: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[Record[String, String | Double]] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var `type`: element
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ElementNode {
    
    inline def apply(children: js.Array[Node | String]): ElementNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[ElementNode]
    }
    
    extension [Self <: ElementNode](x: Self) {
      
      inline def setChildren(value: js.Array[Node | String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setProperties(value: Record[String, String | Double]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.svgParser.mod.TextNode
    - typings.svgParser.mod.ElementNode
  */
  trait Node extends StObject
  object Node {
    
    inline def ElementNode(children: js.Array[Node | String]): typings.svgParser.mod.ElementNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[typings.svgParser.mod.ElementNode]
    }
    
    inline def TextNode(): typings.svgParser.mod.TextNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[typings.svgParser.mod.TextNode]
    }
  }
  
  trait RootNode extends StObject {
    
    var children: js.Array[Node]
    
    var `type`: root
  }
  object RootNode {
    
    inline def apply(children: js.Array[Node]): RootNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("root")
      __obj.asInstanceOf[RootNode]
    }
    
    extension [Self <: RootNode](x: Self) {
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: root): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextNode
    extends StObject
       with Node {
    
    var `type`: text
    
    var value: js.UndefOr[String | Boolean | Double] = js.undefined
  }
  object TextNode {
    
    inline def apply(): TextNode = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[TextNode]
    }
    
    extension [Self <: TextNode](x: Self) {
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Boolean | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
