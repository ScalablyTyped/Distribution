package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneQueryLinguisticDetails extends js.Object {
  var queryTextAlternatives: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var queryTextCompositionLength: scala.Double
  var queryTextCompositionStart: scala.Double
}

object ISearchPaneQueryLinguisticDetails {
  @scala.inline
  def apply(
    queryTextAlternatives: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String],
    queryTextCompositionLength: scala.Double,
    queryTextCompositionStart: scala.Double
  ): ISearchPaneQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("queryTextAlternatives")(queryTextAlternatives)
    __obj.updateDynamic("queryTextCompositionLength")(queryTextCompositionLength)
    __obj.updateDynamic("queryTextCompositionStart")(queryTextCompositionStart)
    __obj.asInstanceOf[ISearchPaneQueryLinguisticDetails]
  }
}

