package typings.utilityTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[A /* <: js.Object */] extends StObject {
    
    var __brand: /* keyof A */ String
  }
  object `0` {
    
    inline def apply[A /* <: js.Object */](__brand: /* keyof A */ String): `0`[A] = {
      val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[A]]
    }
    
    extension [Self <: `0`[?], A /* <: js.Object */](x: Self & `0`[A]) {
      
      inline def set__brand(value: /* keyof A */ String): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
  
  trait Brand[U] extends StObject {
    
    var __brand: U
  }
  object Brand {
    
    inline def apply[U](__brand: U): Brand[U] = {
      val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[Brand[U]]
    }
    
    extension [Self <: Brand[?], U](x: Self & Brand[U]) {
      
      inline def set__brand(value: U): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
}
