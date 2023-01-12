package typings.styledJsx

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.styledJsx.mod.StyledJsxStyleRegistry
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nonce] (val x: Self) extends AnyVal {
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
}
