package typings.tablesorter

import typings.jquery.JQuery_.AjaxSettings
import typings.jquery.JQuery_.jqXHR
import typings.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Paging/AjaxErrorHandler", JSImport.Namespace)
@js.native
object ajaxErrorHandlerMod extends js.Object {
  type AjaxErrorHandler[TElement] = js.Function4[
    /* config */ TablesorterConfigurationStore[TElement], 
    /* request */ jqXHR[js.Any], 
    /* ajaxSettings */ AjaxSettings[js.Any], 
    /* thrownError */ String, 
    String
  ]
}

