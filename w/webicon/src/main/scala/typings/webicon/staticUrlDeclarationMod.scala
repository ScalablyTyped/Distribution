package typings.webicon

import typings.webicon.urlDeclarationBaseMod.UrlDeclarationBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticUrlDeclarationMod {
  
  trait StaticUrlDeclaration
    extends StObject
       with UrlDeclarationBase {
    
    @JSName("url")
    var url_StaticUrlDeclaration: js.UndefOr[String] = js.undefined
  }
  object StaticUrlDeclaration {
    
    inline def apply(): StaticUrlDeclaration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaticUrlDeclaration]
    }
    
    extension [Self <: StaticUrlDeclaration](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
