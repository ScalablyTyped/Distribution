package typings.winstonMail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Ca extends StObject {
    
    var ca: String = js.native
    
    var cert: String = js.native
    
    var key: String = js.native
  }
  object Ca {
    
    @scala.inline
    def apply(ca: String, cert: String, key: String): Ca = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ca]
    }
    
    @scala.inline
    implicit class CaMutableBuilder[Self <: Ca] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ciphers extends StObject {
    
    var ciphers: String = js.native
  }
  object Ciphers {
    
    @scala.inline
    def apply(ciphers: String): Ciphers = {
      val __obj = js.Dynamic.literal(ciphers = ciphers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ciphers]
    }
    
    @scala.inline
    implicit class CiphersMutableBuilder[Self <: Ciphers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    var level: String = js.native
    
    var message: String = js.native
    
    var meta: js.Any = js.native
  }
  object Level {
    
    @scala.inline
    def apply(level: String, message: String, meta: js.Any): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
