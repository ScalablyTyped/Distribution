package typings.webicon

import typings.webicon.webUrlDeclarationBaseMod.UrlDeclarationBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webStaticUrlDeclarationMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaticUrlDeclaration] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
