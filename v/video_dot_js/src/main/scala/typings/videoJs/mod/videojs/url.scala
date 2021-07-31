package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object url {
  
  trait URLObject extends StObject {
    
    /**
      * The hash of the url that was parsed.
      */
    var hash: String
    
    /**
      * The host of the url that was parsed.
      */
    var host: String
    
    /**
      * The hostname of the url that was parsed.
      */
    var hostname: String
    
    /**
      * The pathname of the url that was parsed.
      */
    var pathname: String
    
    /**
      * The port of the url that was parsed.
      */
    var port: String
    
    /**
      * The protocol of the url that was parsed.
      */
    var protocol: String
    
    /**
      * The search query of the url that was parsed.
      */
    var search: String
  }
  object URLObject {
    
    @scala.inline
    def apply(
      hash: String,
      host: String,
      hostname: String,
      pathname: String,
      port: String,
      protocol: String,
      search: String
    ): URLObject = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLObject]
    }
    
    @scala.inline
    implicit class URLObjectMutableBuilder[Self <: URLObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
}
