package typings.tablesorter

import typings.jquery.JQuery.AjaxSettings
import typings.jquery.JQuery.jqXHR
import typings.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagingAjaxErrorHandlerMod {
  
  type AjaxErrorHandler[TElement] = js.Function4[
    /* config */ TablesorterConfigurationStore[TElement], 
    /* request */ jqXHR[Any], 
    /* ajaxSettings */ AjaxSettings[Any], 
    /* thrownError */ String, 
    String
  ]
}
