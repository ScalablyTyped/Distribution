package typings.styledJsx

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.styledJsx.styledJsxMod.StyledJsxStyleRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: Element | ReactNode
    
    var registry: js.UndefOr[StyledJsxStyleRegistry] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: Element | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRegistry(value: StyledJsxStyleRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  trait ClassName extends StObject {
    
    var className: String
    
    var styles: Element
  }
  object ClassName {
    
    inline def apply(className: String, styles: Element): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: Element): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nonce extends StObject {
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object Nonce {
    
    inline def apply(): Nonce = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nonce]
    }
    
    extension [Self <: Nonce](x: Self) {
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
}
