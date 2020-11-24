package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchPaneQueryLinguisticDetails extends js.Object {
  
  var queryTextAlternatives: IVectorView[String] = js.native
  
  var queryTextCompositionLength: Double = js.native
  
  var queryTextCompositionStart: Double = js.native
}
object ISearchPaneQueryLinguisticDetails {
  
  @scala.inline
  def apply(
    queryTextAlternatives: IVectorView[String],
    queryTextCompositionLength: Double,
    queryTextCompositionStart: Double
  ): ISearchPaneQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal(queryTextAlternatives = queryTextAlternatives.asInstanceOf[js.Any], queryTextCompositionLength = queryTextCompositionLength.asInstanceOf[js.Any], queryTextCompositionStart = queryTextCompositionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneQueryLinguisticDetails]
  }
  
  @scala.inline
  implicit class ISearchPaneQueryLinguisticDetailsOps[Self <: ISearchPaneQueryLinguisticDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQueryTextAlternatives(value: IVectorView[String]): Self = this.set("queryTextAlternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextCompositionLength(value: Double): Self = this.set("queryTextCompositionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextCompositionStart(value: Double): Self = this.set("queryTextCompositionStart", value.asInstanceOf[js.Any])
  }
}
