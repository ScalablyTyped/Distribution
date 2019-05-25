package typings
package webdriverioLib.WebdriverIOAsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in keyof webdriverio.BrowserPromise ]: webdriver.WrapWithPromise<webdriverio.BrowserPromise[K], std.ReturnType<webdriverio.BrowserPromise[K]>>}
- Dropped {[ P in 'addCommand' | 'options' ]: any[P]} */ @js.native
trait Browser
  extends webdriverioLib.AsyncSelectors {
  def waitUntil(condition: js.Function0[js.Promise[scala.Boolean]]): js.Promise[scala.Boolean] = js.native
  def waitUntil(condition: js.Function0[js.Promise[scala.Boolean]], timeout: scala.Double): js.Promise[scala.Boolean] = js.native
  def waitUntil(
    condition: js.Function0[js.Promise[scala.Boolean]],
    timeout: scala.Double,
    timeoutMsg: java.lang.String
  ): js.Promise[scala.Boolean] = js.native
  def waitUntil(
    condition: js.Function0[js.Promise[scala.Boolean]],
    timeout: scala.Double,
    timeoutMsg: java.lang.String,
    interval: scala.Double
  ): js.Promise[scala.Boolean] = js.native
}

