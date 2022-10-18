package typings.vscodeLanguageclient.libCommonDiagnosticMod

import typings.vscode.mod.TextDocument
import typings.vscode.mod.Uri
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticPullOptions_ extends StObject {
  
  /**
    * An optional filter method that is consulted when triggering a
    * diagnostic pull during document change or document save.
    *
    * @param document the document that changed or got saved
    * @param mode the mode
    */
  var filter: js.UndefOr[
    js.Function2[/* document */ TextDocument, /* mode */ DiagnosticPullMode, Boolean]
  ] = js.undefined
  
  /**
    * An optional match method that is consulted when pulling for diagnostics
    * when only a URI is known (e.g. for not instantiated tabs)
    *
    * @param documentSelector the document selector
    * @param resource the resource
    */
  var `match`: js.UndefOr[
    js.Function2[/* documentSelector */ DocumentSelector, /* resource */ Uri, Boolean]
  ] = js.undefined
  
  /**
    * Whether to pull for diagnostics on document change.
    */
  var onChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to pull for diagnostics on document save.
    */
  var onSave: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to pull for diagnostics on resources of non instantiated
    * tabs. If it is set to true it is highly recommended to provide
    * a match method as well. Otherwise the client will not pull for
    * tabs if the used document selector specifies a language property
    * since the language value is not known for resources.
    */
  var onTabs: js.UndefOr[Boolean] = js.undefined
}
object DiagnosticPullOptions_ {
  
  inline def apply(): DiagnosticPullOptions_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnosticPullOptions_]
  }
  
  extension [Self <: DiagnosticPullOptions_](x: Self) {
    
    inline def setFilter(value: (/* document */ TextDocument, /* mode */ DiagnosticPullMode) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMatch(value: (/* documentSelector */ DocumentSelector, /* resource */ Uri) => Boolean): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setOnChange(value: Boolean): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnSave(value: Boolean): Self = StObject.set(x, "onSave", value.asInstanceOf[js.Any])
    
    inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
    
    inline def setOnTabs(value: Boolean): Self = StObject.set(x, "onTabs", value.asInstanceOf[js.Any])
    
    inline def setOnTabsUndefined: Self = StObject.set(x, "onTabs", js.undefined)
  }
}
