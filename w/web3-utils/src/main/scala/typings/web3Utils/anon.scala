package typings.web3Utils

import typings.bnJs.mod.^
import typings.web3Utils.mod._Mixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait R extends StObject {
    
    var r: String = js.native
    
    var s: String = js.native
    
    var v: Double = js.native
  }
  object R {
    
    @scala.inline
    def apply(r: String, s: String, v: Double): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait T extends _Mixed {
    
    var t: String = js.native
    
    var v: String | ^ | Double = js.native
  }
  object T {
    
    @scala.inline
    def apply(t: String, v: String | ^ | Double): T = {
      val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[T]
    }
    
    @scala.inline
    implicit class TMutableBuilder[Self <: T] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: String | ^ | Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends _Mixed {
    
    var `type`: String = js.native
    
    var value: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: String, value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
