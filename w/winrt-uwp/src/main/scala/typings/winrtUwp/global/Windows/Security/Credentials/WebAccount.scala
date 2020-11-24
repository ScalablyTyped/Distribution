package typings.winrtUwp.global.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies an account from a web account provider. */
@JSGlobal("Windows.Security.Credentials.WebAccount")
@js.native
class WebAccount protected ()
  extends typings.winrtUwp.Windows.Security.Credentials.WebAccount {
  /**
    * Creates an instance of the WebAccount class.
    * @param webAccountProvider The web account provider associated with the web account.
    * @param userName The user name of the web account.
    * @param state The state of the web account.
    */
  def this(
    webAccountProvider: typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider,
    userName: String,
    state: typings.winrtUwp.Windows.Security.Credentials.WebAccountState
  ) = this()
}
