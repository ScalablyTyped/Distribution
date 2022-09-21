package typings.vhtml

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var children: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any
      ]
  }
  object `0` {
    
    inline def apply(
      children: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any
        ]
    ): `0` = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait `1` extends StObject {
    
    var children: js.Array[
        js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any
        ]
      ]
  }
  object `1` {
    
    inline def apply(
      children: js.Array[
          js.UndefOr[
            /* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any
          ]
        ]
    ): `1` = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (js.UndefOr[
              /* import warning: importer.ImportType#apply Failed type conversion: infer ChildType */ js.Any
            ])*
      ): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait `2` extends StObject {
    
    var children: js.UndefOr[Any] = js.undefined
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait `3` extends StObject {
    
    var children: js.UndefOr[Any | js.Array[Any]] = js.undefined
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setChildren(value: Any | js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait Children extends StObject {
    
    var children: js.Array[Any]
  }
  object Children {
    
    inline def apply(children: js.Array[Any]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Any*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait ChildrenAny extends StObject {
    
    var children: Any
  }
  object ChildrenAny {
    
    inline def apply(children: Any): ChildrenAny = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenAny]
    }
    
    extension [Self <: ChildrenAny](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChildrenArray extends StObject {
    
    var children: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: infer ChildrenType */ js.Any
      ]
  }
  object ChildrenArray {
    
    inline def apply(
      children: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: infer ChildrenType */ js.Any
        ]
    ): ChildrenArray = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenArray]
    }
    
    extension [Self <: ChildrenArray](x: Self) {
      
      inline def setChildren(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: infer ChildrenType */ js.Any
            ]
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: infer ChildrenType */ js.Any)*
      ): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
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
