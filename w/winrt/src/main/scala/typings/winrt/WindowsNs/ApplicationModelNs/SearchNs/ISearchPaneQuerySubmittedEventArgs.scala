package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneQuerySubmittedEventArgs extends js.Object {
  var language: String
  var queryText: String
}

object ISearchPaneQuerySubmittedEventArgs {
  @scala.inline
  def apply(language: String, queryText: String): ISearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language, queryText = queryText)
  
    __obj.asInstanceOf[ISearchPaneQuerySubmittedEventArgs]
  }
}

