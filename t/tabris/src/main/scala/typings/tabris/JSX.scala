package typings.tabris

import typings.tabris.anon.Href
import typings.tabris.anon.InstantiableAny
import typings.tabris.anon.TextColor
import typings.tabris.anon.`4`
import typings.tabris.mod.JsxProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSX {
  
  type Element = Any
  
  trait ElementAttributesProperty extends StObject {
    
    var jsxAttributes: Any
  }
  object ElementAttributesProperty {
    
    inline def apply(jsxAttributes: Any): ElementAttributesProperty = {
      val __obj = js.Dynamic.literal(jsxAttributes = jsxAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementAttributesProperty]
    }
    
    extension [Self <: ElementAttributesProperty](x: Self) {
      
      inline def setJsxAttributes(value: Any): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementChildrenAttribute extends StObject {
    
    var children: js.UndefOr[Any] = js.undefined
  }
  object ElementChildrenAttribute {
    
    inline def apply(): ElementChildrenAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementChildrenAttribute]
    }
    
    extension [Self <: ElementChildrenAttribute](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait ElementClass extends StObject {
    
    var jsxAttributes: js.UndefOr[js.Object] = js.native
  }
  
  trait IntrinsicElements extends StObject {
    
    var a: Href
    
    var b: TextColor
    
    var big: TextColor
    
    var br: `4`
    
    var del: TextColor
    
    var i: TextColor
    
    var ins: TextColor
    
    var small: TextColor
    
    var span: TextColor
    
    var strong: TextColor
  }
  object IntrinsicElements {
    
    inline def apply(
      a: Href,
      b: TextColor,
      big: TextColor,
      br: `4`,
      del: TextColor,
      i: TextColor,
      ins: TextColor,
      small: TextColor,
      span: TextColor,
      strong: TextColor
    ): IntrinsicElements = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntrinsicElements]
    }
    
    extension [Self <: IntrinsicElements](x: Self) {
      
      inline def setA(value: Href): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: TextColor): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBig(value: TextColor): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
      
      inline def setBr(value: `4`): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      inline def setDel(value: TextColor): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      inline def setI(value: TextColor): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIns(value: TextColor): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: TextColor): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSpan(value: TextColor): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: TextColor): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    }
  }
  
  type JsxFactory = js.ThisFunction2[
    /* this */ JsxProcessor, 
    /* type */ InstantiableAny, 
    /* attributes */ js.Object, 
    Element
  ]
}
