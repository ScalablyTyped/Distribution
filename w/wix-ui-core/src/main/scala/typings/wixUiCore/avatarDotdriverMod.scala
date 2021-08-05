package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.avatarDotUniDriverMod.AvatarDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/avatar/avatar.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def avatarDriverFactory(base: UniDriver[js.Any]): AvatarDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("avatarDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[AvatarDriver]
}
