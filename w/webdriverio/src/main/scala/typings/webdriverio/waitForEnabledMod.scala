package typings.webdriverio

import typings.webdriverio.typesMod.WaitForOptions
import typings.webdriverio.webdriverioBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForEnabledMod {
  
  @JSImport("webdriverio/build/commands/element/waitForEnabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[`true` | Unit]]
  inline def default(hasTimeoutIntervalReverseTimeoutMsg: WaitForOptions): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTimeoutIntervalReverseTimeoutMsg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
}
