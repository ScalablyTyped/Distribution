package typings.urlparser

import org.scalablytyped.runtime.Shortcut
import typings.urlparser.anon.Base
import typings.urlparser.anon.Hostname
import typings.urlparser.anon.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("urlparser", JSImport.Namespace)
  @js.native
  val ^ : UrlParser = js.native
  
  trait UrlData extends StObject {
    
    var host: Hostname
    
    var path: Base
    
    var query: Params
  }
  object UrlData {
    
    @scala.inline
    def apply(host: Hostname, path: Base, query: Params): UrlData = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlData]
    }
    
    @scala.inline
    implicit class UrlDataMutableBuilder[Self <: UrlData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: Hostname): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: Base): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: Params): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UrlParser extends StObject {
    
    def host(): String = js.native
    def host(o: UrlData): String = js.native
    
    def parse(parse: String): UrlData = js.native
    
    def path(): String = js.native
    def path(o: UrlData): String = js.native
    
    def query(): String = js.native
    def query(o: UrlData): String = js.native
    
    def url(): String = js.native
    def url(o: UrlData): String = js.native
  }
  
  type _To = UrlParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UrlParser = ^
}
