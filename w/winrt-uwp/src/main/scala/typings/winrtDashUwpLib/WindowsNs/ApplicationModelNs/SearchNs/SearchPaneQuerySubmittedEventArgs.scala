package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a querysubmitted event that is associated with a searchPane instance. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs")
@js.native
abstract class SearchPaneQuerySubmittedEventArgs () extends js.Object {
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: java.lang.String = js.native
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  /** The text that was submitted through the search pane. */
  var queryText: java.lang.String = js.native
}

