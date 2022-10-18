package typings.unsplashJs

import typings.std.Response
import typings.unsplashJs.distHelpersTypescriptMod.AnyJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersJsonMod {
  
  @JSImport("unsplash-js/dist/helpers/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getJsonResponse(response: Response): js.Promise[AnyJson] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJsonResponse")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AnyJson]]
}
