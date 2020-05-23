package typings.winrtUwp.global.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a querysubmitted event that is associated with a searchPane instance. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs")
@js.native
abstract class SearchPaneQuerySubmittedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs {
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  /* CompleteClass */
  override var language: String = js.native
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  /* CompleteClass */
  override var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
  /** The text that was submitted through the search pane. */
  /* CompleteClass */
  override var queryText: String = js.native
}

