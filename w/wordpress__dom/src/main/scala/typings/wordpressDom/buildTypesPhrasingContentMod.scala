package typings.wordpressDom

import typings.std.Node
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPhrasingContentMod {
  
  @JSImport("@wordpress/dom/build-types/phrasing-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPhrasingContentSchema(): Partial[ContentSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")().asInstanceOf[Partial[ContentSchema]]
  inline def getPhrasingContentSchema(context: String): Partial[ContentSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")(context.asInstanceOf[js.Any]).asInstanceOf[Partial[ContentSchema]]
  
  inline def isPhrasingContent(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhrasingContent")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTextContent(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextContent")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ContentSchema = Record[String, SemanticElementDefinition]
  
  trait SemanticElementDefinition extends StObject {
    
    /**
      * Content attributes
      */
    var attributes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Content attributes
      */
    var children: js.UndefOr[ContentSchema] = js.undefined
  }
  object SemanticElementDefinition {
    
    inline def apply(): SemanticElementDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticElementDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticElementDefinition] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildren(value: ContentSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
