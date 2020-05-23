package typings.winrtUwp.global.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a querychanged event that is associated with a searchPane object. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs")
@js.native
abstract class SearchPaneQueryChangedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs {
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  /* CompleteClass */
  override var language: String = js.native
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  /* CompleteClass */
  override var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
  /** The text in the search box when the querychanged event fired. */
  /* CompleteClass */
  override var queryText: String = js.native
}

