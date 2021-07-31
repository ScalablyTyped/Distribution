package typings.styledJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: String
    
    var styles: String
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String, styles: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nonce extends StObject {
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object Nonce {
    
    @scala.inline
    def apply(): Nonce = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nonce]
    }
    
    @scala.inline
    implicit class NonceMutableBuilder[Self <: Nonce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
}
