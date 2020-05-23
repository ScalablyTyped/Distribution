package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to specify the query options when searching for contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryOptions")
@js.native
/** Initializes a new instance of the ContactQueryOptions class. */
class ContactQueryOptions ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryOptions {
  /**
    * Initializes a new instance of the ContactQueryOptions class.
    * @param text The text to match in the search operation.
    */
  def this(text: String) = this()
  /**
    * Initializes a new instance of the ContactQueryOptions class.
    * @param text The text to match in the search operation.
    * @param fields Specifies which contact fields to search for a match.
    */
  def this(text: String, fields: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields) = this()
  /** Gets a list to which you can add ContactAnnotationList.Id values for which to search. */
  /* CompleteClass */
  override var annotationListIds: IVector[String] = js.native
  /** Gets a list to which you can add ContactList.Id values for which to search. */
  /* CompleteClass */
  override var contactListIds: IVector[String] = js.native
  /** Gets or sets the desired fields a contact must have to match the query. */
  /* CompleteClass */
  override var desiredFields: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields = js.native
  /** Gets or sets the desired annotation operations a contact must have to match the query. */
  /* CompleteClass */
  override var desiredOperations: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAnnotationOperations = js.native
  /** Gets or sets a Boolean value indicating if the query results should include contacts from lists that are not shown in the user interface. */
  /* CompleteClass */
  override var includeContactsFromHiddenLists: Boolean = js.native
  /** Gets a ContactQueryTextSearch object that can be used for text searches. */
  /* CompleteClass */
  override var textSearch: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryTextSearch = js.native
}

