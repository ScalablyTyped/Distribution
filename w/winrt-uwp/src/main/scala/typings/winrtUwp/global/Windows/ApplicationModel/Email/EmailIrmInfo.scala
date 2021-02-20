package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents email information rights management (IRM) info. */
@JSGlobal("Windows.ApplicationModel.Email.EmailIrmInfo")
@js.native
/** Initializes a new instance of the EmailIrmInfo class. */
class EmailIrmInfo ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmInfo {
  /**
    * Initializes a new instance of the EmailIrmInfo class using the specified IRM expiration time and template.
    * @param expiration The time when the information rights management (IRM) permissions expire.
    * @param irmTemplate The IRM template to apply to the message.
    */
  def this(expiration: Date, irmTemplate: typings.winrtUwp.Windows.ApplicationModel.Email.EmailIrmTemplate) = this()
}
