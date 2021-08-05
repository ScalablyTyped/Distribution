package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPaneSuggestionsRequestDeferral
  extends StObject
     with ISearchPaneSuggestionsRequestDeferral
object SearchPaneSuggestionsRequestDeferral {
  
  inline def apply(complete: () => Unit): SearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SearchPaneSuggestionsRequestDeferral]
  }
}
