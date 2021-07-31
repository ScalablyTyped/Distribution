package typings.x509Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CommonName extends StObject {
    
    var commonName: String
  }
  object CommonName {
    
    @scala.inline
    def apply(commonName: String): CommonName = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonName]
    }
    
    @scala.inline
    implicit class CommonNameMutableBuilder[Self <: CommonName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    }
  }
}
