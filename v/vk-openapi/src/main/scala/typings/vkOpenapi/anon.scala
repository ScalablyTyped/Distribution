package typings.vkOpenapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Domain extends StObject {
    
    var domain: String = js.native
    
    var first_name: String = js.native
    
    var href: String = js.native
    
    var id: String = js.native
    
    var last_name: String = js.native
    
    var nickname: String = js.native
  }
  object Domain {
    
    @scala.inline
    def apply(domain: String, first_name: String, href: String, id: String, last_name: String, nickname: String): Domain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    }
  }
}
