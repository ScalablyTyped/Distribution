package typings.winrtUwp.global.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about query text that the user enters through an Input Method Editor (IME). */
@JSGlobal("Windows.ApplicationModel.Search.SearchQueryLinguisticDetails")
@js.native
class SearchQueryLinguisticDetails protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails {
  /**
    * Initializes a new instance of the SearchQueryLinguisticDetails class.
    * @param queryTextAlternatives A list of the text alternatives for the current query text.
    * @param queryTextCompositionStart The starting location of the text that the user is composing with an IME.
    * @param queryTextCompositionLength The length of the portion of the query text that the user is composing with an IME.
    */
  def this(
    queryTextAlternatives: IIterable[String],
    queryTextCompositionStart: Double,
    queryTextCompositionLength: Double
  ) = this()
}
