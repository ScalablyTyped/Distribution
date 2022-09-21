package typings.unsplashJs

import typings.unsplashJs.typescriptMod.AnyJson
import typings.unsplashJs.typescriptMod.NonEmptyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("unsplash-js/dist/helpers/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unsplash-js/dist/helpers/errors", "DecodingError")
  @js.native
  open class DecodingError protected () extends StObject {
    def this(message: String) = this()
    
    val message: String = js.native
  }
  
  inline def getErrorForBadStatusCode(jsonResponse: AnyJson): typings.unsplashJs.anon.Errors = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorForBadStatusCode")(jsonResponse.asInstanceOf[js.Any]).asInstanceOf[typings.unsplashJs.anon.Errors]
  
  /* Rewritten from type alias, can be one of: 
    - typings.unsplashJs.unsplashJsStrings.api
    - typings.unsplashJs.unsplashJsStrings.decoding
  */
  trait ErrorSource extends StObject
  object ErrorSource {
    
    inline def api: typings.unsplashJs.unsplashJsStrings.api = "api".asInstanceOf[typings.unsplashJs.unsplashJsStrings.api]
    
    inline def decoding: typings.unsplashJs.unsplashJsStrings.decoding = "decoding".asInstanceOf[typings.unsplashJs.unsplashJsStrings.decoding]
  }
  
  type Errors = NonEmptyArray[String]
}
