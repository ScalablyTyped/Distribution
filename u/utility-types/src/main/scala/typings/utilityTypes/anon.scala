package typings.utilityTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Brand[A /* <: js.Object */] extends StObject {
    
    var __brand: /* keyof A */ String = js.native
  }
  object Brand {
    
    @scala.inline
    def apply[A /* <: js.Object */](__brand: /* keyof A */ String): Brand[A] = {
      val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Brand[A]]
    }
    
    @scala.inline
    implicit class BrandMutableBuilder[Self <: Brand[_], A /* <: js.Object */] (val x: Self with Brand[A]) extends AnyVal {
      
      @scala.inline
      def set__brand(value: /* keyof A */ String): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrandU[U] extends StObject {
    
    var __brand: U = js.native
  }
  object BrandU {
    
    @scala.inline
    def apply[U](__brand: U): BrandU[U] = {
      val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandU[U]]
    }
    
    @scala.inline
    implicit class BrandUMutableBuilder[Self <: BrandU[_], U] (val x: Self with BrandU[U]) extends AnyVal {
      
      @scala.inline
      def set__brand(value: U): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
}
