package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails")
@js.native
class SearchPaneQueryLinguisticDetails () extends ISearchPaneQueryLinguisticDetails {
  /* CompleteClass */
  override var queryTextAlternatives: IVectorView[String] = js.native
  /* CompleteClass */
  override var queryTextCompositionLength: Double = js.native
  /* CompleteClass */
  override var queryTextCompositionStart: Double = js.native
}

