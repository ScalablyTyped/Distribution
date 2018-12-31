package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to specify the query options when searching for contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryOptions")
@js.native
/** Initializes a new instance of the ContactQueryOptions class. */
class ContactQueryOptions () extends js.Object {
  /**
    * Initializes a new instance of the ContactQueryOptions class.
    * @param text The text to match in the search operation.
    */
  def this(text: java.lang.String) = this()
  /**
    * Initializes a new instance of the ContactQueryOptions class.
    * @param text The text to match in the search operation.
    * @param fields Specifies which contact fields to search for a match.
    */
  def this(text: java.lang.String, fields: ContactQuerySearchFields) = this()
  /** Gets a list to which you can add ContactAnnotationList.Id values for which to search. */
  var annotationListIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets a list to which you can add ContactList.Id values for which to search. */
  var contactListIds: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the desired fields a contact must have to match the query. */
  var desiredFields: ContactQueryDesiredFields = js.native
  /** Gets or sets the desired annotation operations a contact must have to match the query. */
  var desiredOperations: ContactAnnotationOperations = js.native
  /** Gets or sets a Boolean value indicating if the query results should include contacts from lists that are not shown in the user interface. */
  var includeContactsFromHiddenLists: scala.Boolean = js.native
  /** Gets a ContactQueryTextSearch object that can be used for text searches. */
  var textSearch: ContactQueryTextSearch = js.native
}

