package typings.thepiratebay

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictpropName
    extends StObject
       with /* propName */ StringDictionary[js.Any] {
    
    var link: String
  }
  object DictpropName {
    
    inline def apply(link: String): DictpropName = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictpropName]
    }
    
    extension [Self <: DictpropName](x: Self) {
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  trait Verified extends StObject {
    
    var verified: js.UndefOr[Boolean] = js.undefined
  }
  object Verified {
    
    inline def apply(): Verified = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Verified]
    }
    
    extension [Self <: Verified](x: Self) {
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
    }
  }
}
