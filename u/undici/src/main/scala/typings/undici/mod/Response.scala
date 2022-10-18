package typings.undici.mod

import typings.node.urlMod.URL_
import typings.undici.typesFetchMod.BodyInit
import typings.undici.typesFetchMod.ResponseInit
import typings.undici.typesFetchMod.ResponseRedirectStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("undici", "Response")
@js.native
open class Response ()
  extends typings.undici.typesFetchMod.Response {
  def this(body: BodyInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}
/* static members */
object Response {
  
  @JSImport("undici", "Response")
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(): typings.undici.typesFetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.undici.typesFetchMod.Response]
  
  inline def json(data: Any): typings.undici.typesFetchMod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[typings.undici.typesFetchMod.Response]
  inline def json(data: Any, init: ResponseInit): typings.undici.typesFetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[typings.undici.typesFetchMod.Response]
  
  inline def redirect(url: String, status: ResponseRedirectStatus): typings.undici.typesFetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.undici.typesFetchMod.Response]
  inline def redirect(url: URL_, status: ResponseRedirectStatus): typings.undici.typesFetchMod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.undici.typesFetchMod.Response]
}
