package typings.tanemSvgInjector

import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tanem/svg-injector/dist/make-ajax-request", JSImport.Namespace)
@js.native
object makeAjaxRequestMod extends js.Object {
  
  def default(
    url: String,
    callback: js.Function2[/* error */ Error | Null, /* httpRequest */ XMLHttpRequest, Unit]
  ): Unit = js.native
}
