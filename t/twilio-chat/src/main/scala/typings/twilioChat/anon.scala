package typings.twilioChat

import typings.std.Date
import typings.twilioChat.twilioChatStrings.active
import typings.twilioChat.twilioChatStrings.closed
import typings.twilioChat.twilioChatStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Current extends StObject {
    
    var current: active | inactive | closed
    
    var dateUpdated: Date
  }
  object Current {
    
    @scala.inline
    def apply(current: active | inactive | closed, dateUpdated: Date): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    @scala.inline
    implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: active | inactive | closed): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUpdated(value: Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identity extends StObject {
    
    var identity: String
    
    var user: String
  }
  object Identity {
    
    @scala.inline
    def apply(identity: String, user: String): Identity = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
