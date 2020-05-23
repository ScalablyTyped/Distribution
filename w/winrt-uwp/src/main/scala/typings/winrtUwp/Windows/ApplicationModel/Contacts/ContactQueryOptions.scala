package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to specify the query options when searching for contacts. */
trait ContactQueryOptions extends js.Object {
  /** Gets a list to which you can add ContactAnnotationList.Id values for which to search. */
  var annotationListIds: IVector[String]
  /** Gets a list to which you can add ContactList.Id values for which to search. */
  var contactListIds: IVector[String]
  /** Gets or sets the desired fields a contact must have to match the query. */
  var desiredFields: ContactQueryDesiredFields
  /** Gets or sets the desired annotation operations a contact must have to match the query. */
  var desiredOperations: ContactAnnotationOperations
  /** Gets or sets a Boolean value indicating if the query results should include contacts from lists that are not shown in the user interface. */
  var includeContactsFromHiddenLists: Boolean
  /** Gets a ContactQueryTextSearch object that can be used for text searches. */
  var textSearch: ContactQueryTextSearch
}

object ContactQueryOptions {
  @scala.inline
  def apply(
    annotationListIds: IVector[String],
    contactListIds: IVector[String],
    desiredFields: ContactQueryDesiredFields,
    desiredOperations: ContactAnnotationOperations,
    includeContactsFromHiddenLists: Boolean,
    textSearch: ContactQueryTextSearch
  ): ContactQueryOptions = {
    val __obj = js.Dynamic.literal(annotationListIds = annotationListIds.asInstanceOf[js.Any], contactListIds = contactListIds.asInstanceOf[js.Any], desiredFields = desiredFields.asInstanceOf[js.Any], desiredOperations = desiredOperations.asInstanceOf[js.Any], includeContactsFromHiddenLists = includeContactsFromHiddenLists.asInstanceOf[js.Any], textSearch = textSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactQueryOptions]
  }
}

