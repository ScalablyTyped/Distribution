package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.anon.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs11 {
  
  @JSGlobal("messenger.pkcs11")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModuleSlots(name: String): js.Promise[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleSlots")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Token]]
  
  inline def installModule(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("installModule")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def installModule(name: String, flags: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("installModule")(name.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def isModuleInstalled(name: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleInstalled")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def uninstallModule(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallModule")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
