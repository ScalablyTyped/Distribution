package typings.tabris

import typings.tabris.anon.Href
import typings.tabris.anon.InstantiableAny
import typings.tabris.anon.TextColor
import typings.tabris.anon.`2`
import typings.tabris.mod.JsxProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSX {
  
  type Element = js.Any
  
  trait ElementAttributesProperty extends StObject {
    
    var jsxAttributes: js.Any
  }
  object ElementAttributesProperty {
    
    @scala.inline
    def apply(jsxAttributes: js.Any): ElementAttributesProperty = {
      val __obj = js.Dynamic.literal(jsxAttributes = jsxAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementAttributesProperty]
    }
    
    @scala.inline
    implicit class ElementAttributesPropertyMutableBuilder[Self <: ElementAttributesProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsxAttributes(value: js.Any): Self = StObject.set(x, "jsxAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementChildrenAttribute extends StObject {
    
    var children: js.UndefOr[js.Any] = js.undefined
  }
  object ElementChildrenAttribute {
    
    @scala.inline
    def apply(): ElementChildrenAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementChildrenAttribute]
    }
    
    @scala.inline
    implicit class ElementChildrenAttributeMutableBuilder[Self <: ElementChildrenAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
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
    
    var br: `2`
    
    var del: TextColor
    
    var i: TextColor
    
    var ins: TextColor
    
    var small: TextColor
    
    var span: TextColor
    
    var strong: TextColor
  }
  object IntrinsicElements {
    
    @scala.inline
    def apply(
      a: Href,
      b: TextColor,
      big: TextColor,
      br: `2`,
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
    
    @scala.inline
    implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Href): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: TextColor): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBig(value: TextColor): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBr(value: `2`): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDel(value: TextColor): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: TextColor): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIns(value: TextColor): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmall(value: TextColor): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: TextColor): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrong(value: TextColor): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    }
  }
  
  type JsxFactory = js.ThisFunction2[
    /* this */ JsxProcessor, 
    /* type */ InstantiableAny, 
    /* attributes */ js.Object, 
    Element
  ]
}
