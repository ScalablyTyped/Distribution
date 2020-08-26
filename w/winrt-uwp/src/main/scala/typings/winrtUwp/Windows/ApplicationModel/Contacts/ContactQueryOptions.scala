package typings.winrtUwp.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to specify the query options when searching for contacts. */
@js.native
trait ContactQueryOptions extends js.Object {
  /** Gets a list to which you can add ContactAnnotationList.Id values for which to search. */
  var annotationListIds: IVector[String] = js.native
  /** Gets a list to which you can add ContactList.Id values for which to search. */
  var contactListIds: IVector[String] = js.native
  /** Gets or sets the desired fields a contact must have to match the query. */
  var desiredFields: ContactQueryDesiredFields = js.native
  /** Gets or sets the desired annotation operations a contact must have to match the query. */
  var desiredOperations: ContactAnnotationOperations = js.native
  /** Gets or sets a Boolean value indicating if the query results should include contacts from lists that are not shown in the user interface. */
  var includeContactsFromHiddenLists: Boolean = js.native
  /** Gets a ContactQueryTextSearch object that can be used for text searches. */
  var textSearch: ContactQueryTextSearch = js.native
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
  @scala.inline
  implicit class ContactQueryOptionsOps[Self <: ContactQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotationListIds(value: IVector[String]): Self = this.set("annotationListIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setContactListIds(value: IVector[String]): Self = this.set("contactListIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredFields(value: ContactQueryDesiredFields): Self = this.set("desiredFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredOperations(value: ContactAnnotationOperations): Self = this.set("desiredOperations", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeContactsFromHiddenLists(value: Boolean): Self = this.set("includeContactsFromHiddenLists", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextSearch(value: ContactQueryTextSearch): Self = this.set("textSearch", value.asInstanceOf[js.Any])
  }
  
}

