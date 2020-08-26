package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the options selected for an email mailbox query. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQueryOptions")
@js.native
/** Instantiates a new instance of the EmailQueryOptions class. */
class EmailQueryOptions ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailQueryOptions {
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
}

