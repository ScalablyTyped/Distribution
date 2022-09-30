package typings.updateNotifier

import typings.updateNotifier.updateNotifierMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("update-notifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): typings.updateNotifier.updateNotifierMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.updateNotifier.updateNotifierMod.default]
  inline def default(settings: Settings): typings.updateNotifier.updateNotifierMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(settings.asInstanceOf[js.Any]).asInstanceOf[typings.updateNotifier.updateNotifierMod.default]
}
