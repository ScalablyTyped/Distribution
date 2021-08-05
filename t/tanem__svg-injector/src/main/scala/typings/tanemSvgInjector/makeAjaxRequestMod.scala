package typings.tanemSvgInjector

import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeAjaxRequestMod {
  
  @JSImport("@tanem/svg-injector/dist/make-ajax-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    url: String,
    callback: js.Function2[/* error */ Error | Null, /* httpRequest */ XMLHttpRequest, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
