package typings.thepiratebay

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DictpropName
    extends /* propName */ StringDictionary[js.Any] {
    
    var link: String = js.native
  }
  object DictpropName {
    
    @scala.inline
    def apply(link: String): DictpropName = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictpropName]
    }
    
    @scala.inline
    implicit class DictpropNameMutableBuilder[Self <: DictpropName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Verified extends StObject {
    
    var verified: js.UndefOr[Boolean] = js.native
  }
  object Verified {
    
    @scala.inline
    def apply(): Verified = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Verified]
    }
    
    @scala.inline
    implicit class VerifiedMutableBuilder[Self <: Verified] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
}
