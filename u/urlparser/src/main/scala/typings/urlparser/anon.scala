package typings.urlparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: String
    
    var hash: String
    
    var name: String
  }
  object Base {
    
    @scala.inline
    def apply(base: String, hash: String, name: String): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hostname extends StObject {
    
    var hostname: String
    
    var password: String
    
    var port: String | Double
    
    var protocol: String
    
    var username: String
  }
  object Hostname {
    
    @scala.inline
    def apply(hostname: String, password: String, port: String | Double, protocol: String, username: String): Hostname = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hostname]
    }
    
    @scala.inline
    implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: js.Object
    
    var parts: js.Array[String]
  }
  object Params {
    
    @scala.inline
    def apply(params: js.Object, parts: js.Array[String]): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParts(value: js.Array[String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: String*): Self = StObject.set(x, "parts", js.Array(value :_*))
    }
  }
}
