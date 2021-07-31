package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the options selected for an email mailbox query. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQueryOptions")
@js.native
/** Instantiates a new instance of the EmailQueryOptions class. */
class EmailQueryOptions ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailQueryOptions {
  /**
    * Instantiates a new instance of the EmailQueryOptions class.
    * @param text The text for which to search.
    */
  def this(text: String) = this()
  /**
    * Instantiates a new instance of the EmailQueryOptions class.
    * @param text The text for which to search.
    * @param fields The fields against which to search.
    */
  def this(text: String, fields: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySearchFields) = this()
  
  /** Gets the identifiers for the folders in which to search. */
  /* CompleteClass */
  var folderIds: IVector[String] = js.native
  
  /** Gets or sets the kind of emails for which to query. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQueryKind = js.native
  
  /** Gets or sets the direction of the sort for the query results. */
  /* CompleteClass */
  var sortDirection: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySortDirection = js.native
  
  /** Gets or sets a Boolean value indicating whether the query results should be sorted. */
  /* CompleteClass */
  var sortProperty: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQuerySortProperty = js.native
  
  /** Gets the text to search for. */
  /* CompleteClass */
  var textSearch: typings.winrtUwp.Windows.ApplicationModel.Email.EmailQueryTextSearch = js.native
}
