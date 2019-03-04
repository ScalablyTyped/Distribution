package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneQuerySubmittedEventArgs extends js.Object {
  var language: java.lang.String
  var queryText: java.lang.String
}

object ISearchPaneQuerySubmittedEventArgs {
  @scala.inline
  def apply(language: java.lang.String, queryText: java.lang.String): ISearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language, queryText = queryText)
  
    __obj.asInstanceOf[ISearchPaneQuerySubmittedEventArgs]
  }
}

