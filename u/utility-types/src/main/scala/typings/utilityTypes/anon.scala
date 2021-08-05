package typings.utilityTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Brand[A /* <: js.Object */] extends StObject {
    
    var __brand: /* keyof A */ String
  }
  object Brand {
    
    inline def apply[A /* <: js.Object */](__brand: /* keyof A */ String): Brand[A] = {
      val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Brand[A]]
    }
    
    extension [Self <: Brand[?], A /* <: js.Object */](x: Self & Brand[A]) {
      
      inline def set__brand(value: /* keyof A */ String): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
  
  trait BrandU[U] extends StObject {
    
    var __brand: U
  }
  object BrandU {
    
    inline def apply[U](__brand: U): BrandU[U] = {
      val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandU[U]]
    }
    
    extension [Self <: BrandU[?], U](x: Self & BrandU[U]) {
      
      inline def set__brand(value: U): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
}
