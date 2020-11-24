package typings.winrtUwp.global.Windows.Services.Store

import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides members you can use to access and manage Windows Store-related data for the current app. For example, you can use members of this class to get Windows Store listing and license info for the current app, purchase the current app or products that are offered by the app, or download and install package updates for the app. */
@JSGlobal("Windows.Services.Store.StoreContext")
@js.native
abstract class StoreContext ()
  extends typings.winrtUwp.Windows.Services.Store.StoreContext
/* static members */
@JSGlobal("Windows.Services.Store.StoreContext")
@js.native
object StoreContext extends js.Object {
  
  /**
    * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the current user in the context of the current app.
    * @return An object that you can use to access and manage Windows Store-related data for the current user.
    */
  def getDefault(): typings.winrtUwp.Windows.Services.Store.StoreContext = js.native
  
  /**
    * Gets a StoreContext object that can be used to access and manage Windows Store-related data for the specified user in the context of the current app.
    * @param user An object that identifies the user whose Windows Store-related data you want to access and manage.
    * @return An object that you can use to access and manage Windows Store-related data for the specified user.
    */
  def getForUser(user: User): typings.winrtUwp.Windows.Services.Store.StoreContext = js.native
}
