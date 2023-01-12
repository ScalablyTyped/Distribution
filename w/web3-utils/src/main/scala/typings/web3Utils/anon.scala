package typings.web3Utils

import typings.bnJs.mod.^
import typings.web3Utils.mod._Mixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait R extends StObject {
    
    var r: String
    
    var s: String
    
    var v: Double
  }
  object R {
    
    inline def apply(r: String, s: String, v: Double): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait T
    extends StObject
       with _Mixed {
    
    var t: String
    
    var v: String | ^ | Double
  }
  object T {
    
    inline def apply(t: String, v: String | ^ | Double): T = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[T]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: T] (val x: Self) extends AnyVal {
      
      inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setV(value: String | ^ | Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with _Mixed {
    
    var `type`: String
    
    var value: String
  }
  object Type {
    
    inline def apply(`type`: String, value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
