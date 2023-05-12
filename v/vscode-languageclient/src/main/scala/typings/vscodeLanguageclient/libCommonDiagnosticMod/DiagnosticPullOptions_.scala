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
    * The document gets filtered if the method returns `true`.
    *
    * @param document The document that changed or got saved.
    * @param mode The pull mode.
    * @returns whether the document should be filtered (`true`) or not.
    */
  var filter: js.UndefOr[
    js.Function2[/* document */ TextDocument, /* mode */ DiagnosticPullMode, Boolean]
  ] = js.undefined
  
  /**
    * An optional match method that is consulted when pulling for diagnostics
    * when only a URI is known (e.g. for not instantiated tabs)
    *
    * The method should return `true` if the document selector matches the
    * given resource. See also the `vscode.languages.match` function.
    *
    * @param documentSelector The document selector.
    * @param resource The resource.
    * @returns whether the resource is matched by the given document selector.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagnosticPullOptions_] (val x: Self) extends AnyVal {
    
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
