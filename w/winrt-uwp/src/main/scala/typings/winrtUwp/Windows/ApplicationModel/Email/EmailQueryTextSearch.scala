package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a text search query in an email mailbox. */
trait EmailQueryTextSearch extends StObject {
  
  /** Gets or sets the fields for an email text search query. */
  var fields: EmailQuerySearchFields
  
  /** Gets or sets the scope for an email text search query. */
  var searchScope: EmailQuerySearchScope
  
  /** Gets or sets the text string for an email text search query. */
  var text: String
}
object EmailQueryTextSearch {
  
  @scala.inline
  def apply(fields: EmailQuerySearchFields, searchScope: EmailQuerySearchScope, text: String): EmailQueryTextSearch = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], searchScope = searchScope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailQueryTextSearch]
  }
  
  @scala.inline
  implicit class EmailQueryTextSearchMutableBuilder[Self <: EmailQueryTextSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: EmailQuerySearchFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchScope(value: EmailQuerySearchScope): Self = StObject.set(x, "searchScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
