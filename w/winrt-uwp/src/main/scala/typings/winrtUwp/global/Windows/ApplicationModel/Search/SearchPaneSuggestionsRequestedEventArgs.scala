package typings.winrtUwp.global.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a suggestionsrequested event that is associated with a searchPane object. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs")
@js.native
abstract class SearchPaneSuggestionsRequestedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs {
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  /* CompleteClass */
  override var language: String = js.native
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  /* CompleteClass */
  override var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
  /** The text that the app should provide suggestions for and that was in the search box when the suggestionsrequested event fired. */
  /* CompleteClass */
  override var queryText: String = js.native
  /** An object that stores suggestions and information about the request. */
  /* CompleteClass */
  override var request: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest = js.native
}

