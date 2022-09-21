package typings.webcryptoCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Required<webcrypto-core.webcrypto-core.ShakeParams> */
  trait RequiredShakeParams extends StObject {
    
    var length: Double
    
    var name: String
  }
  object RequiredShakeParams {
    
    inline def apply(length: Double, name: String): RequiredShakeParams = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredShakeParams]
    }
    
    extension [Self <: RequiredShakeParams](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: String
    
    var y: String
  }
  object X {
    
    inline def apply(x: String, y: String): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait XString extends StObject {
    
    var x: String
  }
  object XString {
    
    inline def apply(x: String): XString = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[XString]
    }
    
    extension [Self <: XString](x: Self) {
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
}
