package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneQueryLinguisticDetails extends js.Object {
  var queryTextAlternatives: IVectorView[String]
  var queryTextCompositionLength: Double
  var queryTextCompositionStart: Double
}

object ISearchPaneQueryLinguisticDetails {
  @scala.inline
  def apply(
    queryTextAlternatives: IVectorView[String],
    queryTextCompositionLength: Double,
    queryTextCompositionStart: Double
  ): ISearchPaneQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal(queryTextAlternatives = queryTextAlternatives, queryTextCompositionLength = queryTextCompositionLength, queryTextCompositionStart = queryTextCompositionStart)
  
    __obj.asInstanceOf[ISearchPaneQueryLinguisticDetails]
  }
}

