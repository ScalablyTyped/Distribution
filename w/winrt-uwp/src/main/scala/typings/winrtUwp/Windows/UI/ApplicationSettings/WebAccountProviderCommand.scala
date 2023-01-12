package typings.winrtUwp.Windows.UI.ApplicationSettings

import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Associates a provider command with a WebAccountProvider in the account settings pane. */
trait WebAccountProviderCommand extends StObject {
  
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  def invoked(command: WebAccountProviderCommand): Unit
  /** Gets the delegate that's invoked when the user selects an account and a specific action in the accounts pane. */
  @JSName("invoked")
  var invoked_Original: WebAccountProviderCommandInvokedHandler
  
  /** Gets the web account provider that's associated with the current command. */
  var webAccountProvider: WebAccountProvider
}
object WebAccountProviderCommand {
  
  inline def apply(invoked: /* command */ WebAccountProviderCommand => Unit, webAccountProvider: WebAccountProvider): WebAccountProviderCommand = {
    val __obj = js.Dynamic.literal(invoked = js.Any.fromFunction1(invoked), webAccountProvider = webAccountProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAccountProviderCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebAccountProviderCommand] (val x: Self) extends AnyVal {
    
    inline def setInvoked(value: /* command */ WebAccountProviderCommand => Unit): Self = StObject.set(x, "invoked", js.Any.fromFunction1(value))
    
    inline def setWebAccountProvider(value: WebAccountProvider): Self = StObject.set(x, "webAccountProvider", value.asInstanceOf[js.Any])
  }
}
