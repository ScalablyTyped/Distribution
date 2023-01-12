package typings.xmlParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(xml: String): Document = ^.asInstanceOf[js.Dynamic].apply(xml.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  @JSImport("xml-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Attributes = StringDictionary[String]
  
  trait Declaration extends StObject {
    
    var attributes: Attributes
  }
  object Declaration {
    
    inline def apply(attributes: Attributes): Declaration = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Declaration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Declaration] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Document extends StObject {
    
    var declaration: Declaration
    
    var root: Node
  }
  object Document {
    
    inline def apply(declaration: Declaration, root: Node): Document = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      inline def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Node): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var attributes: Attributes
    
    var children: js.Array[Node]
    
    var content: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Node {
    
    inline def apply(attributes: Attributes, children: js.Array[Node], name: String): Node = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
