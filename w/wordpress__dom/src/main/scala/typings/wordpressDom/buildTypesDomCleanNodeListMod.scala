package typings.wordpressDom

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.Node
import typings.std.NodeList
import typings.wordpressDom.wordpressDomStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomCleanNodeListMod {
  
  @JSImport("@wordpress/dom/build-types/dom/clean-node-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nodeList: NodeList, doc: Document, schema: Schema, `inline`: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodeList.asInstanceOf[js.Any], doc.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Schema = StringDictionary[SchemaItem]
  
  trait SchemaItem extends StObject {
    
    /**
      * Whether to allow nodes without children.
      */
    var allowEmpty: Boolean
    
    /**
      * Attributes.
      */
    var attributes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Child schemas.
      */
    var children: js.UndefOr[Asterisk | StringDictionary[SchemaItem]] = js.undefined
    
    /**
      * Classnames or RegExp to test against.
      */
    var classes: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
      * Function to test whether a node is a match. If left undefined any node will be assumed to match.
      */
    var isMatch: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
    
    /**
      * Selectors to test required children against. Leave empty or undefined if there are no requirements.
      */
    var require: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SchemaItem {
    
    inline def apply(allowEmpty: Boolean): SchemaItem = {
      val __obj = js.Dynamic.literal(allowEmpty = allowEmpty.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaItem] (val x: Self) extends AnyVal {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildren(value: Asterisk | StringDictionary[SchemaItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClasses(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setClassesVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "classes", js.Array(value*))
      
      inline def setIsMatch(value: /* node */ Node => Boolean): Self = StObject.set(x, "isMatch", js.Any.fromFunction1(value))
      
      inline def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
      
      inline def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
    }
  }
}
