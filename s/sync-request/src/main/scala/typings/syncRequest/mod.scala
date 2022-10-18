package typings.syncRequest

import typings.httpBasic.libHttpVerbMod.HttpVerb
import typings.node.urlMod.URL_
import typings.syncRequest.libOptionsMod.Options
import typings.thenRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sync-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: HttpVerb, url: String): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def default(method: HttpVerb, url: String, options: Options): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def default(method: HttpVerb, url: URL_): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Response]
  inline def default(method: HttpVerb, url: URL_, options: Options): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  @JSImport("sync-request", "FormData")
  @js.native
  open class FormData ()
    extends typings.syncRequest.libFormDataMod.FormData
}
