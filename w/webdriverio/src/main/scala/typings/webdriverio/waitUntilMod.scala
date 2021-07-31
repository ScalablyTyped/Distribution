package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitUntilMod {
  
  @JSImport("webdriverio/build/commands/browser/waitUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(condition: js.Function0[Boolean | js.Promise[Boolean]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def default(
    condition: js.Function0[Boolean | js.Promise[Boolean]],
    hasTimeoutIntervalTimeoutMsg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.WaitUntilOptions */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], hasTimeoutIntervalTimeoutMsg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
