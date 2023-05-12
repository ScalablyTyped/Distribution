package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.permissions.AnyPermissions
import typings.thunderbirdWebextBrowser.messenger.permissions.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permissions {
  
  @JSGlobal("messenger.permissions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains(permissions: AnyPermissions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("contains")(permissions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getAll(): js.Promise[AnyPermissions] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[AnyPermissions]]
  
  @JSGlobal("messenger.permissions.onAdded")
  @js.native
  val onAdded: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = js.native
  
  @JSGlobal("messenger.permissions.onRemoved")
  @js.native
  val onRemoved: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = js.native
  
  inline def remove(permissions: Permissions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(permissions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def request(permissions: Permissions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(permissions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
