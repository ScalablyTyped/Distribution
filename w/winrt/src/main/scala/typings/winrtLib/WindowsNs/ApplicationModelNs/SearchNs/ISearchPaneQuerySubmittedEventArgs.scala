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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("queryText")(queryText)
    __obj.asInstanceOf[ISearchPaneQuerySubmittedEventArgs]
  }
}

