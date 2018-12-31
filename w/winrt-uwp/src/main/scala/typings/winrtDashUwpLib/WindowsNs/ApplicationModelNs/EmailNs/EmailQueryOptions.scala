package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the options selected for an email mailbox query. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQueryOptions")
@js.native
/** Instantiates a new instance of the EmailQueryOptions class. */
class EmailQueryOptions () extends js.Object {
  /**
    * Instantiates a new instance of the EmailQueryOptions class.
    * @param text The text for which to search.
    */
  def this(text: java.lang.String) = this()
  /**
    * Instantiates a new instance of the EmailQueryOptions class.
    * @param text The text for which to search.
    * @param fields The fields against which to search.
    */
  def this(text: java.lang.String, fields: EmailQuerySearchFields) = this()
  /** Gets the identifiers for the folders in which to search. */
  var folderIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the kind of emails for which to query. */
  var kind: EmailQueryKind = js.native
  /** Gets or sets the direction of the sort for the query results. */
  var sortDirection: EmailQuerySortDirection = js.native
  /** Gets or sets a Boolean value indicating whether the query results should be sorted. */
  var sortProperty: EmailQuerySortProperty = js.native
  /** Gets the text to search for. */
  var textSearch: EmailQueryTextSearch = js.native
}

