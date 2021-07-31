package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a text search query in an email mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQueryTextSearch")
@js.native
abstract class EmailQueryTextSearch ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailQueryTextSearch {
  
  /** Gets or sets the fields for an email text search query. */
  /* CompleteClass */
  var fields: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields = js.native
  
  /** Gets or sets the scope for an email text search query. */
  /* CompleteClass */
  var searchScope: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchScope = js.native
  
  /** Gets or sets the text string for an email text search query. */
  /* CompleteClass */
  var text: String = js.native
}
