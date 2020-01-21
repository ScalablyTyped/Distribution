package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about query text that the user enters through an Input Method Editor (IME). */
@JSGlobal("Windows.ApplicationModel.Search.SearchQueryLinguisticDetails")
@js.native
class SearchQueryLinguisticDetails protected () extends js.Object {
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
  /** A list of the text alternatives for the current query text. These alternatives account for uncomposed text the user is entering in an IME. */
  var queryTextAlternatives: IVectorView[String] = js.native
  /** The length of the portion of the query text that the user is composing with an Input Method Editor (IME). */
  var queryTextCompositionLength: Double = js.native
  /** The starting location of the text that the user is composing with an Input Method Editor (IME). */
  var queryTextCompositionStart: Double = js.native
}

