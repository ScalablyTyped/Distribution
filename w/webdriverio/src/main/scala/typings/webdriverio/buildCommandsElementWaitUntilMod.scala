package typings.webdriverio

import typings.webdriverio.anon.PartialWaitUntilOptions
import typings.webdriverio.webdriverioBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementWaitUntilMod {
  
  @JSImport("webdriverio/build/commands/element/waitUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(condition: js.Function0[Boolean | js.Promise[Boolean]]): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
  inline def default(condition: js.Function0[Boolean | js.Promise[Boolean]], param2: PartialWaitUntilOptions): js.Promise[`true` | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[`true` | Unit]]
}
