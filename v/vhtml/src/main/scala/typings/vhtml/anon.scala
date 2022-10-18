package typings.vhtml

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ChildrenChildren[Children /* <: js.Array[Any] */] extends StObject {
    
    var children: Children
  }
  object ChildrenChildren {
    
    inline def apply[Children /* <: js.Array[Any] */](children: Children): ChildrenChildren[Children] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenChildren[Children]]
    }
    
    extension [Self <: ChildrenChildren[?], Children /* <: js.Array[Any] */](x: Self & ChildrenChildren[Children]) {
      
      inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictattr
    extends StObject
       with /* attr */ StringDictionary[Any] {
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
  }
  object Dictattr {
    
    inline def apply(): Dictattr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictattr]
    }
    
    extension [Self <: Dictattr](x: Self) {
      
      inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var __html: String
  }
  object Html {
    
    inline def apply(__html: String): Html = {
      val __obj = js.Dynamic.literal(__html = __html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def set__html(value: String): Self = StObject.set(x, "__html", value.asInstanceOf[js.Any])
    }
  }
}
