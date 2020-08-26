package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

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
}

