package typings.xmlrpc

import typings.std.Date
import typings.xmlrpc.mod.HeadersProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Expires extends StObject {
    
    var expires: Date = js.native
    
    var secure: Boolean = js.native
  }
  object Expires {
    
    @scala.inline
    def apply(expires: Date, secure: Boolean): Expires = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expires]
    }
    
    @scala.inline
    implicit class ExpiresMutableBuilder[Self <: Expires] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pass extends StObject {
    
    var pass: String = js.native
    
    var user: String = js.native
  }
  object Pass {
    
    @scala.inline
    def apply(pass: String, user: String): Pass = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pass]
    }
    
    @scala.inline
    implicit class PassMutableBuilder[Self <: Pass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Processors extends StObject {
    
    var processors: js.Array[HeadersProcessor] = js.native
  }
  object Processors {
    
    @scala.inline
    def apply(processors: js.Array[HeadersProcessor]): Processors = {
      val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Processors]
    }
    
    @scala.inline
    implicit class ProcessorsMutableBuilder[Self <: Processors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessors(value: js.Array[HeadersProcessor]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessorsVarargs(value: HeadersProcessor*): Self = StObject.set(x, "processors", js.Array(value :_*))
    }
  }
}
