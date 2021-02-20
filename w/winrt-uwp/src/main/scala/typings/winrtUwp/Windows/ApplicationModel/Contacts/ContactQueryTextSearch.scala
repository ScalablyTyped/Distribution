package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies parameters to use in a text search of Contact objects. */
@js.native
trait ContactQueryTextSearch extends StObject {
  
  /** Gets or sets which contact fields to search for a text match. */
  var fields: ContactQuerySearchFields = js.native
  
  /** Gets or sets a value that specifies either a local or server search. */
  var searchScope: ContactQuerySearchScope = js.native
  
  /** Gets or sets the text for which to search. */
  var text: String = js.native
}
object ContactQueryTextSearch {
  
  @scala.inline
  def apply(fields: ContactQuerySearchFields, searchScope: ContactQuerySearchScope, text: String): ContactQueryTextSearch = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], searchScope = searchScope.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactQueryTextSearch]
  }
  
  @scala.inline
  implicit class ContactQueryTextSearchMutableBuilder[Self <: ContactQueryTextSearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: ContactQuerySearchFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchScope(value: ContactQuerySearchScope): Self = StObject.set(x, "searchScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
