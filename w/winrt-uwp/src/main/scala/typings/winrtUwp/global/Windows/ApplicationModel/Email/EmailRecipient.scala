package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email recipient. */
@JSGlobal("Windows.ApplicationModel.Email.EmailRecipient")
@js.native
/** Initializes an instance of the EmailRecipient class. */
class EmailRecipient ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailRecipient {
  /**
    * Initializes an instance of the EmailRecipient class.
    * @param address The address of the recipient.
    */
  def this(address: String) = this()
  /**
    * Initializes an instance of the EmailRecipient class.
    * @param address The address of the recipient.
    * @param name The name of the recipient.
    */
  def this(address: String, name: String) = this()
  
  /** Gets or sets the address of the email recipient. */
  /* CompleteClass */
  var address: String = js.native
  
  /** Gets or sets the name of the email recipient. */
  /* CompleteClass */
  var name: String = js.native
}
