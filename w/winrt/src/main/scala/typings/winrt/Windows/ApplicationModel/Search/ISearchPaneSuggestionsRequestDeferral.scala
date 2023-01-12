package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneSuggestionsRequestDeferral extends StObject {
  
  def complete(): Unit
}
object ISearchPaneSuggestionsRequestDeferral {
  
  inline def apply(complete: () => Unit): ISearchPaneSuggestionsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestDeferral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchPaneSuggestionsRequestDeferral] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
  }
}
