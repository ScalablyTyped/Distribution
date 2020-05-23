package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about query text that the user enters through an Input Method Editor (IME). */
trait SearchQueryLinguisticDetails extends js.Object {
  /** A list of the text alternatives for the current query text. These alternatives account for uncomposed text the user is entering in an IME. */
  var queryTextAlternatives: IVectorView[String]
  /** The length of the portion of the query text that the user is composing with an Input Method Editor (IME). */
  var queryTextCompositionLength: Double
  /** The starting location of the text that the user is composing with an Input Method Editor (IME). */
  var queryTextCompositionStart: Double
}

object SearchQueryLinguisticDetails {
  @scala.inline
  def apply(
    queryTextAlternatives: IVectorView[String],
    queryTextCompositionLength: Double,
    queryTextCompositionStart: Double
  ): SearchQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal(queryTextAlternatives = queryTextAlternatives.asInstanceOf[js.Any], queryTextCompositionLength = queryTextCompositionLength.asInstanceOf[js.Any], queryTextCompositionStart = queryTextCompositionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQueryLinguisticDetails]
  }
}

