package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the options selected for an email mailbox query. */
@js.native
trait EmailQueryOptions extends js.Object {
  
  /** Gets the identifiers for the folders in which to search. */
  var folderIds: IVector[String] = js.native
  
  /** Gets or sets the kind of emails for which to query. */
  var kind: EmailQueryKind = js.native
  
  /** Gets or sets the direction of the sort for the query results. */
  var sortDirection: EmailQuerySortDirection = js.native
  
  /** Gets or sets a Boolean value indicating whether the query results should be sorted. */
  var sortProperty: EmailQuerySortProperty = js.native
  
  /** Gets the text to search for. */
  var textSearch: EmailQueryTextSearch = js.native
}
object EmailQueryOptions {
  
  @scala.inline
  def apply(
    folderIds: IVector[String],
    kind: EmailQueryKind,
    sortDirection: EmailQuerySortDirection,
    sortProperty: EmailQuerySortProperty,
    textSearch: EmailQueryTextSearch
  ): EmailQueryOptions = {
    val __obj = js.Dynamic.literal(folderIds = folderIds.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any], sortProperty = sortProperty.asInstanceOf[js.Any], textSearch = textSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailQueryOptions]
  }
  
  @scala.inline
  implicit class EmailQueryOptionsOps[Self <: EmailQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setFolderIds(value: IVector[String]): Self = this.set("folderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: EmailQueryKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirection(value: EmailQuerySortDirection): Self = this.set("sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortProperty(value: EmailQuerySortProperty): Self = this.set("sortProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSearch(value: EmailQueryTextSearch): Self = this.set("textSearch", value.asInstanceOf[js.Any])
  }
}
