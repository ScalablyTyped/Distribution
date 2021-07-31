package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the options selected for an email mailbox query. */
trait EmailQueryOptions extends StObject {
  
  /** Gets the identifiers for the folders in which to search. */
  var folderIds: IVector[String]
  
  /** Gets or sets the kind of emails for which to query. */
  var kind: EmailQueryKind
  
  /** Gets or sets the direction of the sort for the query results. */
  var sortDirection: EmailQuerySortDirection
  
  /** Gets or sets a Boolean value indicating whether the query results should be sorted. */
  var sortProperty: EmailQuerySortProperty
  
  /** Gets the text to search for. */
  var textSearch: EmailQueryTextSearch
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
  implicit class EmailQueryOptionsMutableBuilder[Self <: EmailQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolderIds(value: IVector[String]): Self = StObject.set(x, "folderIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: EmailQueryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirection(value: EmailQuerySortDirection): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortProperty(value: EmailQuerySortProperty): Self = StObject.set(x, "sortProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextSearch(value: EmailQueryTextSearch): Self = StObject.set(x, "textSearch", value.asInstanceOf[js.Any])
  }
}
