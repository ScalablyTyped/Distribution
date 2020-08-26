package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about query text that the user enters through an Input Method Editor (IME). */
@js.native
trait SearchPaneQueryLinguisticDetails extends js.Object {
  /** A list of the text alternatives for the current query text. These alternatives account for uncomposed text the user is entering in an IME. */
  var queryTextAlternatives: IVectorView[String] = js.native
  /** The length of the portion of the query text that the user is composing with an Input Method Editor (IME). */
  var queryTextCompositionLength: Double = js.native
  /** The starting location of the text that the user is composing with an Input Method Editor (IME). */
  var queryTextCompositionStart: Double = js.native
}

object SearchPaneQueryLinguisticDetails {
  @scala.inline
  def apply(
    queryTextAlternatives: IVectorView[String],
    queryTextCompositionLength: Double,
    queryTextCompositionStart: Double
  ): SearchPaneQueryLinguisticDetails = {
    val __obj = js.Dynamic.literal(queryTextAlternatives = queryTextAlternatives.asInstanceOf[js.Any], queryTextCompositionLength = queryTextCompositionLength.asInstanceOf[js.Any], queryTextCompositionStart = queryTextCompositionStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQueryLinguisticDetails]
  }
  @scala.inline
  implicit class SearchPaneQueryLinguisticDetailsOps[Self <: SearchPaneQueryLinguisticDetails] (val x: Self) extends AnyVal {
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

