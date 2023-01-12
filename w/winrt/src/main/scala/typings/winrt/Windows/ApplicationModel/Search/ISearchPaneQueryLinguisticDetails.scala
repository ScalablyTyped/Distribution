package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneQueryLinguisticDetails extends StObject {
  
  var queryTextAlternatives: IVectorView[String]
  
  var queryTextCompositionLength: Double
  
  var queryTextCompositionStart: Double
}
object ISearchPaneQueryLinguisticDetails {
  
  inline def apply(
    queryTextAlternatives: IVectorView[String],
    queryTextCompositionLength: Double,
    queryTextCompositionStart: Double
  ): ISearchPaneQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal(queryTextAlternatives = queryTextAlternatives.asInstanceOf[js.Any], queryTextCompositionLength = queryTextCompositionLength.asInstanceOf[js.Any], queryTextCompositionStart = queryTextCompositionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneQueryLinguisticDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchPaneQueryLinguisticDetails] (val x: Self) extends AnyVal {
    
    inline def setQueryTextAlternatives(value: IVectorView[String]): Self = StObject.set(x, "queryTextAlternatives", value.asInstanceOf[js.Any])
    
    inline def setQueryTextCompositionLength(value: Double): Self = StObject.set(x, "queryTextCompositionLength", value.asInstanceOf[js.Any])
    
    inline def setQueryTextCompositionStart(value: Double): Self = StObject.set(x, "queryTextCompositionStart", value.asInstanceOf[js.Any])
  }
}
